package resources.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GlobalResources {

    WebDriver driver;

    public void Click (String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }

    public void Write (String xpath, String text){
        driver.findElement(By.xpath(xpath)).sendKeys(text);
    }
}
