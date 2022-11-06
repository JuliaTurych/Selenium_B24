package com.cybertek.tests.day08_implicitwait_checkbox_radio_testng;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RadioButtonsTest {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://practice.cybertekschool.com/radio_buttons";
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        // wait up to 10 seconds
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);

        //<input type="radio" id="red" name="color">
        WebElement red = driver.findElement(By.id("red"));

        if(!red.isSelected()){
            red.click();
        }

        //<input type="radio" id="basketball" name="sport">
        WebElement basketball = driver.findElement(By.id("basketball"));
        if(!basketball.isSelected()){
            basketball.click();
        }

        //<input type="radio" id="football" name="sport">
        WebElement football = driver.findElement(By.cssSelector("input[id ='football']"));

        if(!football.isSelected()){
            System.out.println("SELECTING FOOTBALL RADIO BUTTON");
            football.click();
        }

if(football.isSelected()){
    System.out.println("PASS: FOOTBALL IS SELECTED");
} else {
    System.out.println("FAILED: FOOTBALL ISN'T SELECTED");
}
//find all radio buttons
        // print the count
        //click one by one
        //use isEnabled method to check if element is active/disabled
List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@type='radio']"));
        System.out.println("There is "+radioButtons.size()+" radio buttons on the page");

        for (WebElement radio : radioButtons) {
            radio.click();
            Thread.sleep(1234);
        }

        driver.quit();



    }
}
