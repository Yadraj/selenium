package org.example.SeleniumBasic4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertDemo {


    WebDriver driver;


    @BeforeTest
    public void openBrowser(){
        driver = new ChromeDriver();
    }



    @Test
    public void testNegative() {

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));



//       Alert alert = driver.switchTo().alert();
//       String alertText = alert.getText();
//       System.out.println(alertText);
//       alert.accept();




    }

    @AfterTest
    public void closeBrowser()  {
        driver.quit();
    }
}
