package org.example.SeleniumBasic4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WaitsDemo {


    WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        driver = new ChromeDriver();
    }

    @Test
    public void testNegative() {


        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("login-username"));
        username.clear();
        username.sendKeys("yadrajshinde1@gmail.com");

        WebElement password = driver.findElement(By.id("login-password"));
        password.clear();
        password.sendKeys("Yad.s19971");


        WebElement loginButton = driver.findElement(By.id("js-login-btn"));
        loginButton.click();




        //Thread.sleep(5000);


        WebElement error = driver.findElement(By.id("js-notification-box-msg"));

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.textToBePresentInElement(error, "Your email, password, IP address or location did not match"));

        System.out.println(error.getText());



    }


    @AfterTest
    public void closeBrowser()  {
        driver.quit();
    }

}
