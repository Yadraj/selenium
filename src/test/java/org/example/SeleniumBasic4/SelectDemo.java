package org.example.SeleniumBasic4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class SelectDemo {


    WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        driver = new ChromeDriver();
    }

    @Test
    public void testNegative() {

        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.manage().window().maximize();
        WebElement drop =  driver.findElement(By.id("dropdown"));

            Select select = new Select(drop);
            select.selectByIndex(1);




    }


    @AfterTest
    public void closeBrowser()  {
        driver.quit();
    }
}
