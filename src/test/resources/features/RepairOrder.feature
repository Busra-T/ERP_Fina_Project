Feature: EPR Repair order functionality
  Agile Story:As a POS & sales manager, I want to get repair order on the Repairs page.


@106
  Scenario Outline: Verify POS manager can select all the repair orders by clicking the top checkbox
    When Users login with their "<email>" and "<password>"
    Then should see "Odoo" in title
    And click on Repairs
    And click on top checkbox
    Then user sees all orders are checked

  Examples:
    | email                   | password     | login name     |
    | posmanager19@info.com   | posmanager   | POSManager19   |
    | salesmanager25@info.com | salesmanager | SalesManager25 |

