package com.cybertek.tests.day05_xpath_css_isdisplayed;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleMapsXPathTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        String url = "https://www.google.com/maps";
        driver.manage().window().maximize();
        driver.get(url);

        WebElement adressField = driver.findElement(By.xpath("/html/body/div[3]/div[9]/div[3]/div[1]/div[1]/div[1]/div[2]/form/div[2]/div[3]/div/input[1]"));
adressField.sendKeys("cybertek school"+ Keys.ENTER);

Thread.sleep(4000);

WebElement  directions = driver.findElement(By.xpath("/html/body/div[3]/div[9]/div[9]/div/div/div[1]/div[2]/div/div[1]/div/div/div[4]/div[1]/button/span"));
directions.click();
Thread.sleep(5000);

//driver.findElement(By.xpath("//*[@id=\"sb_ifc51\"]/input")).sendKeys("check");
WebElement startingAdress = driver .findElement(By.xpath("//input[@placeholder = 'Choose starting point, or click on the map...']"));
startingAdress.sendKeys("Charlotte, NC"+ Keys.ENTER);
Thread.sleep(5000);
driver.quit();
    }
}
