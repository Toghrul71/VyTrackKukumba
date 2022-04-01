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


    @Then("Verify if drivers can see the default page number as 1")
    public void verifyIfDriversCanSeeTheDefaultPageNumberAs() {
        String expectedDefaultPageNumber="1";
        Assert.assertEquals(expectedDefaultPageNumber,vehicleOdometerPage.defaultPageNumber.getAttribute("value"));
    }


}
