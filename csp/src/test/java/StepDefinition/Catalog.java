package StepDefinition;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class Catalog {

    @Given("the Catalog API is available")
    public void checkCatalogAPIAvailability() {
        // Code to check if the Catalog API is available (e.g., ping the API)
    }

    @When("I send a GET request to {string}")
    public void sendGETRequest(String endpoint) {
        // Code to send a GET request to the specified endpoint
    }

    @Then("the response status code should be {int}")
    public void checkResponseStatus(int expectedStatusCode) {
        // Code to check if the response status code matches the expected value
    }

    @Then("the response should contain a list of products")
    public void checkResponseContainsProductList() {
        // Code to check if the response contains a list of products
    }

    @When("I send a POST request to {string} with the product information")
    public void sendPOSTRequestWithProductInfo(String endpoint, DataTable productInfo) {
        // Code to extract product information from the DataTable and send a POST request
    }

    @Then("the response should contain the added product details")
    public void checkResponseContainsAddedProductDetails() {
        // Code to check if the response contains the details of the added product
    }

    @Given("there is a product with ID {string}")
    public void getProductWithID(String productId) {
        // Code to get product information using the provided ID (e.g., fetch from the API)
    }

    @When("I send a PUT request to {string} with the updated product information")
    public void sendPUTRequestWithUpdatedProductInfo(String endpoint, DataTable updatedProductInfo) {
        // Code to extract updated product information from the DataTable and send a PUT request
    }

    @Then("the response should contain the updated product details")
    public void checkResponseContainsUpdatedProductDetails() {
        // Code to check if the response contains the details of the updated product
    }

    @When("I send a DELETE request to {string}")
    public void sendDELETERequest(String endpoint) {
        // Code to send a DELETE request to the specified endpoint
    }

    @Then("the response status code should be 204")
    public void checkResponseStatusCode204() {
        // Code to check if the response status code is 204 (No Content)
    }
}
