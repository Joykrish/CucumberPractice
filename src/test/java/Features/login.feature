@prod
Feature: Login Feature
  In order to perform successfull login 
  As a user 
  I have to enter correct userName and Password

  Scenario Outline: Login to the facebook website as a user
    Given user navigates to the facebook website
    When user validates the homepage tittle
    Then user enters "<UserName>" username
    And user enters "<Password>" password
    And user clicks on the sign-in buttons
    Examples:
      | UserName | Password |
      | Valid    | Invalid  |
      | Valid    | Valid    |
      | Invalid  | Invalid  |
      | Invalid  | Valid    |
