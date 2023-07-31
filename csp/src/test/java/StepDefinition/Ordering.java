package StepDefinition;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class Ordering {

    @Given("the Ordering API is available")
    public void checkOrderingAPIAvailability() {
        // Code to check if the Ordering API is available (e.g., ping the API)
    }

    @Given("a consumer customer with ID {string} exists")
    public void createConsumerCustomer(String customerId) {
        // Code to create a consumer customer with the provided ID (e.g., insert into a database)
    }

    @Given("an order with ID {string} exists for the customer {string}")
    public void createOrderForCustomer(String orderId, String customerId) {
        // Code to create an order with the provided ID for the specified customer (e.g., insert into a database)
    }

    @When("I send a POST request to {string} with the following order details:")
    public void sendPOSTRequestWithOrderDetails(String endpoint, DataTable orderDetails) {
        // Code to extract order details from the DataTable and send a POST request
    }

    @When("I send a PUT request to {string} with the updated order details:")
    public void sendPUTRequestWithUpdatedOrderDetails(String endpoint, DataTable updatedOrderDetails) {
        // Code to extract updated order details from the DataTable and send a PUT request
    }

    @When("I send a GET request to {string}")
    public void sendGETRequest(String endpoint) {
        // Code to send a GET request to the specified endpoint
    }

    @Then("the response status code should be {int}")
    public void checkResponseStatus(int expectedStatusCode) {
        // Code to check if the response status code matches the expected value
    }

    @Then("the response should contain the created order details")
    public void checkResponseContainsCreatedOrderDetails() {
        // Code to check if the response contains the details of the created order
    }

    @Then("the response should contain the updated order details")
    public void checkResponseContainsUpdatedOrderDetails() {
        // Code to check if the response contains the details of the updated order
    }

    @Then("the response should contain a list of orders")
    public void checkResponseContainsListOfOrders() {
        // Code to check if the response contains a list of orders
    }

    @Then("the response should contain the details of the order")
    public void checkResponseContainsOrderDetails() {
        // Code to check if the response contains the details of the specific order
    }

    @Then("the response should contain the status of the order")
    public void checkResponseContainsOrderStatus() {
        // Code to check if the response contains the status of the specific order
    }
}
