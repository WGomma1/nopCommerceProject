package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinition.Hooks;

public class P01_register {
    public WebElement register()
    {
        WebElement element= Hooks.driver.findElement(By.cssSelector("a[href=\"/register?returnUrl=%2F\"]"));
        return element;
    }
}
