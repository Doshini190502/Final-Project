Feature: Service Provisioning API Testing

Scenario: Enable wireless service connection
  Given the Service Provisioning API is available
  When I send a POST request to "/api/service/provision" with the following service details:
    | connectionId | serviceType | options           |
    | 101          | Wireless    | { "location": "A" }|
    | 102          | Wireless    | { "location": "B" }|
  Then the response status code should be 201
  And the response should contain the provisioned service details

Scenario: Test a device (QoS)
  Given the Service Provisioning API is available
  And a service with ID "101" exists
  When I send a POST request to "/api/service/test-qos" with the device test details:
    | connectionId | deviceId | testType      |
    | 101          | Device1  | QoS Test      |
    | 101          | Device2  | Speed Test    |
  Then the response status code should be 200
  And the response should contain the test results

Scenario: Disable a connection
  Given the Service Provisioning API is available
  And a service with ID "101" exists
  When I send a PUT request to "/api/service/disable/101"
  Then the response status code should be 200

Scenario: Hold a connection
  Given the Service Provisioning API is available
  And a service with ID "101" exists
  When I send a PUT request to "/api/service/hold/101"
  Then the response status code should be 200

Scenario: Resume a connection
  Given the Service Provisioning API is available
  And a service with ID "101" exists
  When I send a PUT request to "/api/service/resume/101"
  Then the response status code should be 200
