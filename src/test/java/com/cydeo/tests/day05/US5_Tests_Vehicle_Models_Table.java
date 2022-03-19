package com.cydeo.tests.day05;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtilities;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.VytrackUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class US5_Tests_Vehicle_Models_Table extends TestBase {

    @Test
    public void verify_columns_as_sales_manage() {

        // Login as a sales manager
        VytrackUtilities.loginAsSalesManager();

        // Go to Fleet tab
        String fleetTabElementLocator="//span[normalize-space()='Fleet' and contains(@class, 'title title-level-1')]";

        WebElement fleetTabElement= Driver.getDriver().findElement(By.xpath(fleetTabElementLocator));
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(fleetTabElement).perform();
        BrowserUtilities.sleep(3);
        String vehiclesModelModuleLocator = "//span[normalize-space()='Vehicles Model' and contains(@class, 'title title-level-1')]";
        WebElement vehiclesModelElement = Driver.getDriver().findElement(By.xpath(vehiclesModelModuleLocator));
        // VytrackUtilities
        vehiclesModelElement.click();
    }
}
