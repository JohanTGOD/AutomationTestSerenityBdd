Feature: Feedback test

  Background:Check the form of Feedback page
    Given Sergey is in the security home page
    When Sergey selects "FEEDBACK" page
    Then he should see all inputs are enable

  Scenario Outline: Fill out form
    When Sergey has to complete the form with <User>, <Email>, <Subject>, <Comments>
    Then he should see a confirmation message
    Examples:
      | User      | Email               | Subject        | Comments                                             |
      | "Captain" | "captain@gmail.com" | "Congratulion" | "goood service"                                      |
      | "Hulk"    | "hulk@gmail.com"    | "Question"     | "Why this page did not work in blackberry cellphone" |
      | "AntMan"  | "AntMan@gmail.com"  | "Impovements"  | "Improve responsive design"                          |