package pages;

public class AmazonSearchPage extends BasePage {

    private String barraBusqueda = "field-keywords"; //Selector por Nombre
    private String btnBuscar = "nav-search-submit-button"; //Selector por ID
    private String btnPagina2 = "//a[@aria-label='Ir a la página 2']";// Selector XPath
    private String articulo3 = "/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/span/div/div/div/div[2]/div/div/div[1]/a"; // Selector Absoluto XPath

    //Constructor
    public AmazonSearchPage() {
        super(driver);
    }

    // Metodo para navegar a la pagina de Amazon
    public void navegarA() {
        navegarA("https://www.amazon.com");
    }

    // Metodo que ayuda a pausar el tiempo de ejecución por un tiempo para poder resolver el Captcha.
    public void espera() {
        try {
            Thread.sleep(15000); //pausa de 15 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Metodo que ingresa datos en la barra de busqueda
    public void buscarProducto(String busqueda){
        escribir(barraBusqueda, busqueda);
        clicarElementoId(btnBuscar);
    }

    // Metodo para ir a una pagina 
    public void irPagina(){
        clicarPagina(btnPagina2);
    }

    //Metodo para Clicar el 3er producto
    public void clicarProducto3(){
        clicarElementoXpath(articulo3);
    }
    
}
