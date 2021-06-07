Feature: Searches test

  Scenario Outline: Find products with the same keyword
    Given Sergey is in "ecommerce" home page
    When Sergey looks for <Product_Name> page
    Then he should see products that contains <Product_Name>
    Examples:
      | Product_Name |
      | "Blouse"       |