package org.example.SeleniumBasic2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Sel_Cura {


    WebDriver driver;

    @BeforeTest
    public void openBrouser(){
        driver = new ChromeDriver();
    }

    @Test
    public void login(){

        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
        WebElement app_btn =driver.findElement(By.id("btn-make-appointment"));
        app_btn.click();







    }






    @AfterTest
    public void closeBrowser()  {
        driver.quit();
    }
}
