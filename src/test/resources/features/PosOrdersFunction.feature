@regression
Feature: POS order view function
  Agile Story: As a Point of Sale manager (POS), I should be able to view product order.


  Scenario: Verify Action dropdown 2 options: Export and Delete

    When user logged in as POS manager
    And user clicks on Point of Sale
    Then user clicks on orders
    Then user clicks Order Ref checkbox
    Then user sees all orders are checked
    Then user sees the Action dropdown
    And user clicks on Action dropdown
    Then user sees the below options
      | Export |
      | Delete |


