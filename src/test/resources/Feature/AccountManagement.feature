Feature: Account management

  Scenario Outline: create an account using a valid email address
    Given I am on create an account page
    When I enter "<Firstname>" "<Lastname>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click on log in
    Then My account page is displayed


    Examples:
      | Firstname | Lastname | Email                | Password | ConfirmPassword |
      | Bobby     | Brown    | Bobbybrown@gmail.com | Music20! | Music20!        |


