@NegativeLoginFeature @Regression
Feature: Techfios billing login page functionality validation

  Background: 
    Given User is on the techfios login page

  @NegativeScenario1 @Sanity
  Scenario Outline: User should be able to login with valid credentials
    When User enters username as "<username>"
    When User enters password as "<password>"
    When User clicks on sign in button
    Then User should land on dashboard page

    Examples: 
      | username           | password |
      | demo2@techfios.com | abc123   |
      | demo@techfios.com  | abc1234  |
      | demo2@techfios.com | abc1234  |
      |                    |          |

  @NegativeScenario2 @Smoke
  Scenario: User should be able to login with valid credentials
    When User enters username as "demo@techfios.com"
    When User enters password as "abc123"
    When User clicks on sign in button
    Then User should land on dashboard page

  @NegativeScenario3
  Scenario: User should be able to login with valid credentials
    When User enters username as "demo2@techfios.com"
    When User enters password as "abc1234"
    When User clicks on sign in button
    Then User should land on dashboard page

  @NegativeScenario4 @Smoke
  Scenario: User should be able to login with valid credentials
    When User enters username as ""
    When User enters password as ""
    When User clicks on sign in button
    Then User should land on dashboard page
