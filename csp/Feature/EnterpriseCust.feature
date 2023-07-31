Feature: Orders for Enterprise Customers API Testing

Scenario: Create an order for an enterprise customer
  Given the Orders for Enterprise Customers API is available
  And an enterprise customer with ID "123" exists
  When I send a POST request to "/api/enterprise/customers/123/orders" with the following order details:
    | orderId | product | quantity |
    | 101     | ProductA | 2        |
    | 102     | ProductB | 3        |
  Then the response status code should be 201
  And the response should contain the created order details

Scenario: Modify an existing order for an enterprise customer
  Given the Orders for Enterprise Customers API is available
  And an enterprise customer with ID "123" exists
  And an order with ID "101" exists for the customer "123"
  When I send a PUT request to "/api/enterprise/customers/123/orders/101" with the updated order details:
    | product | quantity |
    | ProductC| 5        |
  Then the response status code should be 200
  And the response should contain the updated order details

Scenario: List orders for an enterprise customer
  Given the Orders for Enterprise Customers API is available
  And an enterprise customer with ID "123" exists
  When I send a GET request to "/api/enterprise/customers/123/orders"
  Then the response status code should be 200
  And the response should contain a list of orders

Scenario: View details of a specific order
  Given the Orders for Enterprise Customers API is available
  And an order with ID "102" exists
  When I send a GET request to "/api/enterprise/orders/102"
  Then the response status code should be 200
  And the response should contain the details of the order
