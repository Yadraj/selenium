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

public class OrangeHrmWebTables {


    WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        driver = new ChromeDriver();
    }

    @Test
    public void testNegative() throws InterruptedException {


        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));



        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Hacker@4321");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();




        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//div[@class='oxd-table-card'])")));

      List<WebElement> list_name = driver.findElements(By.xpath("(//div[@class='oxd-table-card'])"));
      System.out.println(list_name.size());

    }


    @AfterTest
    public void closeBrowser()  {
        driver.quit();
    }
}
