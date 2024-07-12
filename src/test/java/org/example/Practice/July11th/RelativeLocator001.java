package org.example.Practice.July11th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocator001 {

    @Test
    public void relativeLocator() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/practice.html");
        WebElement  refer = driver.findElement(By.xpath("//span[text()='Years of Experience']"));

        driver.findElement(with(By.id("exp-0")).toRightOf(refer)).click();
    }
}
