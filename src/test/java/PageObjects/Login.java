package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

@FindBy(id = "username")
public WebElement uname;

@FindBy(id="password")
    public WebElement pwd;

@FindBy(id = "tp-sign-in")
    public WebElement signIn;


}
