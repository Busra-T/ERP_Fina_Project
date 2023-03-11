Feature: Sales page function verification
  Agile Story: As a manager, I should be able to get correct information on the Sales page.

@96
  Scenario Outline: Verify 6 columns in the quotations on the Sales page when the POS & sales managers login.
    When managers login with valid "<email>" and "<password>"
    Then see the correct "<login name>"
    And click on Sales
    Then see below columns in the quotations
      | Quotation Number |
      | Quotation Date   |
      | Customer         |
      | Salesperson      |
      | Total            |
      | Status           |

    Examples:
      | email                   | password     | login name     |
      | posmanager19@info.com   | posmanager   | POSManager19   |
      | salesmanager25@info.com | salesmanager | SalesManager25 |