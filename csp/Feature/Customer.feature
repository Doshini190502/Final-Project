Feature: Enterprise Customers API Testing

Scenario: Create an enterprise customer
  Given the Enterprise Customers API is available
  When I send a POST request to "/api/enterprise/customers" with the following customer details:
    | customerId | name        | address             |
    | 101        | Customer A  | 123 Main Street     |
    | 102        | Customer B  | 456 Maple Avenue    |
  Then the response status code should be 201
  And the response should contain the created customer details

Scenario: Update an existing enterprise customer
  Given the Enterprise Customers API is available
  And an enterprise customer with ID "101" exists
  When I send a PUT request to "/api/enterprise/customers/101" with the updated customer details:
    | name        | address            |
    | Updated A   | 789 Oak Road       |
  Then the response status code should be 200
  And the response should contain the updated customer details

Scenario: List all enterprise customers
  Given the Enterprise Customers API is available
  When I send a GET request to "/api/enterprise/customers"
  Then the response status code should be 200
  And the response should contain a list of customers

Scenario: View details of a specific enterprise customer
  Given the Enterprise Customers API is available
  And an enterprise customer with ID "102" exists
  When I send a GET request to "/api/enterprise/customers/102"
  Then the response status code should be 200
  And the response should contain the details of the customer
