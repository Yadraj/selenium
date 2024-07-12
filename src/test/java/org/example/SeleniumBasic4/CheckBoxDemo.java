package org.example.SeleniumBasic4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class CheckBoxDemo {


    WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        driver = new ChromeDriver();
    }



    @Test
    public void testNegative() {

        driver.get("https://the-internet.herokuapp.com/checkboxes");
        driver.manage().window().maximize();
       List<WebElement> drop =  driver.findElements(By.cssSelector("input[type=\"checkbox\"]"));


       for(WebElement checkbox : drop){

           if(!checkbox.isSelected()){
               checkbox.click();
           }

       }





    }




    @AfterTest
    public void closeBrowser()  {
        driver.quit();
    }




}
