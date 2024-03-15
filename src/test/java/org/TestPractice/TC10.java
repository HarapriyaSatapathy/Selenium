package org.TestPractice;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC10 {




        @Test
        @Description("Navigate to diff browsers")


        public void Openbrowser()
        {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/login/");//No back,forward allowed in get
        driver.navigate().to("https://www.google.com");
        driver.navigate().to("https://www.youtube.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().back();
        driver.navigate().refresh();

                driver.quit();
    }
}
