package com.cybertek.tests.day04_locators_getattribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PercentageCalculatorTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String url = "https://www.calculator.net/";
        driver.get(url);
        driver.findElement(By.linkText("Percentage Calculator")).click();
        String currentTitle = driver.getTitle();
        String expTitle = "Percentage Calculator";
        if(currentTitle.equals(expTitle)){
            System.out.println("PASS:  titles is matched");
        } else {
            System.out.printf("FAILED: titles don't matched ");
        }

        driver.findElement(By.id("cpar1")).sendKeys("20");
        driver.findElement(By.id("cpar2")).sendKeys("120000"+ Keys.ENTER);
      //  String result = driver.findElement(By.tagName("h2")).getText();
String result =  driver.findElement(By.className("h2result")).getText();
        System.out.printf("Result is: "+ result);
if(result.endsWith("24000")){
    System.out.printf("Pass: calculation is correct");
} else {
    System.out.printf("Failed: calculation is incorrect");

}
        driver.quit();
    }
}
