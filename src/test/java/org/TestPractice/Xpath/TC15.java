package org.TestPractice.Xpath;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC15 {
        @Test
        @Description("Katalon-demo-cure-Xpath")
        public void KatalonLogin(){
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://katalon-demo-cura.herokuapp.com/");
            driver.findElement(By.id("btn-make-appointment")).click();
            driver.findElement(By.xpath("//input[@id=\"txt-username\"]")).sendKeys("John Doe");
            driver.findElement(By.xpath("//input[@id=\"txt-password\"]")).sendKeys("ThisIsNotAPassword");
            driver.findElement(By.xpath("//button[@id=\"btn-login\"]")).click();
//            try {
//                Thread.sleep(Long.parseLong("3000"));
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            WebElement error_msg=driver.findElement(By.xpath("//p[text()=\"Login failed! Please ensure the username and password are valid.\"]"));
//            String error_msg_text=error_msg.getText();
//            Assert.assertEquals("error_msg_text","Login failed! Please ensure the username and password are valid.");
//           driver.close();

        }

//linkText function can be used when we know the exact matched text.Ex:"Start a free trial"
// partialText function can be used when we know only partial text. EX: "Start a"
    }

