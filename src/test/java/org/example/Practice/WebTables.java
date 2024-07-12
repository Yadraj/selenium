package org.example.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class WebTables {

    WebDriver driver;

    @BeforeTest
    public void openBrowser(){

        driver = new ChromeDriver();
    }


    @Test
    public void test() {

        driver.get("https://awesomeqa.com/webtable.html");
        driver.manage().window().maximize();

        List<WebElement> tables = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        System.out.print(tables.size());

        for (WebElement table : tables) {
            System.out.println(table.getText());
        }

        driver.findElement(By.xpath("//tbody/tr[2]/td[1]"));
        String firstString = "//tbody/tr[";
        String secondString="]/td[1]";



        for(int i =2; i<=tables.size(); i++){

            String dynamic_data  = firstString+i+secondString;
            String data = driver.findElement(By.xpath(dynamic_data)).getText();
            System.out.println(data);


        }





    }


    @AfterTest
    public void closeBrowser()  {
        driver.quit();
    }

}
