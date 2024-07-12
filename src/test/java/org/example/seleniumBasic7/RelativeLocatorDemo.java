package org.example.seleniumBasic7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorDemo {

    WebDriver driver;

    @BeforeTest
    public void openBrowser(){

        driver = new ChromeDriver();
    }




    @Test
    public void test() throws InterruptedException {

        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.xpath("//span[normalize-space()='Years of Experience']"));
        driver.findElement(with(By.xpath("//input[@id='exp-0']")).toRightOf(element)).click();


    }



    @AfterTest
    public void closeBrowser()  {

        //driver.quit();
    }
}
