package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.P02_login;

public class D02_loginStepDef {
    P02_login login =new P02_login();

    @When("user click on login page")
      public void user_click_login_page()
    {
        login.login().click();

    }
    @Then("login page opened")
    public void Login_page_opened()
    {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/login?returnUrl=%2F");
    }

    @And("user insert valid Email and password")
    public void insert_Email_password()
    {
        Hooks.driver.findElement(By.id("Email")).sendKeys("waleed@gamil.com");
        Hooks.driver.findElement(By.id("Password")).sendKeys("P@ssw0rd");

    }
    @And("user click on login tab")
       public void click_on_login_tab()
    {
        Hooks.driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();

    }

    @Then("user back to home page with his account")
      public void back_to_home_page()
    {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
    }

    @And("my account tab is displayed")
    public void my_account_displayed()
    {
        Hooks.driver.findElement(By.xpath("(//a[@href=\"/customer/info\"])[1]")).isDisplayed();
    }

}
