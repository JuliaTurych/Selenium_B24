package com.cybertek.tests.locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC6_BankHeaderVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

String url = "https://www.facebook.com/";

        driver.get(url);

        String expHeader = "Connect with friends";

      String actHeader = driver.findElement(By.tagName("h2")).getText();

      String facebookTitle = "Facebook - log in or sign up";
      String actTitle = driver.getTitle();
      boolean checker = facebookTitle.equals(actTitle) & actHeader.contains(expHeader);


        if(checker){
            System.out.println("PASS: header is desplayed correctly");
        } else{
            System.out.println("FAILED: headers or titles mismatched");
        }


    }
}
