Feature: Login into the application
  Scenario: Successful Login
    Given User has an activity account
    When he sends their valid credentials
    Then he should he access to manage his account