package Test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import resources.navigation.NavigatorChrome;


public class SearchChrome {

    WebDriver driver;

    @Before // Indica que se ejecutará previo a las pruebas
    public void beforeTest(){

    }

    @Test // Indica el test que se va a realizar
    public void searchChrome(){
        NavigatorChrome navigatorChrome = new NavigatorChrome(driver); // Se crea una instancia para que el metodo pueda acceder a la clase navigationChrome
        driver = navigatorChrome.openGoogleNavigator();
    }

    @After // Indica que se ejecutará después de las pruebas
    public void afterTest(){
        driver.close();
    }
}
