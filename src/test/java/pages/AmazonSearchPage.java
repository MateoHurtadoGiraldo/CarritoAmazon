package pages;

public class AmazonSearchPage extends BasePage {

    private String barraBusqueda = "field-keywords"; //Selector por Nombre
    private String btnBuscar = "nav-search-submit-button"; //Selector por ID
    private String btnPagina2 = "//a[@aria-label='Ir a la página 2' and @href]";// Selector XPath
    private String articulo3 = "(//div[@data-cy='title-recipe']/a)[3]"; // Selector Absoluto XPath 
    private String listaPlegable = "select[name='quantity']"; // Selector Css
    private String numProductos = "//*[@id=\"quantity_1\"]"; // Selector XPath
    private String btnAgregarCarro = "//input[@title='Agregar al Carrito']"; // Selector XPath
    private String mensajeValidacion = "//h1[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']"; // Selector XPath
// 
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
    
    //Metodo para seleccionar numero de productos
    public void agragarListaPlegable(){
        selecionarElementoListaDes(listaPlegable, numProductos, btnAgregarCarro, 1);
    }

    // Metodo para realizar validaciones al finalizar de agregar cada producto al carrito de compras
    public void validarMensaje(){
        validarTexto(mensajeValidacion);
    }
}
