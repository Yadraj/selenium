package org.example.seleniumBasic6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage_POM {

    WebDriver driver;

    Loginpage_POM(){
        driver = new ChromeDriver();
    }


    private By username = By.id("login-username");
    private By password = By.id("login-password");
    private By sign = By.id("id='js-login-btn");


    public void login(String user, String pass){

        driver.findElement(username).sendKeys("user");
        driver.findElement(password).sendKeys("pass");
        driver.findElement(sign).click();

    }



}
