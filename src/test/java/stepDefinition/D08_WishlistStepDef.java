package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.P03_homePage;

public class D08_WishlistStepDef {
    P03_homePage home = new P03_homePage();
    int number;
    @When("user add product to wishlist")
    public void user_add_product_to_wishlist() throws InterruptedException {
      home.wishListBTN().get(2).click();
      Thread.sleep(2000);
    }
    @Then("success notification massage is displayed")
    public void success_notification_displayed() throws InterruptedException {
      Assert.assertTrue(Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).isDisplayed());
      Thread.sleep(3000);
    }

    @Then("user get the number of wishlist item after adding product")
    public void wishlist_item()
    {
       String text= Hooks.driver.findElement(By.cssSelector("span[class=\"wishlist-qty\"]")).getText();
        System.out.println(text);

        text = text.replaceAll("[^0-9]","");
        number= Integer.parseInt(text);
       Assert.assertTrue(number>0);

    }

    @Then("number of wishlist item increased")
    public void item_increased()
    {
        Assert.assertTrue(number>0);
    }
}
