 @tag
  Feature: Verify Login function in OrangeHRM web application
  Scenario: Successfully login to OrangeHRM web application
    Given User go to OrangeHRM home page
    And User click on the user name field
    When User type test username in username field
    And User click on the password field
    And  User type test password in password field
    Then User click on the loging button
    

  