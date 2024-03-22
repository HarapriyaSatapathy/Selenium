 package org.TestPractice.Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC11 {

        @Test
        @Description("Verifythe current url,title of VWO app")
        public void VWOLogin() {
                WebDriver driver = new ChromeDriver();
                driver.get("https://app.vwo.com/#/login");
                System.out.println(driver.getTitle());
                Assert.assertEquals(driver.getTitle(),"Login - VWO");
                Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
                driver.quit();
        }
}
