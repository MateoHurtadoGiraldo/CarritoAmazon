package pages;

public class AmazonSearchPage extends BasePage {

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
}
