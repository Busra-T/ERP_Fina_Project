Feature: Repairs page function verification
  Agile Story: As a POS & sales manager, I want to access the Repairs page.

  @97
  Scenario Outline: Verify6 columns on the Repairs page when POS & sales managers login.
    When managers login with valid "<email>" and "<password>"
    Then click on Repairs
    And see below columns in the repairs orders
      | Repair Reference    |
      | Product to Repair   |
      | Customer            |
      | Delivery Address    |
      | Warranty Expiration |
      | Status              |

    Examples:
      | email                   | password     |
      | posmanager25@info.com   | posmanager   |
      | salesmanager32@info.com | salesmanager |

