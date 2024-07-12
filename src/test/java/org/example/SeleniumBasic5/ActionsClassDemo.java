package org.example.SeleniumBasic5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class ActionsClassDemo {

    WebDriver driver;

    @BeforeTest
    public void openBrowser(){

        driver = new ChromeDriver();
    }

    @Test
    public void test() {

        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();
        WebElement username =  driver.findElement(By.xpath(" //input[@name='firstname']"));

        Actions actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT).sendKeys(username,"yadraj").keyUp(Keys.SHIFT).build().perform();

        WebElement link = driver.findElement(By.xpath("//a[text()='Click here to Download File']"));
        actions.contextClick().build().perform();


    }


    @AfterTest
    public void closeBrowser()  {
        driver.quit();
    }
}
