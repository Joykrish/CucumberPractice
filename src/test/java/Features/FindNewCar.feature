Feature: Searching new Car
  
  In order to serach new car 
  as  a user 
  I have to navigate to CarWale.com

  Scenario Outline: Finding new cars
    Given I navigate to Carwale website
    When user mousehover to newCars
    Then user clicks on the findnew Cars
    And user clicks on "<carBrand>" car
    And user validates  the car title as "<carTitle>"

    Examples: 
      | carBrand | carTitle    |
      | Toyota   | Toyota Cars |
      | BMW      | BMW Cars    |
