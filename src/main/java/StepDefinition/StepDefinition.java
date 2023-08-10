package StepDefinition;
import Locatori.Locatori;
import Utilities.ChromeConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import io.cucumber.java.en.And;

public class StepDefinition {
    ChromeDriver driver;
    Locatori locatori = new Locatori();



    @Given("Open the browser")
    public void  deschideChrome() {
        driver=ChromeConfig.getChromeDriver();
    }
    @When("Access page {string}")
    public void acceseazaPagina(String url){
        driver.get(url);}

        @And("Press button {string}")
                public void apasaButon(String var) {
By buttonLocator = locatori.numeButon(var);
WebElement element = driver.findElement(buttonLocator);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            element.click ();
}
}
