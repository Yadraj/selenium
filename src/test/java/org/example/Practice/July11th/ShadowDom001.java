package org.example.Practice.July11th;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShadowDom001 {

    @Test
    public void test() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement ele = (WebElement)js.executeScript("document.querySelector(\"div.jackPart\").shadowRoot.querySelector(\"input#kils\")");
        ele.sendKeys("yadraj");
    }
}
