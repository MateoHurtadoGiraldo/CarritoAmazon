package steps;


import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import pages.BasePage;

public class Hooks extends BasePage{
    
    public Hooks(){
        super(driver);
    }

    @After
    public void tearDown(Scenario escenario){
        
    }
}
