package Locatori;

import org.openqa.selenium.By;

public class Locatori {

    public By numeButon(String buttonname) {

        switch (buttonname) {

            case "Buttons":
                return By.id("buttons");

            case "Checkboxes":
                return By.id("checkboxes");
            default:
            throw new IllegalArgumentException("Butonul nu exista");


        }
    }
}