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
}
