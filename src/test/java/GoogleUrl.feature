Feature: Access Google URL
  Scenario: Verify if google URL is accessible
    Given A chrome browser
    When I access Google URL
    Then I see google page