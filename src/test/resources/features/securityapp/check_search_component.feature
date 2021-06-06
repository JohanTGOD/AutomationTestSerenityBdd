Feature: Check main navigation

  Scenario Outline: Home page has the search field
    Given Sergey is in the security home page
    When Sergey chooses <Menu Option> option
    Then he should see all menu options
    Examples:
      | Menu Option      |
      | "HOME"           |
      | "ONLINE BANKING" |
      | "FEEDBACK"       |
