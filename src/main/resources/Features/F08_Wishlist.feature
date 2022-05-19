@smoke
  Feature: user can add products to wishlist
    Scenario: success massage is displayed once add product to wishlist
      When user add product to wishlist
      Then success notification massage is displayed


     Scenario: number of wishlist item in home page is increased
       When user add product to wishlist
       Then success notification massage is displayed
       And user get the number of wishlist item after adding product
       Then number of wishlist item increased

