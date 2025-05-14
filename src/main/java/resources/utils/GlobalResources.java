package resources.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GlobalResources {

    WebDriver driver;

    public GlobalResources(WebDriver _driver) {
        driver = _driver;
    }

    public void Click (String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }

    public void Write (String xpath, String text){
        driver.findElement(By.xpath(xpath)).sendKeys(text);
    }
}
