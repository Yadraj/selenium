package org.example.SeleniumBasic4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class WebtablesDemo {


    WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        driver = new ChromeDriver();
    }

    @Test
    public void testNegative() {


        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://awesomeqa.com/webtable.html");
        driver.manage().window().maximize();

        List<WebElement> table_row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        System.out.println(table_row.size());

        List<WebElement> table_col = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td"));
        System.out.println(table_col.size());




        //table[@id='customers']/tbody/tr[2]/td[]

        String first_path = "//table[@id='customers']/tbody/tr[";
        String second_path="]/td[";
        String third_path="]";



        for(int i = 2;i<=table_row.size();i++)
        {
            for(int j = 1;j<=table_col.size();j++){

               String dynamic_data =  first_path+i+second_path+j+third_path;
              // System.out.println(dynamic_data);

                String data = driver.findElement(By.xpath(dynamic_data)).getText();
               // System.out.println(data);

                if(data.contains("Helen Bennett")){

                    String temp  = dynamic_data+"/following-sibling::td";
                    String data_name = driver.findElement(By.xpath(temp)).getText();
                    System.out.println(data_name);


                }



            }

        }




    }


    @AfterTest
    public void closeBrowser()  {
        driver.quit();
    }
}
