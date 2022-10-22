package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        //  1)set up the browser driver
        WebDriverManager.chromedriver().setup();

        // open browser
        WebDriver driver = new ChromeDriver();

        // navigate to Tesla homepage
     driver.get("https://www.tesla.com/");
        System.out.println("Title Tesla"+ driver.getTitle());
driver.get("https://www.google.com");
        System.out.println("Title Google"+ driver.getTitle());

        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(3000);

        driver.navigate().refresh();

        Thread.sleep(2000);
        driver.navigate().to("https://www.bestbuy.com");

        //print title of the page
        System.out.println("Current title:" + driver.getTitle());
        //close the browser
        driver.quit();
    }
}
