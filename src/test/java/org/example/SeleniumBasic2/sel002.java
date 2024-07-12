package org.example.SeleniumBasic2;


import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sel002 {


    WebDriver driver;

    @BeforeTest
    public void openBrouser(){
      driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
    }

    @Test
    public void test() throws InterruptedException {



        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("login-username"));
        username.sendKeys("admin@gmail.com");

        WebElement password = driver.findElement(By.id("login-password"));
        password.sendKeys("admin");


        WebElement loginButton = driver.findElement(By.id("js-login-btn"));
        loginButton.click();

        Thread.sleep(3000);

        WebElement error = driver.findElement(By.id("js-notification-box-msg"));
        String errorText = error.getText();
        System.out.println(errorText);

        Assert.assertEquals(errorText,"Your email, password, IP address or location did not match");



    }


    @AfterTest
    public void closeBrowser()  {
        driver.quit();
    }


}
