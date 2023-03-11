Feature: Main modules verification
  Agile story: As a POS manager,  I should be able to access to the main modules.

  @98
  Scenario: Verify the POS managers access to 22 modules.
    When POS manager login with valid credentials
      | email    | posmanager25@info.com |
      | password | posmanager            |
    Then should have access to the all modules


