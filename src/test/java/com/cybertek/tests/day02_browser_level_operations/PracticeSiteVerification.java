package com.cybertek.tests.day02_browser_level_operations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSiteVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // make browser full screen/maximize
        driver.manage().window().maximize();

        driver.get("https://practice.cybertekschool.com");
String currentUrl = driver.getCurrentUrl();
String title = driver.getTitle();

if(currentUrl.contains("cybertekschool")){
    System.out.println("PASS: URL verification success");

} else {
    System.out.println("FAIL: URL verification failed");
}

if(title.equals("Practice")){
    System.out.println("PASS: title  verification success");
}else {
    System.out.println("FAIL: title verification failed");
}




driver.quit();
    }
}
