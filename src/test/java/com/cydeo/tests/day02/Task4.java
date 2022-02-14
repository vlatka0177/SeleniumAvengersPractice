package com.cydeo.tests.day02;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task4 {

    public static void main(String[] args) {

      /*
      TC:4 As a user I should be able to see Login is displayed

        1- Open a Chrome browser      */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to https://vytrack.com/
        driver.get("https://vytrack.com/");

        //3- Verify Login is displayed
        WebElement LoginWebElement = driver.findElement(By.xpath("//*[@id='menu-item-849']/a"));

        if (LoginWebElement.isDisplayed()) {
            System.out.println("Login verification PASSED.");
        } else {
            System.out.println("Login verification FAILED.");
        }

        driver.close();

    }
}
