package org.example.SeleniumBasic5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandles {


    WebDriver driver;

    @BeforeTest
    public void openBrowser(){

        driver = new ChromeDriver();
    }


    @Test
    public void test() {

        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Click Here")).click();
        String window =driver.getWindowHandle();


        Set<String> windows =driver.getWindowHandles();

        for(String windowHandle : windows){

            System.out.println(windowHandle);
            driver.switchTo().window(windowHandle);

            if(driver.getPageSource().contains("New Window"))
            {
                System.out.println("passed");
                break;

            }
        }





    }

    @AfterTest
    public void closeBrowser()  {
        driver.quit();
    }
}
