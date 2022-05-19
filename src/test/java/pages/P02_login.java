package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinition.Hooks;

public class P02_login {
    public WebElement login()
    {
        WebElement element = Hooks.driver.findElement(By.xpath("//a[@href=\"/login?returnUrl=%2F\"]"));
        return element;
    }
}
