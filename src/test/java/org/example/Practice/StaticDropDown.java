package org.example.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class StaticDropDown {



    WebDriver driver;

    @BeforeTest
    public void openBrowser(){

        driver = new ChromeDriver();
    }


    @Test
    public void test() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select select = new Select(element);
        //select.selectByVisibleText("Option 1");
        //select.selectByIndex(2);
        //select.selectByValue("1");
        System.out.println(select.getOptions().size());
        List<WebElement> options = select.getOptions();

        for (WebElement option : options) {
            System.out.println(option.getText());
        }



    }



    @AfterTest
    public void closeBrowser()  {

        //driver.quit();
    }
}
