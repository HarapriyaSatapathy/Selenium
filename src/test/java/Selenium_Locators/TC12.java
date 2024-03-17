 package Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

 public class TC12 {
     @Test
     @Description("Find elements and login with invalid credentials")
     public void VWOLogin()  {
         WebDriver driver = new ChromeDriver();
         driver.get("https://app.vwo.com/#/login");
         driver.findElement(By.id("login-username")).sendKeys("admin@gmail.com");
         driver.findElement(By.id("login-password")).sendKeys("pass123");
         driver.findElement(By.id("js-login-btn")).click();

         try {
             Thread.sleep(3000);
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
         WebElement error_msg = driver.findElement(By.id("js-notification-box-msg"));
         String error_msg_text=error_msg.getText();
         Assert.assertEquals(error_msg_text,"Your email, password, IP address or location did not match");
         driver.quit();


         }
 }
