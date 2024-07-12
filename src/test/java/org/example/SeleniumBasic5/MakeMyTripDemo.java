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

public class MakeMyTripDemo {


    WebDriver driver;

    @BeforeTest
    public void openBrowser(){

        driver = new ChromeDriver();
    }

    @Test
    public void test() throws InterruptedException {

        driver.get("https://thetestingacademy.com/");
        driver.manage().window().maximize();


       Actions action = new Actions(driver);
       action.sendKeys(Keys.PAGE_DOWN).build().perform();
       System.out.println("scroll down");


//        action.moveToElement(from).click().sendKeys("Bangkok").build().perform();
//
//
//
//        List<WebElement> fromPlaces = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
//
//        for (WebElement fromPlace : fromPlaces) {
//
//            System.out.println(fromPlace.getText());
//
//        }






    }


    @AfterTest
    public void closeBrowser()  {
       // driver.quit();
    }
}
