package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(id = "username")
    WebElement usernameField;

    public WebElement getUsernameField(){
        WebElement usernameField;
    }

}
