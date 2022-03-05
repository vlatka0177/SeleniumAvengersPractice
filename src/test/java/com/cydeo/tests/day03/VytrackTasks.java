package com.cydeo.tests.day03;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class VytrackTasks {

    WebDriver driver;

    @BeforeClass
    public void setUp() {

        // 1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2. Go to https://vytrack.com/
        driver.get("https://vytrack.com/");
    }

    @Test
    public void task1_verifyHeaderLabels() {

        /* Task #1: As a user I should be able to see the labels “Home”, ”About us”, ”Our Approach”,
           ”Products and Services”, ”Contact”, ”LOGIN” */

        List<WebElement> listOfHeaderWebElements = driver.findElements(By.xpath("//ul[@id='top-menu']/li/a"));

        // Solution 1
        for (WebElement headerWebElement : listOfHeaderWebElements) {
            Assert.assertTrue(headerWebElement.isDisplayed());
        }

        // Solution 2
       //  List<String> expectedHeaderLabels = new ArrayList<>(Arrays.asList("Home, About Us, Our Approach,Products and Services, Contact, LOGIN"));

        /* for (WebElement headerWebElement : listOfHeaderWebElements) {
           Assert.assertTrue(expectedHeaderLabels.contains(headerWebElement.getText()));
           }  */

        /* Solution 3
        List<String> actualHeaderLabels=new ArrayList<>();
        for (WebElement headerWebElement : listOfHeaderWebElements) {
            actualHeaderLabels.add(headerWebElement.getText());
        }
        Assert.assertEquals(actualHeaderLabels, expectedHeaderLabels); */
    }

    @Test
    public void task2_verifyLabels() throws InterruptedException{

        /* Task #2: As a user I should be able to see the labels “Our Mission and Vision”,
           ”CarFleet Management”, ”Newest Technologies”, "Tailor Made Solutions" under Our Approach  */

        driver.findElement(By.xpath("//ul[@id='top-menu']/li[3]/a")).click();
        Thread.sleep(3000);
        List<WebElement> webElementList = driver.findElements(By.xpath("//ul[@id='top-menu']/li[3]/ul/li/a"));
        List<String> actualTextsOfWebElements = new ArrayList<>();

        for (WebElement element : webElementList) {
            actualTextsOfWebElements.add(element.getText());
        }
        List<String> expectedTextsOfWebElements = new ArrayList<>(Arrays.asList("Our Mission and Vision", "Car Fleet Management", "Newest Technologies", "Tailor Made Solutions"));

        Assert.assertEquals(actualTextsOfWebElements, expectedTextsOfWebElements);
    }

    @Test
    public void task3_verifyPage() {

        //Task #3: As a user, I should be able to see Fleet Analysis and Optimization Page under Products and Services

        // 3- Click Products and Services
        driver.findElement(By.xpath("(//ul[@id='top-menu'])/li[4]")).click();

        // 4- Click Fleet Analysis and Optimization
        driver.findElement(By.xpath("(//ul[@id='top-menu'])/li[4]/ul/li/a[.='Fleet analysis and optimization']")).click();

        //5- Verify the page and label
        String expectedWordInURL = "fleet-analysis-and-optimization";
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains(expectedWordInURL));
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}