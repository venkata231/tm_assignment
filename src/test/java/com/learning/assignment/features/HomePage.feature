@home @smoke
Feature: Home Navigation 
  I want to navigate to home page to select options

  @homepage
  Scenario: Verify HomePage
    Given As a Customer
    When I visit the thinkmoney website www.thinkmoney.co.uk
    Then I see the thinkmoney homepage
    
