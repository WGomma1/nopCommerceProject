package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.P03_homePage;

public class D04_searchStepDef {
    P03_homePage home =new P03_homePage();
    @When("click on search field in home page and search for Apple product")
    public void click_on_search_field()
    {
      home.search().click();
      Hooks.driver.findElement(By.id("small-searchterms")).sendKeys("Apple");

    }
    @And("click on search tab")
    public void click_search_tab()
    {
     Hooks.driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    }
    @Then("search product page opened")
    public void search_page()
    {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/search?q=Apple");
    }

    @When("click on search field in home page and search sku")
    public void search_sku()
    {
        home.search().click();
        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys("AP_MBP_13");

    }
    @Then("search product page with same sku opened")
    public void sku_page_opened()
    {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/search?q=AP_MBP_13");
    }

}
