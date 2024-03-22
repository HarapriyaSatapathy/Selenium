package org.TestPractice.Xpath;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TC18 {
    @Test
    @Description("Login")
    public void FlipkartLogin(){
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//a[@title='Login' and @class=\"_1TOQfO\" and @href=\"/account/login?ret=/\"]")).click();
        driver.findElement(By.xpath("//input[@type='text' and @class='_2IX_2- VJZDxU']")).sendKeys("123456789");
//        try {
//            Thread.sleep(8000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        String errortext=driver.findElement(By.xpath("//span[text()=\"Please enter valid Email ID/Mobile number\"]")).getText();
//        System.out.println(errortext);





    }
}
