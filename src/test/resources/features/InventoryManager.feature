Feature: Inventory manager module access verification
  Agile Story: As an Inventory manager, I should be able to access to the main modules.

  @99 @smoke
  Scenario Template: Verify the Inventory managers access to 16 modules.
    When managers login with valid "<email>" and "<password>"
    Then see the correct "<login name>"
    And should have access to below modules
      | Discuss         |
      | Calendar        |
      | Notes           |
      | Contacts        |
      | Website         |
      | Inventory       |
      | Manufacturing   |
      | Repairs         |
      | Invoicing       |
      | Email Marketing |
      | Employees       |
      | Leaves          |
      | Expenses        |
      | Lunch           |
      | Maintenance     |
      | Dashboards      |

    Examples:
      | email          | password         | login name         |
     # | imm10@info.com | inventorymanager | InventoryManager10 |
      | imm25@info.com | inventorymanager | InventoryManager25 |
      | imm26@info.com | inventorymanager | InventoryManager26 |
      | imm27@info.com | inventorymanager | InventoryManager27 |
      | imm40@info.com | inventorymanager | InventoryManager40 |
      | imm45@info.com | inventorymanager | InventoryManager45 |

    # just for 10=> instead of Email marketing, the page has Timesheets