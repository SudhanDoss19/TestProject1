Feature: Facebook Login Page
  @test1
  Scenario: Verify the user login
    Given Launch the chrome browser and facebook URL
    When Enter the valid username and password
    Then Validate the user credentials
    And Close the browser