package org.example.Practice.July11th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class SVG002 {

    @Test
    public void test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amcharts.com/svg-maps/?map=india");
        driver.manage().window().maximize();


       List<WebElement> search =  driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']"));
        System.out.println(search.size());

        for(WebElement e : search){
            System.out.println(e.getAttribute("aria-label"));

            if(e.getAttribute("aria-label").trim().equals("Tripura ")){
                new Actions(driver).moveToElement(e).click().perform();

            }

        }

    }
}
