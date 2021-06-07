@Preconditions
Feature: Check preconditions test

  @Bug
  Scenario Outline: Check that no matter which menu the actor selected, he always will see all the menu options
    Given Sergey is in the security home page
    When Sergey chooses <Menu Option> option
    Then he should see all menu options
    Examples:
      | Menu Option      |
      | "HOME"           |
      | "ONLINE BANKING" |
      | "FEEDBACK"       |

  Scenario: Check that all inputs of the form are enable
    Given Sergey is in the security home page
    When Sergey selects "FEEDBACK" page
    Then he should see all inputs are enable
