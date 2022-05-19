@smoke
  Feature: guest user could add different products to Shopping cart
    Scenario: user add product to shopping cart
      When user click on Add to cart for selected product
      Then success massage is displayed

    Scenario: number of shopping kart item in home page is increased
      When user click on Add to cart for selected product
      Then success massage is displayed
      And user get the number of shopping item after adding product
      Then number of shopping kart item increased