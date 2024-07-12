package org.example.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionClass {


    WebDriver driver;

    @BeforeTest
    public void openBrowser(){

        driver = new ChromeDriver();
    }


    @Test
    public void test() {

        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));

        Actions action = new Actions(driver);
        action.keyDown(Keys.SHIFT).sendKeys(lastname,"shinde").keyUp(Keys.SHIFT).build().perform();

        WebElement element = driver.findElement(By.xpath("//a[text()='Click here to Download File']"));
        action.contextClick(element).build().perform();




    }

    @AfterTest
    public void closeBrowser()  {
        driver.quit();
    }

}



