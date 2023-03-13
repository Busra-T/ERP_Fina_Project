Feature:Documentation page function verification
  Agile Story: As a user, I want to access the documentation page.

  @101
  Scenario Outline: Verify the “Odoo Documentation” message is displayed n a new window and
  4 main document topics are listed.
    When managers login with valid "<email>" and "<password>"
    Then clicks on "<account holder>" name
    And clicks on Documentation
    And user launches to a new window and see Odoo Documentation message
    Then user sees below document topics are listed
      | User Docs            |
      | Install and Maintain |
      | Developer            |
      | Contributing         |
    # it should be Contribute

    Examples:
      | email                   | password     | account holder |
      | posmanager19@info.com   | posmanager   | POSManager19   |
      | salesmanager25@info.com | salesmanager | SalesManager25 |




