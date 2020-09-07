package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class GoogleSearchSteps {

    WebDriver driver=null;

    @Given("browser is open")
    public void openBrowser(){
       String projectpath= System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectpath+"/Drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }

    @And("User is on google search page")
    public void verifyUserOnsearchpage(){

        driver.navigate().to("https://www.google.com");
    }

    @When("user enter a text in search bar")
    public void enterText(){

        driver.findElement(By.name("q")).sendKeys("Automation step by step");
    }

    @And("hits enter")
    public void hitEnter(){
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @Then("user is navigated to search results")
    public void verifySearchResults(){

        driver.getPageSource().contains("Online Courses");
    }
}
