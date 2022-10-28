package com.cybertek.tests.day04_locators_getattribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeDemo {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String url = "https://www.google.com/";
        driver.get(url);

        WebElement searchField = driver.findElement(By.name("q"));
        System.out.println("class value = "+ searchField.getAttribute("class"));

        /**<input class="gNO89b" value="Google Search" aria-label="Google Search" name="btnK" role="button" tabindex="0" type="submit" data-ved="0ahUKEwi_pqXOs_X6AhVTkIkEHd5NBqQQ4dUDCA8">

         */
        System.out.println("max length: "+ searchField.getAttribute("maxlength"));
searchField.sendKeys("wooden spoon");
//read the value that is in the search field
        System.out.println("current value "+searchField.getAttribute("value"));

        searchField.sendKeys("book");
        System.out.println("current value "+searchField.getAttribute("name"));


        driver.quit();

    }
}
