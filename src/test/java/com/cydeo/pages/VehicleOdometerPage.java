package com.cydeo.pages;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class VehicleOdometerPage {
    public VehicleOdometerPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//input[@value='1']")
    public WebElement defaultPageNumber;

    @FindBy(xpath = "//button[@class='btn dropdown-toggle ']")
    public WebElement defaultViewPerPage;

    public void selectModuleAndOption(String module, String option){
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(Driver.getDriver().findElement(By.xpath("//span[contains(text( ), "+"'"+module+"')]"))).perform();

        BrowserUtils.sleep(5);
        WebElement optionElement = Driver.getDriver().findElement(By.xpath("//span[contains(text( ), "+"'"+option+"')]"));
        optionElement.click();


    }

    }


