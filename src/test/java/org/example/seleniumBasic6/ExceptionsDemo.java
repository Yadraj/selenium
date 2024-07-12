package org.example.seleniumBasic6;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;

public class ExceptionsDemo {

    WebDriver driver;

    @BeforeTest
    public void openBrowser(){

        driver = new ChromeDriver();
    }


    @Test
    public void test() {





        driver.get("https://www.google.com/");
        try {

            WebElement name =  driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
            driver.navigate().refresh();
            name.sendKeys("hello");

        } catch (StaleElementReferenceException e) {
           // e.printStackTrace();
            System.out.println("element not found");
        }

        System.out.println("program running");


    }

    @AfterTest
    public void closeBrowser()  {

        //driver.quit();
    }

}
