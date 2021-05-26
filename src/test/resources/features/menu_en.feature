# language: en
@en
Feature: Menu

  Scenario Template: Open menu section
    Given the user is on the main page of the site
    When the user clicks on a "<Selection>" in the menu
    Then the user sees the page title "<Page Title>"

    Examples:
      | Selection     | Page Title    |
      | HOME          | Welcome       |
      | Find Owners   | Find Owners   |
      | Veterinarians | Veterinarians |