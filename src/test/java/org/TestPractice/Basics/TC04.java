package org.TestPractice.Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TC04 {

    @Test
    @Description("incognito mode")
    public void facebooklogin() {
        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(chromeoptions);
        driver.get("https://www.facebook.com/login/");
        System.out.println(driver.getTitle());

        driver.quit();
    }
}
