package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
    WebDriver driver;

    @Given("the user is on the login page")
    public void userOnLoginPage() {
        // Set up WebDriver for Microsoft Edge
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();

        // Navigate to the login page
        driver.get("https://www.saucedemo.com/");
    }

    @When("the user enters valid credentials")
    public void enterValidCredentials() {
        // Enter the username and password
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

    @Then("the user should be redirected to the dashboard")
    public void verifyDashboard() {
        // Verify successful login by checking the presence of an element on the dashboard
        boolean isDashboardDisplayed = driver.findElement(By.className("inventory_list")).isDisplayed();
        Assert.assertTrue(isDashboardDisplayed);

        // Quit the browser
        driver.quit();
    }
}