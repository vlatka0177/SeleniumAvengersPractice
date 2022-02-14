package com.cydeo.tests.day01;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class Task4 {

    public static void main(String[] args) {

        // 1. Set up the "browser driver"
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // 2. Go to "https://www.google.com"
        driver.get("https://www.google.com");

        // 3. Verify the title contains "Google"
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Google title verification PASSED.");
        }else{
            System.out.println("Google title verification FAILED.");
        }

        // 4. Navigate to "https://www.etsy.com"
        driver.navigate().to("https://www.etsy.com");

        // 5. Verify not on Google page
        String expectedTitle2 = "Etsy";
        String actualTitle2 = driver.getTitle();

        if (actualTitle2.contains(expectedTitle2)){
            System.out.println("Not on Google page verification PASSED.");
        }else{
            System.out.println("Not on Google page verification FAILED.");
        }

        // 6. Verify the title contains "Etsy"
        String expectedTitle3 = "Etsy";
        String actualTitle3 = driver.getTitle();

        if (actualTitle3.contains(expectedTitle3)){
            System.out.println("Etsy title verification PASSED.");
        }else{
        System.out.println("Etsy title verification FAILED.");
    }

        driver.close();

    }
}
