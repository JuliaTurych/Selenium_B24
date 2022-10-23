package com.cybertek.tests.locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC5_SmartBearLoginTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String appUrl = "https://www.google.com";

String userName = "Tester";
String password = "test";

driver.manage().window().maximize();
driver.get(appUrl);
driver.findElement(By.id("ct100_MainContent_username")).sendKeys(userName);
// enter password
        driver.findElement(By.id("ct100_MainContent_password")).sendKeys(password);
// click on login
        driver.findElement(By.name("ct100_MainContent_button")).click();

        // verify title is "Web Orders"
String expTitle = "WEb Orders";
String actTitle = driver.getTitle();
if(actTitle.equals(expTitle)){
    System.out.println("PASS: login success");
} else{
    System.out.println("Failed: login failed");
}
// click logout link
        driver.findElement(By.linkText("Logout")).click();

        driver.close();





    }
}
