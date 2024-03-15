package org.TestPractice;

import io.qameta.allure.Description;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TC08 {

    @Test
    @Description("getcurrenturl,close and quit")
    public void facebooklogin() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
       // driver.quit();
      driver.close();


    }
}
//driver.close();-->close only the current browser not teh full browser
//               and session id gets invalid not null

//driver.quit();-->close the full browser
//               and session id gets null