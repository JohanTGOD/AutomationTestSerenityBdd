@Preconditions
Feature: Check preconditions test

  @Bug
  Scenario Outline: Home page has the search field
    Given Sergey is in the security home page
    When Sergey chooses <Menu Option> option
    Then he should see all menu options
    Examples:
      | Menu Option      |
      | "HOME"           |
      | "ONLINE BANKING" |
      | "FEEDBACK"       |

  Scenario: Check all inputs of the form of Feedback page
    Given Sergey is in the security home page
    When Sergey selects "FEEDBACK" page
    Then he should see all inputs are enable
