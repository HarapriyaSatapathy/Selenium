package org.TestPractice.Xpath;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC16 {

    @Test
    @Description("Dynamic Element find by Xpath functions")

    public void FlipkartLogin(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
      /* try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

       */

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.findElement(By.xpath("//img[(@src='https://rukminim2.flixcart.com/fk-p-flap/1600/270/image/60b019a3f4125e28.png?q=20')]")).isDisplayed();
        driver.findElement(By.xpath("//div[@class='_8S67Ib'][2]")).isDisplayed();

    }
}
