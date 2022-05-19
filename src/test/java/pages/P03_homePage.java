package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinition.Hooks;

import java.util.List;

public class P03_homePage {

    public WebElement slider(String sliderNum) {

        WebElement element = Hooks.driver.findElement(By.xpath("(//a[@href=\"http://demo.nopcommerce.com/\"])[" + sliderNum + "]"));
        return element;
    }

    public List<WebElement> wishListBTN() {

        return Hooks.driver.findElements(By.cssSelector("Button[class=\"button-2 add-to-wishlist-button\"]"));

    }
    public WebElement currency ()
    {
        WebElement element =Hooks.driver.findElement(By.xpath("//option[@value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]"));
        return element;
    }
    public WebElement search()
    {
        WebElement element=Hooks.driver.findElement(By.id("small-searchterms"));
        return element;
    }
    public WebElement category()
    {
        WebElement element=Hooks.driver.findElement(By.xpath("(//a[@href=\"/computers\"])[1]"));
        return element;
    }

    public WebElement follow()
    {
        WebElement element= Hooks.driver.findElement(By.xpath("//a[@href=\"http://www.facebook.com/nopCommerce\"]"));
        return element;
    }

    public WebElement shopping()
    {
        return  Hooks.driver.findElement(By.xpath("(//button[@type=\"button\"])[8]"));
    }
}