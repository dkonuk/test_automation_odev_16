Feature: Click feature
  This feature tests the click functionality on the Elements page.

  Scenario: Test clicking the buttons
    Given Open "elements" page
    When Click the "Buttons"
    When Click the "Click Me"
    Then Check the Click Message


