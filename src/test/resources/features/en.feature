# language: en
@en
Feature: All

  Scenario Template: Open menu section
    Given the user is on the main page of the site
    When the user clicks on a "<Selection>" in the menu
    Then the user sees the page title "<Page Title>"

    Examples:
      | Selection     | Page Title    |
      | HOME          | Welcome       |
      | Find Owners   | Find Owners   |
      | Veterinarians | Veterinarians |

  Scenario Template: Find Owners
    Given the user is on the Find owners page
    When the user enters the owner name <Owner> in the Last name field
    And the user clicks the "Find Owner" button
    Then the user sees "<Search Result>"

    Examples:
      | Owner | Search Result |
      | "" | List of 10 owners |
      | "Franklin" | Owner card |
      | "George" | Nobody Found |