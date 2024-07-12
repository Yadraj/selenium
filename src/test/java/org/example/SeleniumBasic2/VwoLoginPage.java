package org.example.SeleniumBasic2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VwoLoginPage {


    WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        driver = new ChromeDriver();
    }

    @Test
    public void testNegative() throws InterruptedException {

        driver.get("https://app.vwo.com/#/login");
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






       // Assert.assertEquals(errorText,"Your email, password, IP address or location did not match");
    }






    @Test
    public void testPositive() throws InterruptedException {

        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("login-username"));
        username.clear();
        username.sendKeys("yadrajshinde1@gmail.com");

        WebElement password = driver.findElement(By.id("login-password"));
        password.clear();
        password.sendKeys("Yad.s1997");


        WebElement loginButton = driver.findElement(By.id("js-login-btn"));
        loginButton.click();

        Thread.sleep(10000);

        WebElement dashboard_name = driver.findElement(By.xpath("//span[text()=\"yadraj shinde\"]"));
        String errorText = dashboard_name.getText();
        System.out.println(errorText);

        // Assert.assertEquals(errorText,"Your email, password, IP address or location did not match");
    }






    @AfterTest
    public void closeBrowser()  {
        driver.quit();
    }
}
