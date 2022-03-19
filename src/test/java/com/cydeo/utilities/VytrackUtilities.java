package com.cydeo.utilities;

import org.openqa.selenium.By;

public class VytrackUtilities{

    public static void login(String username, String password) {

        // Got to website
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
        // Pass username
        Driver.getDriver().findElement(By.id("prependedInput")).sendKeys(username);
        // Pass password
        Driver.getDriver().findElement(By.cssSelector("#prependedInput2")).sendKeys(password);
        // Click login button
        Driver.getDriver().findElement(By.tagName("button")).click();
    }

    public static void loginAsDriver() {
        // Go to website
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
        // Pass username
        Driver.getDriver().findElement(By.id("prependedInput")).sendKeys(ConfigurationReader.getProperty("driver_username"));
        // Pass password
        Driver.getDriver().findElement(By.cssSelector("#prependedInput2")).sendKeys(ConfigurationReader.getProperty("driver_password"));
        // Click login button
        Driver.getDriver().findElement(By.tagName("button")).click();
    }

    public static void loginAsStoreManager() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
        Driver.getDriver().findElement(By.id("prependedInput")).sendKeys(ConfigurationReader.getProperty("store_manager_username"));
        Driver.getDriver().findElement(By.cssSelector("#prependedInput2")).sendKeys(ConfigurationReader.getProperty("store_manager_password"));
        Driver.getDriver().findElement(By.tagName("button")).click();
    }

    public static void loginAsSalesManager() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
        Driver.getDriver().findElement(By.id("prependedInput")).sendKeys(ConfigurationReader.getProperty("sales_manager_username"));
        Driver.getDriver().findElement(By.cssSelector("#prependedInput2")).sendKeys(ConfigurationReader.getProperty("sales_manager_password"));
        Driver.getDriver().findElement(By.tagName("button")).click();
    }
}
