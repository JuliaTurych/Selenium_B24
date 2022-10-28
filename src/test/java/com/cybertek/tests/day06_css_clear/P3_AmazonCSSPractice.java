package com.cybertek.tests.day06_css_clear;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_AmazonCSSPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        String appUrl = "https://www.amazon.com/";
        driver.get(appUrl);
        Thread.sleep(2000);

        //<input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off" placeholder="" class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search">
       WebElement searchField = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
     //  WebElement searchField = driver.findElement(By.cssSelector("input[name='field-keywords']"));
        // or WebElement searchField = driver.findElement(By.cssSelector("input[name='field-keywords']"));

        Thread.sleep(2000);
        searchField.sendKeys("wooden spoon");
        //<input type="submit" value="Go" title="Go" class="nav-bb-button">
        WebElement submitBtn = driver.findElement(By.cssSelector("input[type='submit']"));
submitBtn.click();

//clear the search input box then search for "iphone 13 case"//<input type="text" id="twotabsearchtextbox" value="wooden spoon" name="field-keywords" autocomplete="off" placeholder="" class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search">
        searchField = driver.findElement(By.cssSelector("input[aria-label='Search']"));
       //<input id="nav-search-submit-button" type="submit" class="nav-input nav-progressive-attribute" value="Go" tabindex="0">
        submitBtn = driver.findElement(By.cssSelector("input[type='submit']"));

        searchField.clear();
        searchField.sendKeys("iphone 14 wooden case");
submitBtn.click();


    }
}
