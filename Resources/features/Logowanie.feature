Feature: Logowanie do stony
  Scenario: Successfull Sing In
    Given I open AutomationPractice website
    When I click on SING IN link
    And I input the Email address wioletta.rakowska@gmail.com
    And I input the Password 098890pl
    And I click on Sign in button
    Then I can see User Information

  Scenario: Bad password
    Given I open AutomationPractice website
    When I click on SING IN link
    And I input the Email address wioletta.rakowska@gmail.com
    And I input the Password knknnkn
    And I click on Sign in button
    Then I will see error popup

  Scenario: empty password
    Given I open AutomationPractice website
    When I click on SING IN link
    And I input the Email address wioletta.rakowska@gmail.com
    And I click on Sign in button
    Then I will see error popup

  Scenario: empty email and password
    Given I open AutomationPractice website
    When I click on SING IN link
    And I click on Sign in button
    Then I will see error popup

  Scenario: sign out successful
    Given I open AutomationPractice website
    When I click on SING IN link
    And I input the Email address wioletta.rakowska@gmail.com
    And I input the Password 098890pl
    And I click on Sign in button
    And I click on SIGN OUT link
    Then I see SIGN IN link