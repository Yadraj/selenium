package org.example.SeleniumBasic2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sel001 {

    public static void main(String[] args) {


        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        driver.navigate().to("https://sdet.club/t/atb7x-only");
        driver.navigate().to("https://www.google.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();


    }

}
