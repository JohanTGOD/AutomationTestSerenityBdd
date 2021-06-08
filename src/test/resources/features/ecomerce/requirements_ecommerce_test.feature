@EcommercePreconditions
Feature: Check Ecommerce preconditions test

  Scenario: Check that all fields in Contact us form before using it
    Given Sergey is in "ecommerce" home page
    When Sergey chooses contact us option
    Then he should validate all fields of the form