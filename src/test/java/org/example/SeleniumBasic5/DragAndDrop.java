package org.example.SeleniumBasic5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDrop {

    WebDriver driver;

    @BeforeTest
    public void openBrowser(){

        driver = new ChromeDriver();
    }


    @Test
    public void test() {

        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        driver.manage().window().maximize();
       WebElement from =  driver.findElement(By.xpath("//div[@id='column-a']"));
       WebElement to =  driver.findElement(By.xpath("//div[@id='column-b']"));
       Actions actions = new Actions(driver);
       //actions.dragAndDrop(from, to).build().perform();

        actions.clickAndHold(from).moveToElement(to).release(to).build().perform();

    }

    @AfterTest
    public void closeBrowser()  {
        driver.quit();
    }
}
