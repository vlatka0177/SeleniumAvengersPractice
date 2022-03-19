package com.cydeo.tests.base;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    @BeforeMethod
    public void setUpMethod() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }
}
