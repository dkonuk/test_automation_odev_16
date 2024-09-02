Feature: As a user I want to add records to web table
  This feature includes webtable tests

  Scenario: Add records to web table
    Given Open "Web Table" page
    When Insert a new record to Web Table
    Then Check the new record in Web Table