package org.example.Practice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertsPractice {

    WebDriver driver;

    @BeforeTest
    public void openBrowser(){

        driver = new ChromeDriver();
    }


    @Test
    public void test() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//button[contains(@onclick,'Alert')]"));
        element.click();

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();



        WebElement element2 = driver.findElement(By.xpath("//button[contains(@onclick,'jsConfirm()')]"));
        element2.click();

        Alert alert2 = driver.switchTo().alert();
        System.out.println(alert2.getText());
        alert2.accept();

        WebElement element3 = driver.findElement(By.xpath("//button[contains(@onclick,'jsPrompt()')]"));
        element3.click();

        Alert alert3 = driver.switchTo().alert();
        alert3.sendKeys("Yadraj");
        System.out.println(alert3.getText());
        alert3.accept();

        String element4 = driver.findElement(By.xpath("//p[@id='result']")).getText();
        String s1="You entered: Yadraj";

        if (element4.equals(s1)) {
            System.out.println("passed");
        }
        else {
            System.out.println("failed");
        }







    }

    @AfterTest
    public void closeBrowser()  {
        //driver.quit();
    }

}
