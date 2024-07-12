package org.example.Practice;

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
import java.util.List;

public class AutoSuggestDropDown {



    WebDriver driver;

    @BeforeTest
    public void openBrowser(){

        driver = new ChromeDriver();
    }


    @Test
    public void test() throws InterruptedException {

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        element.sendKeys("java");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul/li")));
       // wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ul/li"))));

        List<WebElement> list = driver.findElements(By.xpath("//ul/li"));

        for(WebElement el : list)
        {
           // System.out.println(el.getText());
           // System.out.println("=============");

           String expected =  el.getText();
           if(expected.equals("java compiler"))
           {
               System.out.println(el.getText());
               el.click();
               break;
           }

        }


    }



    @AfterTest
    public void closeBrowser()  {

        driver.quit();
    }


}
