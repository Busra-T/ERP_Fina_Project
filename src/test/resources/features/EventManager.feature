Feature: Event manager module functionality
  Agile Story: As an Event manager, I want to access to the different modules.

 @102
  Scenario Outline: Verify the Event managers access to 15 modules.
    When managers login with valid "<email>" and "<password>"
    Then see the correct "<login name>"
    And should have access to below modules
      | Discuss     |
      | Calendar    |
      | Notes       |
      | Contacts    |
      | CRM         |
      | Sales       |
      | Website     |
      | Inventory   |
      | Repairs     |
      | Events      |
      | Employees   |
      | Leaves      |
      | Expenses    |
      | Maintenance |
      | Dashboards  |

    Examples:
      | email                       | password         | login name         |
      | eventscrmmanager10@info.com | eventscrmmanager | EventsCRMManager10 |
      | eventscrmmanager25@info.com | eventscrmmanager | EventsCRMManager25 |

