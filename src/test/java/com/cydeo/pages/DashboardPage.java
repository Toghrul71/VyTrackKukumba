package com.cydeo.pages;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement message;


    public void navigateToModule(String tab, String module){

        String tabLocator = "//span[normalize-space()='" + tab + "' and contains(@class, 'title title-level-1')]";
        String moduleLocator = "//span[normalize-space()='" + module + "' and contains(@class, 'title title-level-2')]";

        try{
            BrowserUtils.waitForVisibility(By.xpath(tabLocator),10);
            Driver.getDriver().findElement(By.xpath(tabLocator)).click();
            BrowserUtils.waitForVisibility(By.xpath(moduleLocator),10);
            Driver.getDriver().findElement(By.xpath(moduleLocator)).click();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
