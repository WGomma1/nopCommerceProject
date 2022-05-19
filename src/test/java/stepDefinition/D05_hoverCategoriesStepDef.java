package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.P03_homePage;

public class D05_hoverCategoriesStepDef {
    P03_homePage home =new P03_homePage();
    @When("user click on first Category")
    public void click_on_first_category()
    {
        home.category().click();
    }
    @Then("selected Category page opened")
        public void page_opened()
    {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/computers");
    }
    @When("user click on second Category")
    public void second_category()
    {
        Hooks.driver.findElement(By.xpath("(//a[@href=\"/electronics\"])[1]")).click();
    }
    @Then("selected second Category page opened")
    public void second_page_opened()
    {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/electronics");
    }
    }
