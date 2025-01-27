package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

    WebDriver driver;

    public Login() {
        // Initialize WebDriver (for example, ChromeDriver)
        this.driver = new ChromeDriver();
    }

    @Given("I am on the site homepage")
    public void iAmOnTheSiteHomepage() {
        driver.get("https://www.amazon.com");
    }

    @When("I click on {string} on the {string} Page")
    public void iClickOnOnThePage(String elementText, String pageName) {
        WebElement element = driver.findElement(By.linkText(elementText));
        element.click();
    }

    @And("I enter {string} into all the fields on the page")
    public void iEnterIntoAllTheFieldsOnThePage(String email) {
        WebElement nameField = driver.findElement(By.id("ap_customer_name"));
        WebElement emailField = driver.findElement(By.id("ap_email"));
        WebElement passwordField = driver.findElement(By.id("ap_password"));
        WebElement confirmPasswordField = driver.findElement(By.id("ap_password_check"));

        nameField.sendKeys("Test User");
        emailField.sendKeys(email);
        passwordField.sendKeys("Password123");
        confirmPasswordField.sendKeys("Password123");
    }

    @And("I clear the {string} field on the Create Account Page")
    public void iClearTheFieldOnTheCreateAccountPage(String field) {
        WebElement fieldElement = null;

        switch (field) {
            case "name":
                fieldElement = driver.findElement(By.id("ap_customer_name"));
                break;
            case "email":
                fieldElement = driver.findElement(By.id("ap_email"));
                break;
            case "password":
                fieldElement = driver.findElement(By.id("ap_password"));
                break;
            case "confirm_passwd":
                fieldElement = driver.findElement(By.id("ap_password_check"));
                break;
        }
        fieldElement.clear();
    }

    @And("I click on {string} on the Create Account Page")
    public void iClickOnSubmitOnTheCreateAccountPage(String buttonText) {
        WebElement submitButton = driver.findElement(By.id("continue"));
        submitButton.click();
    }

    @Then("the {string} on the Create Account Page should be visible")
    public void theErrorOnTheCreateAccountPageShouldBeVisible(String error) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement errorElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(error)));
        assertTrue(errorElement.isDisplayed());
    }
}




