package org.example.SeleniumBasic2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class sel003 {


    WebDriver driver;

    @BeforeTest
    public void openBrouser(){

        driver = new ChromeDriver();

    }

    @Test
    public void login(){

        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();
        List<WebElement> button_list = driver.findElements(By.tagName("button"));

        for (WebElement button : button_list) {
            System.out.println(button.getText());
        }

        WebElement link = driver.findElement(By.linkText("Start a free trial"));
        link.click();




    }



    @AfterTest
    public void closeBrowser()  {
        driver.quit();
    }
}
