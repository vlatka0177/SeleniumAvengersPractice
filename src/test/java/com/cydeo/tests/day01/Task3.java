package com.cydeo.tests.day01;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class Task3 {

    public static void main(String[] args) {

        //1. Set up the "browser driver"
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to "https://www.selenium.dev"
        driver.get("https://www.selenium.dev");

        //3. Verify the title contains "Selenium"
        String expectedTitle = "Selenium";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title is as expected. Title verification PASSED.");
        } else {
            System.out.println("Title is not as expected. Title verification FAILED.");
        }

        driver.close();

    }
}
