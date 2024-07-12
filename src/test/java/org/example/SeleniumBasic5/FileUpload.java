package org.example.SeleniumBasic5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUpload {
    WebDriver driver;

    @BeforeTest
    public void openBrowser(){

        driver = new ChromeDriver();
    }


    @Test
    public void test() {

        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();
        WebElement upload = driver.findElement(By.xpath("//input[@id='file-upload']"));
        upload.sendKeys("C:\\Users\\Lenovo\\IdeaProjects\\selenium\\demo.txt");
        upload.submit();


    }

    @AfterTest
    public void closeBrowser()  {
        //driver.quit();
    }


}
