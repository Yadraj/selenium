package org.example.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTables2 {



    WebDriver driver;

    @BeforeTest
    public void openBrowser(){

        driver = new ChromeDriver();
    }


    @Test
    public void test() {

        driver.get("https://awesomeqa.com/hr/web/index.php/pim/viewEmployeeList");
        driver.manage().window().maximize();

        //div[@class='oxd-table-body']/div[6]/div/div[6]
        String firstname = " //div[@class='oxd-table-body']/div[";
        String secondname = "]/div/div[6]";


//        for(int i =1 ; i<){
//
//            String data  = firstname+"i"+secondname;
//            String data1 = driver.findElement(By.xpath(""))
//
//        }





    }




    @AfterTest
    public void closeBrowser()  {
        driver.quit();
    }
}
