
Feature: Login Feature - Productin Environment
  In order to perform successfull login 
  As a user 
  I have to enter correct userName and Password in Production Environment
@UAT
  Scenario Outline: Login to the facebook website as a user In Production
    Given user navigates to the facebook website
    When user validates the homepage tittle
    Then user enters "<UserName>" username
    And user enters "<Password>" password
    And user  validates the captcha
    And user clicks on the sign-in buttons
    Examples:
      | UserName | Password |
      | Valid    | Invalid  |
      | Valid    | Valid    |
      | Invalid  | Invalid  |
      | Invalid  | Valid    |
