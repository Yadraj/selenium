package org.example.seleniumBasic7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ShadowDomDemo {


    WebDriver driver;

    @BeforeTest
    public void openBrowser(){

        driver = new ChromeDriver();
    }


    @Test
    public void test() throws InterruptedException {

        driver.get("https://selectorshub.com/xpath-practice-page/");
        //driver.manage().window().maximize();

        Thread.sleep(30000);


        JavascriptExecutor js = (JavascriptExecutor) driver;
       WebElement inputfield =  (WebElement)js.executeScript("return document.querySelector(\"div.jackPart\").shadowRoot.querySelector(\"input#kils\")");
        inputfield.sendKeys("test");



    }


    @AfterTest
    public void closeBrowser()  {

        //driver.quit();
    }


}
