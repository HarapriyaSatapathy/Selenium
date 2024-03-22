package org.TestPractice.Xpath;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TC19 {
    @Test
    @Description("Find all links and linktext in a page")

    public void FlipkartLogin() {
        WebDriver driver = new ChromeDriver();

        List<WebElement> Linklist = driver.findElements(By.tagName("a"));
        System.out.println(Linklist.size());//to check how many links available
        //for getting all links text we need to go till linklist size one by one, so will use for loop

        for (int i = 0; i <= Linklist.size(); i++) {
            String linktext = Linklist.get(i).getText();
            System.out.println(linktext);
        }
    }
}
