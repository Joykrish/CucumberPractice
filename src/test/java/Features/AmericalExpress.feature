Feature: Title of your feature
  I want to use this template for my feature file

  Scenario Outline: Verify user id in the Ameriacan Express login Page
    Given I navigate to American express
    When user clicks on login button
    And user enters userId "<Userid>"
    Then validate user in the login Page

    Examples: 
      | Userid |
      | Deepak |
