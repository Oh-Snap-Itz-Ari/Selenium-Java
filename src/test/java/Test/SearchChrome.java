package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.navigation.NavigatorChrome;
import resources.scenaries.mvn.SearchLibraries;

import java.util.concurrent.TimeUnit;

public class SearchChrome {

    WebDriver driver;

    @BeforeMethod // Indica que se ejecutará previo a las pruebas
    public void beforeTest(){
        NavigatorChrome navigatorChrome = new NavigatorChrome(driver); // Se crea una instancia para que el metodo pueda acceder a la clase navigationChrome
        driver = navigatorChrome.openGoogleNavigator();
    }

    @Test // Indica el test que se va a realizar
    public void searchChrome(){
        SearchLibraries searchLibraries = new SearchLibraries(driver);
        searchLibraries.SearchMvnLibrary(driver);
        try{
            Thread.sleep(2000);
        }
        catch (Exception ignored){

        }
    }

    @AfterMethod // Indica que se ejecutará después de las pruebas
    public void afterTest(){
        NavigatorChrome navigatorChrome = new NavigatorChrome(driver); // Se crea una instancia para que el metodo pueda acceder a la clase navigationChrome
        driver = navigatorChrome.tearDown();
    }
}
