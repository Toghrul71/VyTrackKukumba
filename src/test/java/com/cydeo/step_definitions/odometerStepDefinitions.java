package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.VehicleOdometerPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class odometerStepDefinitions {
    VehicleOdometerPage odometerPage=new VehicleOdometerPage();
    LoginPage loginPage=new LoginPage();

    @Given("Managers logged in using {string} and {string} to the homepage")
    public void managers_logged_in_using_and_to_the_homepage(String username, String password) {
        loginPage.login(username,password);
    }
    @Given("Click the {string} option under {string}")
    public void click_the_option_under_fleet(String option, String module) {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.titleIs("Dashboard"));
        odometerPage.selectModuleAndOption(module,option);

    }
    @Then("Verify managers see {string}")
    public void verify_managers_see(String expectedMessage) {
        String actual=Driver.getDriver().findElement(By.xpath("//div[.='You do not have permission to perform this action.']")).getText();

        Assert.assertEquals(expectedMessage,actual);
    }

}
