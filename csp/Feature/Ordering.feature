Feature: Ordering API for Consumer Customer Testing

Scenario: Create an order for a consumer customer
  Given the Ordering API is available
  And a consumer customer with ID "123" exists
  When I send a POST request to "/api/consumer/customers/123/orders" with the following order details:
    | productId | quantity |
    | 101       | 2        |
    | 102       | 1        |
  Then the response status code should be 201
  And the response should contain the created order details

Scenario: Modify an existing order for a consumer customer
  Given the Ordering API is available
  And a consumer customer with ID "456" exists
  And an order with ID "789" exists for the customer "456"
  When I send a PUT request to "/api/consumer/customers/456/orders/789" with the updated order details:
    | productId | quantity |
    | 103       | 4        |
  Then the response status code should be 200
  And the response should contain the updated order details

Scenario: List orders for a consumer customer
  Given the Ordering API is available
  And a consumer customer with ID "123" exists
  When I send a GET request to "/api/consumer/customers/123/orders"
  Then the response status code should be 200
  And the response should contain a list of orders

Scenario: View details of a specific order
  Given the Ordering API is available
  And an order with ID "789" exists
  When I send a GET request to "/api/consumer/orders/789"
  Then the response status code should be 200
  And the response should contain the details of the order

Scenario: View status of a specific order
  Given the Ordering API is available
  And an order with ID "789" exists
  When I send a GET request to "/api/consumer/orders/status/789"
  Then the response status code should be 200
  And the response should contain the status of the order
