package org.example.SeleniumBasic5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class IframesDemo {

    WebDriver driver;

    @BeforeTest
    public void openBrowser(){

        driver = new ChromeDriver();
    }


    @Test
    public void test() {

        driver.get("https://the-internet.herokuapp.com/frames");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("iFrame")).click();
        String mainWindow =driver.getWindowHandle();

        Set<String> allWindows = driver.getWindowHandles();

        Iterator<String> iterator = allWindows.iterator();

        while(iterator.hasNext())
        {
            driver.switchTo().window(iterator.next());

           driver.switchTo().frame("mce_0_ifr");
           String name = driver.findElement(By.xpath("//p[text()='Your content goes here.']")).getText();
           System.out.println(name);
            break;

        }













    }

    @AfterTest
    public void closeBrowser()  {
        driver.quit();
    }

}
