@smoke
  Feature: users will be able to search for products with different parameters
    Scenario: user could search using product name
      When click on search field in home page and search for Apple product
      And click on search tab
      Then search product page opened


    Scenario: user could search using sku
      When click on search field in home page and search sku
      And click on search tab
      Then search product page with same sku opened