package steps;

import io.cucumber.java.en.*;
import pages.AmazonSearchPage;

public class AmazonSearchSteps {
    
    private AmazonSearchPage amazon = new AmazonSearchPage();

    @Given("el usuario navega a la pagina de amazon")
    public void navegarAmazon(){
        amazon.navegarA();
        amazon.espera();
    }

    @And("^busca el producto (.*)$")
    public void buscarProductoEspecifico(String busqueda){
        amazon.buscarProducto(busqueda);
    }

    @And("^navega a la segunda pagina$")
    public void navegarPagina2(){
        amazon.irPagina();
    }

    @And("^selecciona el tercer articulo$")
    public void seleccionarArticulo3(){
        amazon.clicarProducto3();
    }

    @Then("^el usuario es capaz de agregarlo al carrito de compra$")
    public void agregarProductos(){
        amazon.agragarListaPlegable();
        amazon.validarMensaje();
    }
}
