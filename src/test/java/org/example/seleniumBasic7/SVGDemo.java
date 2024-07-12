package org.example.seleniumBasic7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class SVGDemo {

    WebDriver driver;

    @BeforeTest
    public void openBrowser(){

        driver = new ChromeDriver();
    }


    @Test
    public void test() throws InterruptedException {

        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.xpath("//input[@name='q']"));
        element.sendKeys("AC");

        WebElement search = driver.findElement(By.xpath("(//*[name()='svg'])[1]"));


        Actions actions = new Actions(driver);
        actions.moveToElement(search).click().perform();

    }


    @AfterTest
    public void closeBrowser()  {

        //driver.quit();
    }
}
