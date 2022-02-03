@checkout @all
Feature: Checkout

  Background:
    Given User is successfully logged in


  Scenario Outline: Order Checkout
    When I click on Item "<item>"
    And I click on ADD TO CART BUTTON
    And I click on shopping cart button
    And I enter the order information "<firstName>","<lastName>","<zip>"
    Then I verify the item name matches "<item>"

    Examples:
      | item                     | firstName | lastName | zip   |  |
      | Sauce Labs Bike Light    | test      | test     | 12345 |  |
      | Sauce Labs Fleece Jacket | test1     | test1    | 25869 |  |
