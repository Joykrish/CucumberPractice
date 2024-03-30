Feature: Login Staging Feature
  In order to perform successfull login 
  As a user 
  I have to enter correct userName and Password

  Background: 
    Given user navigates to the facebook website
    When user validates the homepage tittle
@Staging
  Scenario: Login to the facebook website as a valid user
    Then user enters "Valid" username
    And user enters "valid" password
    And user clicks on the sign-in buttons

  Scenario: Login to the facebook website as a Invalid user
    Then user enters "Invalid" username
    And user enters "Invalid" password
    And user clicks on the sign-in buttons
