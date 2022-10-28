package com.cybertek.tests.day05_xpath_css_isdisplayed;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MultipleButtomsXpathTest {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement button1 = driver.findElement(By.xpath("//button[@onclick = 'button1()']"));
        button1.click();
WebElement resultMsg = driver.findElement(By.xpath("//p[@id = 'result']"));
     // my variant  System.out.println(driver.findElement(By.id("result")).getText());
        System.out.println(resultMsg.getText());

        WebElement button2 = driver.findElement(By.xpath("//button[text()='Button 2']"));
                                                                       //tagName[.='text of element']
if(button2.isDisplayed()){
    System.out.println("PASS:Button 2 is displayed");
    button2.click();
} else{
    System.out.println("FAIL: Button 2 is not displayed");
}
driver.quit();


    }
}
