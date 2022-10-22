package com.cybertek.tests.day02_browser_level_operations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.yahoo.com/");
        String currentTitle = driver.getTitle();
        System.out.println("Current title "+ currentTitle +" and expected title: Yahoo "+ currentTitle.contains("Yahoo"));
driver.get("https://www.google.com");
String currentUrl = driver.getCurrentUrl();
        currentTitle = driver.getTitle();

        System.out.println("Current URL "+ currentUrl +" and expected URL: google "+ (currentUrl.contains("google") ? "true" : "false"));
        System.out.println("Current title: "+ currentTitle + " expected : google " + currentTitle.contains("google"));

    }
}
