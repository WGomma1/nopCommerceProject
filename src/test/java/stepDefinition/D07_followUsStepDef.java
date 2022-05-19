package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.P03_homePage;

public class D07_followUsStepDef {
    P03_homePage home =new P03_homePage();
    @When("user click on facebook icon")
    public void click_on_facebook() throws InterruptedException {
        home.follow().click();
        Thread.sleep(2000);
    }
    @Then("non commerce facebook page open")
    public void facebook_page_open() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://www.facebook.com/nopCommerce");
    }

    @When("user click on Twitter icon")
    public void click_on_Twitter() throws InterruptedException {
        Hooks.driver.findElement(By.xpath("//a[@href=\"https://twitter.com/nopCommerce\"]")).click();
        Thread.sleep(10000);
    }
    @Then("non commerce Twitter page open")
    public void twitter_page_open() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://twitter.com/nopCommerce");
    }

    @When("user click on rss icon")
    public void click_on_rss() throws InterruptedException {
        Hooks.driver.findElement(By.xpath("//a[@href=\"/news/rss/1\"]")).click();
        Thread.sleep(10000);
    }

    @Then("non commerce rss page open")
    public void rss_page_open() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/news/rss/1");
    }

    @When("user click on youtube icon")
    public void click_on_youtube() throws InterruptedException {
        Hooks.driver.findElement(By.xpath("//a[@href=\"http://www.youtube.com/user/nopCommerce\"]")).click();
        Thread.sleep(10000);
    }
    @Then("non commerce youtube page open")
    public void youtube_page_open() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://www.youtube.com/user/nopCommerce");
    }
}
