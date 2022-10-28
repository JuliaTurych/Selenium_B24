package com.cybertek.tests.day07_findEkements;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalculatorAddTest {
    public static void main(String[] args) throws InterruptedException {
        String appUrl = "https://www.calculator.net";
        int num1 = 5;
        int num2 = 3;
        int expectedResult = 8;

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.get(appUrl);

        //<span onclick="r(5)" class="scinm">5</span>
        WebElement five = driver.findElement(By.cssSelector("span[onclick='r(5)']"));
        //<span onclick="r(3)" class="scinm">3</span>
        WebElement three = driver.findElement(By.cssSelector("span[onclick='r(3)']"));
        //<span onclick="r('+')" class="sciop">+</span>  // //*[@id="sciout"]/tbody/tr[2]/td[2]/div/div[1]/span[4]
WebElement plus = driver.findElement(By.xpath("//span[@onclick=\"r('+')\"]"));
//<span onclick="r('=')" class="scieq">=</span>
WebElement equals = driver.findElement(By.cssSelector("span[onclick=\"r('=')\"]"));

//<div id="sciOutPut">&nbsp;8</div>
        WebElement resultField = driver.findElement(By.xpath("//div[@id='sciOutPut']"));


        five.click();  Thread.sleep(1234); plus.click(); Thread.sleep(1234); three.click(); Thread.sleep(1234); equals.click();

        int result = Integer.parseInt(resultField.getText().trim()) ;

        if(result == expectedResult){
            System.out.println("PASS: result is correct");
            System.out.println("5+3 =" + result);
        } else {
            System.out.println("FAILED: result don't match with expected result");
            System.out.println(result);
        }

driver.quit();

    }
}
