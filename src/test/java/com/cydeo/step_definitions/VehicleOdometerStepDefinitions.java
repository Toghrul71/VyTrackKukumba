package com.cydeo.step_definitions;

import com.cydeo.pages.DashboardPage;
import com.cydeo.pages.VehicleOdometerPage;
import com.cydeo.utilities.VytrackUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class VehicleOdometerStepDefinitions {
    DashboardPage dashboardPage=new DashboardPage();
    VehicleOdometerPage vehicleOdometerPage=new VehicleOdometerPage();




    @And("Click the {string} option under Fleet")
    public void clickTheOptionUnderFleet(String string) {

        dashboardPage.navigateToModule("Fleet",string);

    }


    @Given("Drivers logged in using {string} and {string} to the homepage")
    public void driversLoggedInUsingAndToTheHomepage(String username, String password) {
        VytrackUtils.login(username,password);
    }


    @Then("Verify if drivers can see the view per page is 25 by default")
    public void verifyIfDriversCanSeeTheViewPerPageIsByDefault() {
        String expectedViewPerPage="25";
        Assert.assertEquals(expectedViewPerPage,vehicleOdometerPage.defaultViewPerPage.getText());

    }
}
