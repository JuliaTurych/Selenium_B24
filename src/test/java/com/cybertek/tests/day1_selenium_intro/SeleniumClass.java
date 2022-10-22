package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClass {
    public static void main(String[] args) {
       //1 set up the web driver
        WebDriverManager.chromedriver().setup();;

        // 2 create the instance of chrome driver
        WebDriver driver = new ChromeDriver();

        // 3 test if driver is working
        driver.get("https://www.google.com/");
        String title = driver.getTitle().toLowerCase();
        System.out.println(title);
        if (title.contains("google")){
            System.out.println("fine");
        }else {
            System.out.println("no");
        }

    }
}
