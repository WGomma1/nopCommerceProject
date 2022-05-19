package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.P01_register;

public class D01_registerStepDef {

    P01_register register= new P01_register();
    @When("user click on register tab")
    public void click_on_register_tab() throws InterruptedException {
        register.register().click();
        Thread.sleep(2000);
    }
    @Then("register page should open")
    public void register_page_open()
    {
     Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/register?returnUrl=%2F");
    }
    @And("user fill personal details")
    public void personal_details() throws InterruptedException {
    Hooks.driver.findElement(By.id("gender-male")).click();
    Hooks.driver.findElement(By.id("FirstName")).sendKeys("Waleed");
    Hooks.driver.findElement(By.id("LastName")).sendKeys("Ramadan");
    Hooks.driver.findElement(By.cssSelector("option[value=\"20\"]")).click();
    Hooks.driver.findElement(By.xpath("(//option[@value=\"2\"])[2]")).click();
    Hooks.driver.findElement(By.xpath("//option[@value=\"1986\"]")).click();
    Hooks.driver.findElement(By.id("Email")).sendKeys("waleed@gamil.com");
    Thread.sleep(4000);
    }

    @And("user fill password field")
    public void insert_password()
    {
        Hooks.driver.findElement(By.xpath("(//input[@type=\"password\"])[1]")).sendKeys("P@ssw0rd");
        Hooks.driver.findElement(By.xpath("(//input[@type=\"password\"])[2]")).sendKeys("P@ssw0rd");
    }

    @And("user click on register complete tab")
    public void click_register_tab()
    {
        Hooks.driver.findElement(By.id("register-button")).click();
    }

    @Then("success massage displayed")
    public void success_msg_displayed()
    {
        Hooks.driver.findElement(By.xpath("//div[@class=\"result\"]")).isDisplayed();

    }
}
