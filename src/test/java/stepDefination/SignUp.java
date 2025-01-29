package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.en.Then;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SignUp 
{
    
    WebDriver driver;

    @Given("I am on the site homepage")
    public void userIsOnHomePage()
	{
        
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		driver.get("https://demoblaze.com/");
		driver.manage().window().maximize();
    }
    
    @When("I click on {string} on the {string} Page")
    public void userClickOnSignUp(String elementText, String pageName) 
	{
        WebElement element = driver.findElement(By.xpath("/html/body/nav/div[1]/ul/li[8]/a"));	
        element.click();
    }

    @And("I enter {string} into user name field")
    public void userEnterUserName(String elementText) 
	{
        WebElement e2 = driver.findElement(By.id("sign-username"));
        e2.sendKeys("studymailid12@gmail.com");
    }

    @And("I enter {string} into password field")
    public void userEntersPassword(String elementText) 
	{
        WebElement e3 = driver.findElement(By.id("sign-password"));
        e3.sendKeys("Prajakta@123");		
    }

    @Then("I click on {string}")
    public void userClickOnSubmit(String elementText) 
	{
        WebElement e4 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/button[1]"));
        e4.click();
    }
}
