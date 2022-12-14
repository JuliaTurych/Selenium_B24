package com.cybertek.tests.day06_css_clear;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword_CSS_Test {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        String appUrl = "http://practice.cybertekschool.com/forgot_password";
        driver.manage().window().maximize();
        driver.get(appUrl);

        //<input type="text" name="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" required="">
        WebElement emailField = driver.findElement(By.cssSelector("input[name='email']"));
        emailField.sendKeys("student1@gmail.com");
        // wait 1 sec and clear> type different email
        Thread.sleep(1234);
        emailField.clear();
        emailField.sendKeys("student2@gmail.com");
        for(int i =3; i<10; i++){
            Thread.sleep(1234);
            emailField.clear();
            emailField.sendKeys("student" + i +"@gmail.com");
        }

//        //<button id="form_submit" class="radius" type="submit"> <i class="icon-2x icon-signin">Retrieve password</i></button>
//WebElement retrieveBtn = driver.findElement(By.cssSelector("button[id = 'form_submit']"));
//
//retrieveBtn.click();

driver.quit();
    }
}
