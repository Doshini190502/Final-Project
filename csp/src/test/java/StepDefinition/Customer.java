package StepDefinition;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class Customer {

    @Given("the Enterprise Customers API is available")
    public void checkEnterpriseCustomersAPIAvailability() {
        // Code to check if the Enterprise Customers API is available (e.g., ping the API)
    }

    @When("I send a POST request to {string} with the following customer details:")
    public void sendPOSTRequestWithCustomerDetails(String endpoint, DataTable customerDetails) {
        // Code to extract customer details from the DataTable and send a POST request
    }

    @When("I send a PUT request to {string} with the updated customer details:")
    public void sendPUTRequestWithUpdatedCustomerDetails(String endpoint, DataTable updatedCustomerDetails) {
        // Code to extract updated customer details from the DataTable and send a PUT request
    }

    @When("I send a GET request to {string}")
    public void sendGETRequest(String endpoint) {
        // Code to send a GET request to the specified endpoint
    }

    @Then("the response status code should be {int}")
    public void checkResponseStatus(int expectedStatusCode) {
        // Code to check if the response status code matches the expected value
    }

    @Then("the response should contain the created customer details")
    public void checkResponseContainsCreatedCustomerDetails() {
        // Code to check if the response contains the details of the created customer
    }

    @Then("the response should contain the updated customer details")
    public void checkResponseContainsUpdatedCustomerDetails() {
        // Code to check if the response contains the details of the updated customer
    }

    @Then("the response should contain a list of customers")
    public void checkResponseContainsListOfCustomers() {
        // Code to check if the response contains a list of customers
    }

    @Then("the response should contain the details of the customer")
    public void checkResponseContainsCustomerDetails() {
        // Code to check if the response contains the details of the specific customer
    }
}
