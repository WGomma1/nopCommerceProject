package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.P03_homePage;

public class D09_ShoppingCartStepDef {
    P03_homePage home = new P03_homePage();
    int number;
    @When("user click on Add to cart for selected product")
    public void click_on_add_to_cart()
    {
       home.shopping().click();
    }
    @Then("success massage is displayed")
    public void success_msg_displayed() throws InterruptedException {
        Assert.assertTrue(Hooks.driver.findElement(By.xpath("//div[@class=\"bar-notification success\"]")).isDisplayed());
        Thread.sleep(3000);
    }

    @And("user get the number of shopping item after adding product")
       public void get_number_shopping()
    {
        String text= Hooks.driver.findElement(By.xpath("//span[@class=\"cart-qty\"]")).getText();
        System.out.println(text);

        text = text.replaceAll("[^0-9]","");
        number= Integer.parseInt(text);
        Assert.assertTrue(number>0);
    }

    @Then("number of shopping kart item increased")
    public void number_increased()
    {
        Assert.assertTrue(number>0);
    }
}
