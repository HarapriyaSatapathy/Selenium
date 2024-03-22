package org.TestPractice.Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC13 {
        @Test
        @Description("Linktext and Partial Text")
        public void VWONewLogin() {
            WebDriver driver=new ChromeDriver();
            driver.get("https://app.vwo.com/");
           // WebElement anchor_tag= driver.findElement(By.linkText("Start a free trial"));
            WebElement anchor_tag= driver.findElement(By.partialLinkText("Start a free"));
            System.out.println(anchor_tag.getAttribute("href"));
           anchor_tag.click();

           driver.close();

        }

//linkText function can be used when we know the exact matched text.Ex:"Start a free trial"
// partialText function can be used when we know only partial text. EX: "Start a"
    }

