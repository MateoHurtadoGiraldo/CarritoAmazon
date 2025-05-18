package pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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

    // Metodo para hallar un elemento por su selector XPath
    private WebElement encontrarElementoXpath(String localizador){
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(localizador)));
    }

    // Metodo para hallar un elemento por su selector Name
    private WebElement encontrarElementoName(String localizador){
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.name(localizador)));
    }

    // Metodo para hallar un elemento por su selector CSS
    private WebElement encontrarElementoCss(String localizador){
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(localizador)));
    }

    // Metodo para hallar un elemento por su selector Id
    private WebElement encontrarElementoId(String localizador){
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id(localizador)));
    }

    // Clicar algun elemento con selector Id
    public void clicarElementoId(String localizador){
        encontrarElementoId(localizador).click();
    }

    // Clicar algun elemento con selector XPath
    public void clicarElementoXpath(String localizador){
        encontrarElementoXpath(localizador).click();
    }

    // Escribe en un campo de texto
    public void escribir(String localizador, String busqueda){
        encontrarElementoName(localizador).clear();
        encontrarElementoName(localizador).sendKeys(busqueda);
    }

    // Metodo para ir a la pagina de amazon por su XPath
    public void clicarPagina(String locator){
        encontrarElementoXpath(locator).click();;
    }

    // Metodo para selecionar elemento de una lista desplegable (Dropdowns).
    // Cuando se selecciona de la lista se utiliza el metodo clicar para escoger el numero de productos.
    // Al final se espera hasta que el boton agregar sea visible y se clica.
    public void selecionarElementoListaDes(String localizadorLis,String seleProducto, String localiBtnAgregar, Integer elemento){
        WebElement lista = encontrarElementoCss(localizadorLis);
        Select listaDesplegable = new Select(lista);

        listaDesplegable.selectByIndex(elemento);
        clicarElementoXpath(seleProducto);

        WebElement btnAgregarProductoCarrito = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(localiBtnAgregar)));
        btnAgregarProductoCarrito.click();
    }

    // Metodo para realizar Validaciones.
    public void validarTexto(String locator){
        String textoEsperado= "Agregado al carrito";
        String textoEncontrado = encontrarElementoXpath(locator).getText();

        Assert.assertEquals(textoEsperado, textoEncontrado);
        System.out.println("La palabra encontrada fue: "+textoEncontrado);
    }
}

