package Locatori;

import org.openqa.selenium.By;

public class Locatori {

    public By numeButon(String buttonname) {

        switch (buttonname) {

            case "Buttons":
                return By.id("buttons");

            case "Checkboxes":
                return By.id("checkboxes");
            case "Forms1":
                return By.id("forms");
            case "Submit":
                return By.id("form");
            case "Btn actions":
                    return By.id("actions");
            case "Mouse hover":
                return By.id("mouse-hover");
            default:
            throw new IllegalArgumentException("Butonul nu exista");


        }
    }
}