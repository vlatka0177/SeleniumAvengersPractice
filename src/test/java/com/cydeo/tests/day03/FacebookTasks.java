package com.cydeo.tests.day03;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class FacebookTasks {

    WebDriver driver;

    /* Mac: Command + N
       Windows: Alt + Insert */
    @BeforeClass
    public void setUp() {
        // 1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        /* Three dots in the top right corner of the page contain the choice of whether to open the inspect page side
           by side or top and bottom. */
    }

    @Test
    public void task1_titleVerification() {
        /* Task #1: Facebook Title Verification
           3. Verify title
           Expected: "Facebook - Log In or Sign Up" */
        String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();

        // Method overloading. Same method name with different parameters.
        assertEquals(actualTitle, expectedTitle);
        // hover over assertEquals: import static method Assert.assertEquals(actualTitle, expectedTitle);

    }

    @Test
    public void task2_loginTitleVerification() {
        /* Task #2: Facebook Login Title Verification
           3. Enter incorrect username  */
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("incorrect");

        // 4. Enter incorrect password
        driver.findElement(By.xpath("//div[@id='passContainer']/input")).sendKeys("incorrect" + Keys.ENTER);

        /* 5. Verify that the title changed
           Expected: "Facebook - Log In or Sign Up" */
        String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();

        assertEquals(actualTitle, expectedTitle);
    }

    @Test
    public void task3_headerVerification() {
        /* Task #3: Facebook Header Verification
        3. Verify that header is as expected.
           Expected: "Connect with friends and the world around you on Facebook." */
        String expectedHeader = "Connect with friends and the world around you on Facebook.";
        String actualHeader = driver.findElement(By.cssSelector("h2._8eso")).getText();

        assertEquals(actualHeader, expectedHeader, "Verifying Header");
    }

    @Test
    public void task4_linkAttributeVerification() {
        /* Task #4: Facebook Link Attribute Verification
        3. Verify that "Create a Page" link href value contains text "registration_form"  */
        String expectedWord = "registration_form";             // "//a[contains(@href,'regist')]"
        String actualAttributeValue = driver.findElement(By.xpath("//*[@id='reg_pages_msg']/a")).getAttribute("href");
        assertTrue(actualAttributeValue.contains(expectedWord));
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
