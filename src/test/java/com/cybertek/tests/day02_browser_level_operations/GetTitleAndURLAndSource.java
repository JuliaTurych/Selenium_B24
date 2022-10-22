package com.cybertek.tests.day02_browser_level_operations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndURLAndSource {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        String url = "https://www.etsy.com";

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        System.out.println("Current title is "+ driver.getTitle());
        String etsyTitle = driver.getTitle();
        System.out.println("etsyTitle = " + etsyTitle);// soutv

        // read url of the current page
        System.out.println("Current url: "+driver.getCurrentUrl());
// store url into a String variable currentUrl
        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);
    
    // read page source and print it
        System.out.println("HTML page source: "+ driver.getPageSource());
    
    String pageSource = driver.getPageSource();
    int charCount = pageSource.length();
        System.out.println("charCount int Page Source " + charCount);
        // close the browser: driver.close(); driver.quit();
        driver.quit();


    }
}
