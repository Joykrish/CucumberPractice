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

      
      
       #Given I navigate to Carwale website  //precondition needs to be true before execution starts
      # When I click on Menu button of Toyoto //Actions I need to perform
       #And I click on the Homepage URL // can be used as conjunction with additional step
       #Then I should redicted to homePage // expected result or validation
       