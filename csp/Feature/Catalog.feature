Feature: Catalog API Testing

Scenario: Get catalog
  Given the Catalog API is available
  When I send a GET request to "/api/catalog"
  Then the response status code should be 200
  And the response should contain a list of products

Scenario: Add product to the catalog
  Given the Catalog API is available
  And the following product information:
    | name      | price | description          |
    | Product A | 19.99 | This is Product A    |
  When I send a POST request to "/api/catalog" with the product information
  Then the response status code should be 201
  And the response should contain the added product details

Scenario: Update product in the catalog
  Given the Catalog API is available
  And there is a product with ID "123"
  And the following updated product information:
    | name        | price | description              |
    | Updated Pro | 29.99 | This is the updated Pro  |
  When I send a PUT request to "/api/catalog/123" with the updated product information
  Then the response status code should be 200
  And the response should contain the updated product details

Scenario: Delete product from the catalog
  Given the Catalog API is available
  And there is a product with ID "456"
  When I send a DELETE request to "/api/catalog/456"
  Then the response status code should be 204
