Feature: Logowanie do stony
  Scenario: Check  SIGN IN
    Given I open AutomationPractice website
    When I click on SING IN link
    And I input the Email address wioletta.rakowska@gmail.com
    And I input the Password 098890pl
    And I click on Sign in button
    Then I can see User Information

  Scenario: Check  SIGN IN
    Given I open AutomationPractice website
    When I click on SING IN link
    And I input the Email address wioletta.rakowska@gmail.com
    And I input the Password knknnkn
    And I click on Sign in button
    Then I will see error popup

  Scenario: Check  SIGN IN
    Given I open AutomationPractice website
    When I click on SING IN link
    And I input the Email address wioletta.rakowska@gmail.com
    And I click on Sign in button
    Then I will see error popup