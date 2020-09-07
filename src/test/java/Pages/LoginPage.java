package Pages;

import PageObjects.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    Login login=new Login();

    public void LoginPage(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver, login);

    }
    public void enterCredentials(String username, String password){
        login.uname.sendKeys(username);
        login.pwd.sendKeys(password);
    }

    public void signIn(){
        login.signIn.click();
    }

    public void verifyHomePage(){
        driver.getPageSource().contains("Welcome To TestProject");

    }
}
