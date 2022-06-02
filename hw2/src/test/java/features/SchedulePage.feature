@SchedulePage
Feature: Schedule Page

  @CheckScheduleInfo
  Scenario: Check Next Race Info
    Given User is on Home page
    When  User clicks Schedule button
    Then  User should see Schedule Page
    When  User clicks Next Round button
    Then  User should see Next Round hero container
    When  User clicks Next Round hero container
    Then  User should see Race Page
    Then  User should see Schedule Info in local time
