package org.TestPractice.Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01 {

    @Test
    @Description("Verify facebook title")

    public void facebooklogin(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        System.out.println(driver.getTitle());
        driver.quit();
    }

}
