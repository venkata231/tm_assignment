@login @smoke
Feature: Login feature
  I want to login to thinkmoney.co.uk to perform operations

  @mmp
  Scenario: Verify navigation to manage your money page
    Given As a Customer
    When I visit the thinkmoney website www.thinkmoney.co.uk
    When I click the login button
    Then I see the “Manage your money” page

  @loginportal
  Scenario: Verify Navigation to Log In page
    Given As a Customer
    When I visit the thinkmoney website www.thinkmoney.co.uk
    When I click the login button
    When I click the Continue To Login button
    Then I see the Login page
