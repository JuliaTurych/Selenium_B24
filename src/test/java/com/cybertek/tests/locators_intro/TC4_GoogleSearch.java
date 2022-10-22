package com.cybertek.tests.locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4_GoogleSearch {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String url = "https://www.google.com";
        driver.get(url);
        //locate and type "apple" to google search
driver.findElement(By.name("q")).sendKeys("apple");

//locate and click on search bottom
driver.findElement(By.name("btnK")).click();

// if code did not work, try this way:
        //driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);
String actualTitle = driver.getTitle();
String expTitle = "apple";

if(actualTitle.startsWith(expTitle)){
    System.out.println("Pass: title match");
} else {
    System.out.println("Failed: title mismatched");
}

driver.quit();


    }
}
