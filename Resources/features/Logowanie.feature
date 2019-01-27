Feature: Logowanie do stony
  Scenario: Check  SIGN IN
    Given I open AutomationPractice website
    When I click on SING IN link
    And I input the Email address
    And I input the Password
    And I click on Sign in button
    Then I can see User Information


