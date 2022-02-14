package com.cydeo.tests.day01;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class Task2 {

    public static void main(String[] args) {

        // 1. Set up the browser driver
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // 2. Maximize the browser size
        driver.manage().window().maximize();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 3. Go to "https://www.selenium.dev"
        driver.get("https://www.selenium.dev");

        // 4. Verify the URL
        String expectedURL="https://www.selenium.dev/";
        String actualURL=driver.getCurrentUrl();

        if (expectedURL.equals(actualURL)){
            System.out.println("URL verification PASSED.");
        }else {
            System.err.println("URL verification FAILED.");
        }

        driver.close();
    }
}
