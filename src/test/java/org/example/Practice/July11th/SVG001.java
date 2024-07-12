package org.example.Practice.July11th;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SVG001 {

    @Test
    public void test() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        WebElement searchElement = driver.findElement(By.xpath("//input[@name='q']"));
        searchElement.sendKeys("AC");
        WebElement searchBox = driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M16 16L21 ')]"));


        Actions actions = new Actions(driver);
        actions.moveToElement(searchBox).click().perform();


    }
}
