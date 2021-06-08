@EcommerceTest
Feature: Fill out form in Ecommerce Contact us form test

  Background: : Check that all fields in Contact us form before using it
    Given Sergey is in "ecommerce" home page
    When Sergey chooses contact us option
    Then he should validate all fields of the form

  Scenario Outline: Fill out form of Contact us in ecommerce page
    When Sergey fills out the fields <Subject>, <Email>, <Ordered>, <Message>
    Then he should see confirmation message
    Examples:
      | Subject            | Email             | Ordered   | Message              |
      | "Customer service" | "some@gmail.com"  | "Blouse"  | "I need a black one" |
      | "Webmaster"        | "some2@gmail.com" | "Dresses" | "I need a red one"   |