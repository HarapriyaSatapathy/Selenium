package org.TestPractice.Xpath;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TC20 {
    @Test
    @Description("Proshop Registration")

    public void ProshopLogin() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://crestoralbproshop.com/");
        driver.findElement(By.xpath("//a[@id='registration-authorization-button']")).click();
        driver.findElement(By.xpath("//div[text()='New Dental Office']")).click();
        driver.findElement(By.xpath("//input[@id='business-first-name']")).sendKeys("AT");
        driver.findElement(By.xpath("//input[@id='business-last-name']")).sendKeys("TST");
        driver.findElement(By.xpath("//input[@id='business-email-address']")).sendKeys("htst@gmail.com");


    }
}
