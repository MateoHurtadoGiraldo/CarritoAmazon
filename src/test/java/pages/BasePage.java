package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

    public class BasePage {

    protected static WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    static {
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize(); // Maximiza la pantalla 
    }

    public BasePage(WebDriver driver) { 
        BasePage.driver = driver;
    }

    // Metodo para navegar a una pagina por su URL
    public void navegarA(String url){
        driver.get(url);
    }

    // Metodo para cerrar el navegador
    public static void cerrarNavegador(){
        driver.close();
    }
}

