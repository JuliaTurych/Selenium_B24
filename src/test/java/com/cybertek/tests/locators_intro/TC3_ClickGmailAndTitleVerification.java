package com.cybertek.tests.locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_ClickGmailAndTitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String url = "https://www.google.com";
        driver.get(url);
        // <a  href="https://mail.google.com/mail/&amp;ogbl" target="_top"> </a>
// driver.findElement(By.linkText("Почта")).click();
        driver.findElement(By.partialLinkText("mail"));
// verify title contains/starts with Gmail
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(actualTitle)){
            System.out.println("PASS: gmail title verification successful");
        } else {
            System.out.println("Fail: gmail title verification failed");
        }

// go back
        driver.navigate().back();
String googleExpectedTitle = "Google";
String actualActTitle = driver.getTitle();
        if(actualActTitle.equals(googleExpectedTitle)){
            System.out.println("PASS: google title verification successful");
        } else {
            System.out.println("Fail: google title verification failed");
        }

        driver.quit();
    }
}
