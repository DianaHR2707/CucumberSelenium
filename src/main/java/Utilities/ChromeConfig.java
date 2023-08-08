package Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.logging.Level;
import java.util.logging.LogManager;

public class ChromeConfig {


    public static ChromeDriver getChromeDriver() {
        LogManager.getLogManager().getLogger("").setLevel(Level.OFF);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ecm\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        //options.addArguments("--headless"); // Dezactivați comentariul pentru a activa modul headless

        // Creați obiectul ChromeDriver cu opțiunile specificate și returnați-l

        return new ChromeDriver(options);
    }
}

