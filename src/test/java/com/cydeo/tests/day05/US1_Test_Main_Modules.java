package com.cydeo.tests.day05;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.VytrackUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US1_Test_Main_Modules extends TestBase {

    /*
    User Story 1:  As a user, I should be accessing all the main modules of the app.

    Acceptance Criteria #1: Store and sales managers should view 8 module names.
    Expected module names: Dashboards, Fleet, Customers, Sales, Activities, Marketing, Reports & Segments, System

    Acceptance Criteria #2: Drivers should view 4 module names
    Expected module names: Fleet, Customers, Activities, System

    Test Case #1
    Description: Managers access to main modules
    Environment: https://qa2.vytrack.com/user/login
    Steps: 1. login as a sales manager or store manager
           2. Verify the users see 8 modules: Dashboards, Fleet, Customers, Sales, Activities, Marketing, Reports & Segments, System

    Test Case #2
    Description: Drivers access to main modules
    Environment:  https://qa1.vytrack.com/user/login
    Steps:: 1. login as a driver
            2. Verify the users see 4 modules: Fleet, Customers, Activities, System
     */

    //testing modules for sales manager
    @Test
    public void verifying_modules_as_sales_manager(){
        VytrackUtilities.loginAsSalesManager();
        List<WebElement> moduleElements = Driver.getDriver().findElements(By.xpath("//span[@class='title title-level-1']"));
        List<String> actualmoduleTexts=new ArrayList<>();

        for (WebElement moduleElement : moduleElements) {
            String moduleElementText = moduleElement.getText();
            actualmoduleTexts.add(moduleElementText);
        }

        //  moduleElements.forEach(w->actualmoduleTexts.add(w.getText()));
        //  System.out.println("actualmoduleTexts = " + actualmoduleTexts);
        List<String> expectedmoduleTexts=new ArrayList<>(Arrays.asList(
                "Dashboards",
                "Fleet",
                "Customers",
                "Sales",
                "Activities",
                "Marketing",
                "Reports & Segments",
                "System"));

        Assert.assertEquals(actualmoduleTexts, expectedmoduleTexts);

    }

    //testing modules for store manager
    @Test
    public void verifying_modules_as_store_manger(){
        VytrackUtilities.loginAsStoreManager();
        List<WebElement> moduleElements = Driver.getDriver().findElements(By.xpath("//span[@class='title title-level-1']"));
        List<String> actualmoduleTexts=new ArrayList<>();

        for (WebElement moduleElement : moduleElements) {
            String moduleElementText = moduleElement.getText();
            actualmoduleTexts.add(moduleElementText);
        }

        //  moduleElements.forEach(w->actualmoduleTexts.add(w.getText()));
        //  System.out.println("actualmoduleTexts = " + actualmoduleTexts);
        List<String> expectedmoduleTexts=new ArrayList<>(Arrays.asList(
                "Dashboards",
                "Fleet",
                "Customers",
                "Sales",
                "Activities",
                "Marketing",
                "Reports & Segments",
                "System"));

        Assert.assertEquals(actualmoduleTexts, expectedmoduleTexts);

    }

    //testing modules for driver
    @Test
    public void verifiyng_modules_as_driver(){
        VytrackUtilities.loginAsDriver();
        List<WebElement> moduleElements = Driver.getDriver().findElements(By.xpath("//span[@class='title title-level-1']"));
        List<String> actualmoduleTexts=new ArrayList<>();

        for (WebElement moduleElement : moduleElements) {
            String moduleElementText = moduleElement.getText();
            actualmoduleTexts.add(moduleElementText);
        }

        //  moduleElements.forEach(w->actualmoduleTexts.add(w.getText()));
        //  System.out.println("actualmoduleTexts = " + actualmoduleTexts);
        List<String> expectedmoduleTexts=new ArrayList<>(Arrays.asList(
                "Fleet",
                "Customers",
                "Activities",
                "System"));

        Assert.assertEquals(actualmoduleTexts, expectedmoduleTexts);
    }
}

