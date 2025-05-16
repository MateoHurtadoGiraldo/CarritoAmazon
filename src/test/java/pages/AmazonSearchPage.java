package pages;

public class AmazonSearchPage extends BasePage {

    private String barraBusqueda = "field-keywords"; //Selector por Nombre
    private String btnBuscar = "nav-search-submit-button"; //Selector por ID

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

    
}
