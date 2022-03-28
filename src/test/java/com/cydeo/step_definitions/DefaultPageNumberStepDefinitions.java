package com.cydeo.step_definitions;

import com.cydeo.pages.DashboardPage;
import com.cydeo.pages.VehicleOdometerPage;
import com.cydeo.utilities.VytrackUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class DefaultPageNumberStepDefinitions {

    DashboardPage dashboardPage=new DashboardPage();
    VehicleOdometerPage vehicleOdometerPage=new VehicleOdometerPage();

    @Given("Drivers logged in using {string} and {string} to the homepage")
    public void driversLoggedInUsingAndToTheHomepage(String username, String password) {
        VytrackUtils.login(username,password);
    }

    @And("Click the {string} option under Fleet")
    public void clickTheOptionUnderFleet(String string) {

        dashboardPage.navigateToModule("Fleet",string);

    }

    @Then("Verify if drivers can see the default page number as 1")
    public void verifyIfDriversCanSeeTheDefaultPageNumberAs() {
        String expectedDefaultPageNumber="1";
        Assert.assertEquals(expectedDefaultPageNumber,vehicleOdometerPage.defaultPageNumber.getAttribute("value"));
    }


}
