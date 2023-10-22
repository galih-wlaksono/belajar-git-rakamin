package SauceDemo.cucumber.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class login {
    WebDriver driver;
    String baseUrl = "https://www.saucedemo.com/";
    @Given("User is on login page")
    public void login_page_saucedemo(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.MILLISECONDS);
        driver.get(baseUrl);

        String loginPageAssert = driver.findElement(By.xpath("//div[@class='login_logo']")).getText();
        Assert.assertEquals(loginPageAssert, "Swag Labs");
    }
    @When("User input locked username")
    public void inputLockedUsername(){
        driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
    }

    @And("User input password 2")
    public void inputPassword2(){
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @And("User click login/submit button 2")
    public void clickLoginButton2(){
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    @Then("User verify login result 2")
    public void userInOnDashboardPage2(){
        String verify_error = driver.findElement(By.xpath("//div[@class='app_logo']")).getText();
        Assert.assertEquals(verify_error, "Products");
    }


    @When("User input username")
    public void inputUsername(){
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }

    @And("User input password")
    public void inputPassword(){
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @And("User click login/submit button")
    public void clickLoginButton(){
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    @Then("User verify login result")
    public void userInOnDashboardPage(){
        String verify_error = driver.findElement(By.xpath("//div[@class='app_logo']")).getText();
        Assert.assertEquals(verify_error, "Products");
    }

    @When("User input problem username")
    public void inputProblemUsername(){
        driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
    }

    @And("User input password 3")
    public void inputPassword3(){
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @And("User click login/submit button 3")
    public void clickLoginButton3(){
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    @Then("User verify login result 3")
    public void userInOnDashboardPage3(){
        String verify_error = driver.findElement(By.xpath("//div[@class='app_logo']")).getText();
        Assert.assertEquals(verify_error, "Products");
    }

    @When("User input invalid username")
    public void inputInvalidUsername(){
        driver.findElement(By.id("user-name")).sendKeys("standard_user123");
    }

    @And("User input invalid password")
    public void inputInvalidPassword(){
        driver.findElement(By.id("password")).sendKeys("secret_sauce123");
    }

    @And("User click submit button")
    public void clickSubmitButton(){
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    @Then("User get error message")
    public void userGetErrorMessage(){
        String verify_error = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
        Assert.assertEquals(verify_error, "Epic sadface: Username and password do not match any user in this service");
    }
}
