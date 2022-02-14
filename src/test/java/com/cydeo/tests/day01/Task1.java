package com.cydeo.tests.day01;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class Task1 {

    public static void main(String[] args) {

        // 1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // 2- Maximize the browser size
        driver.manage().window().maximize();

        // 4- Go to "https://www.selenium.dev"
        driver.get("https://www.selenium.dev");

        // 5- Get the title of the page
        driver.getTitle();

        // 6- Get the URL of the page
        driver.getCurrentUrl();

        // 7- Use Selenium to navigate back
        driver.navigate().back();

        // 8- Use Selenium to navigate forward
        driver.navigate().forward();

        // 9- Use Selenium to navigate refresh
        driver.navigate().refresh();

        // 10- Use navigate().to() "https://www.etsy.com":
        driver.navigate().to("https://www.etsy.com");

        // 11- Close the currently opened window
        driver.close();

        // 12- Close all opened windows
        driver.quit();

    }
}
