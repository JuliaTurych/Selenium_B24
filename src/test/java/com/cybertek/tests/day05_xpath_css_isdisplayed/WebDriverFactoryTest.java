package com.cybertek.tests.day05_xpath_css_isdisplayed;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class WebDriverFactoryTest {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com");

        WebDriver driver2 = WebDriverFactory.getDriver("Chrome");
        driver2.get("https://www.google.com");

        WebDriver driver3 = WebDriverFactory.getDriver("Chrome");
        driver3.get("https://www.cydeo.com");






    }
}
