Feature: Sales manager module functionality
  Agile Story: As a sales manager, I should be able to access to the different modules.



  @104
  Scenario Outline: Verify managers login with valid credentials, get their account names, and have access to the 19 modules.
    When Users login with their "<email>" and "<password>"
    Then Users see the correct "<account holder name>"
    And should have access to the below modules
      | Discuss         |
      | Calendar        |
      | Notes           |
      | Contacts        |
      | CRM             |
      | Sales           |
      | Website         |
      | Point of Sale   |
      | Purchases       |
      | Inventory       |
      | Repairs         |
      | Invoicing       |
      | Email Marketing |
      | Events          |
      | Employees       |
      | Leaves          |
      | Expenses        |
      | Maintenance     |
      | Dashboards      |

    Examples:
      | email                   | password     | account holder name |
      | salesmanager25@info.com | salesmanager | SalesManager25      |
      | salesmanager10@info.com | salesmanager | SalesManager10      |
