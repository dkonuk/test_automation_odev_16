Feature: As a user I want to add records to web table
  This feature includes webtable tests

  Scenario: Add records to web table
    Given Open "Web Table" page
    When Insert a new record to Web Table
    Then New Record Added to Web Table
    When Update the record in Web Table
    Then Record Updated in Web Table



