package org.TestPractice.Xpath;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC17 {

    @Test
    @Description("Flipkart login")
    public void FlipkartLogin(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("span[text()='Login']")).click();
        driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8892608085");


    }
}
