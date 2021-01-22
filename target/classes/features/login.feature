Feature: Login user

  Scenario: Login user
    Then Click Log In
    Then Opened page have text  _Welcome Back_ on general area
    Then Input login
    Then Input password
    Then Click Sign in_Submit button
