Feature: Expenses manager modules functionality
  Agile Story:  As an Expenses manager, I should be able to access to the different modules.

  @103
  Scenario Outline: Verify the Expenses managers access to 12 modules
    When managers login with valid "<email>" and "<password>"
    Then see the correct "<login name>"
    And should have access to the below modules
      | Discuss     |
      | Calendar    |
      | Notes       |
      | Contacts    |
      | Website     |
      | Events      |
      | Employees   |
      | Leaves      |
      | Expenses    |
      | Lunch       |
      | Maintenance |
      | Dashboards  |
    # website and lunch modules have bugs

    Examples:
      | email                      | password        | login name        |
      | expensesmanager10@info.com | expensesmanager | ExpensesManager10 |
      | expensesmanager25@info.com | expensesmanager | ExpensesManager25 |

