package org.example.seleniumBasic6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PageFactory {

    WebDriver driver;

    LoginPage_PageFactory(){
        driver = new ChromeDriver();
        PageFactory.initElements(driver,this);
    }


        @FindBy(id = "login-username")
        WebElement username;

        @FindBy(id = "login-password")
        WebElement password;

        @FindBy(id = "js-login-btn")
        WebElement sign;

        public void login(String user, String pass){

        username.sendKeys(user);
        password.sendKeys(pass);
        sign.click();

    }

}
