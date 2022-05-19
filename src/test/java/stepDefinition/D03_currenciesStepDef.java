package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.P03_homePage;

public class D03_currenciesStepDef {

    P03_homePage home = new P03_homePage();
    @When("user select Euro Currency")
    public void select_Euro() throws InterruptedException {
        home.currency().click();
        Thread.sleep(2000);
    }

    @Then("item Prices displayed with Euro Currency")
    public void Euro_displayed() throws InterruptedException {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
        Thread.sleep(4000);
        Hooks.driver.findElement(By.xpath("(//span[@class=\"price actual-price\"])[1]")).isDisplayed();
    }

    @When("user select Dollar Currency")
    public void select_Dollar() throws InterruptedException {
        Hooks.driver.findElement(By.xpath("//option[@ value=\"https://demo.nopcommerce.com/changecurrency/1?returnUrl=%2F\"]")).click();
        Thread.sleep(2000);
    }

    @Then("item Prices displayed with Dollar Currency")
    public void Dollar_displayed() throws InterruptedException {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
        Thread.sleep(4000);
        Hooks.driver.findElement(By.xpath("(//span[@class=\"price actual-price\"])[1]")).isDisplayed();
    }

}
