package org.TestPractice;

import io.qameta.allure.Description;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TC07 {

    @Test
    @Description("Pageloadstartegy None mode")
    public void facebooklogin() {
        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.setPageLoadStrategy(PageLoadStrategy.NONE);
        WebDriver driver = new ChromeDriver(chromeoptions);
        driver.get("https://www.facebook.com/login/");
        System.out.println(driver.getTitle());
        driver.quit();


    }
}
