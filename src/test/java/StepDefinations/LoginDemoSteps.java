package StepDefinations;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginDemoSteps {
    WebDriver driver=null;

    LoginPage loginpage=new LoginPage();
    public void LoginPage(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver, loginpage);

    }
    @And("user is on login page")
    public void verifyPage(){
     //driver.navigate().to("https://auth.testproject.io/auth/realms/TP/protocol/openid-connect/auth?client_id=tp.app&redirect_uri=https%3A%2F%2Fapp.testproject.io%2Fcallback.html&response_type=id_token%20token&scope=openid%20profile&state=24d37eb3b3d84e67841c10ed57106466&nonce=8b626aacf7d3419eb2ee61ca5cb26305");

    }
    @When("user enters (.*) and (.*)")
    public void enterCredentials(String username, String Password){
       loginpage.enterCredentials(username, Password);
       loginpage.signIn();
    }
    @Then("User navigated to home page")
    public void verifyHomePage(){
        loginpage.verifyHomePage();
    }

}
