package resources.scenaries.mvn;

import org.openqa.selenium.WebDriver;
import resources.utils.GlobalResources;

public class SearchLibraries {

    WebDriver driver;

    public SearchLibraries(WebDriver _driver) {
        driver = _driver;
    }

    public void SearchMvnLibrary(WebDriver driver) {
        GlobalResources globalResources = new GlobalResources(driver);
        globalResources.Write("//*[@name='q' and @role='searchbox']","Selenium");
        globalResources.Click("//*[@class='button' and @type='submit']");
    }

}
