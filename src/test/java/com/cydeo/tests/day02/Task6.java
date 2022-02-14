package com.cydeo.tests.day02;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Task6 {

    public static void main(String[] args) {

        /*
        TC:6 As a user I should be able to see the password as "*******"

        1- Open a Chrome browser  */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2- Go to https://vytrack.com/
        driver.get("https://vytrack.com/");

        /* 3- Click Login label
              If 1 out of 2, not unique, modify css locator for login to make it unique.

        #menu-item-849 > a -> css, modify by adding a parent #top-menu>li#menu-item-849 > a  */
        driver.findElement(By.xpath("//*[@id='menu-item-849']/a")).click(); // -> xpath locator

        // 4- Enter username "User1"
        WebElement userNameWebElement = driver.findElement(By.id("prependedInput"));
        userNameWebElement.sendKeys("User1");

        // 5- Enter password "UserUser123"

        // 6- Verify the password is hidden

    }
}
