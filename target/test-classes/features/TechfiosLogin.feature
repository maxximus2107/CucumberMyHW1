@LoginFeature @Regression
Feature: Techfios billing login page functionality validation

  Background: 
    Given User is on the techfios login page
    When User enters username as "demo@techfios.com"

  @LoginScenario1 @Smoke @Sanity @Test
  Scenario: User should be able to login with valid credentials
    When User enters password as "abc123"
    When User clicks on sign in button
    Then User should land on dashboard page

  @LoginScenario2
  Scenario: User should be able to login with valid credentials
    When User enters password as "abc123"
    When User clicks on sign in button
    Then User should land on dashboard page
  

