package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.P03_homePage;

public class D06_homeSlidersStepDef {
    P03_homePage home = new P03_homePage();

    @When("user click on first slider")
    public void user_click_on_first_slider() throws InterruptedException {
        Thread.sleep(2000);
        home.slider("1").click();

    }

    @Then("relative product for first slider is displayed")
    public void relative_product_displayed() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/iphone_s6");

    }

    @When("user click on second slider")
    public void user_click_on_second_slider() throws InterruptedException {
        Thread.sleep(2000);
        home.slider("2").click();

    }

    @Then("relative product for second slider is displayed")
    public void relative_second_product_displayed() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/nokia-lumia-1020");
    }
}