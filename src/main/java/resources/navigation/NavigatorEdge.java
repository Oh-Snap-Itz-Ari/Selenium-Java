package resources.navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class NavigatorEdge {

    WebDriver driver;

    public void setUp() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

    public void openEdgeNavigator() {
        driver.get("https://www.google.com");
        System.out.println("\nTítulo de la página: " + driver.getTitle());
        // Tiempos del navegador, espera 10 segundos antes de que inicie la prueba para que cargue la web
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
