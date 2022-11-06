package com.cybertek.tests.day10_dropdown_alerts_iframes_windows;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CarGurusUsedCarSearchTest {
    String url = "https://www.cargurus.com";
    WebDriver driver; // can use in every method

    @BeforeClass
    public void setUp() {
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(url);
    }

        @Test
        public void searchForMinivanTest(){
        String expTitle = "Buy & Sell Cars: Reviews, Prices, and Financing - CarGurus";
        String currTitle = driver.getTitle();
            Assert.assertEquals(currTitle,expTitle);
            //select Toyota
            driver.findElement(By.xpath("//label[@for='heroSearch-tab-1']")).click();

            Select make = new Select(driver.findElement(By.id("carPickerUsed_makerSelect")));
            make.selectByVisibleText("Toyota");

            //<option value="d308" class="selectOption">Sienna</option>
            Select model = new Select(driver.findElement(By.id("carPickerUsed_modelSelect")));
            model.selectByValue("d308");

            //type zip code
            WebElement zipcode = driver.findElement(By.name("zip"));
            zipcode.sendKeys("60090");

            //print currently selected options of make and model
            System.out.println("Selected Make = "+ make.getFirstSelectedOption().getText());
            System.out.println("Selected Model = "+ model.getFirstSelectedOption().getText());

            //click on search
            WebElement searchBtn = driver.findElement(By.id("dealFinderForm_0"));
            searchBtn.click();

            //<span class="eegHEr" data-cg-ft="page-navigation-number-of-listings"><strong>1 - 15</strong> of <strong>385</strong> results</span>
            WebElement result = driver.findElement(By.xpath("//span[@class='eegHEr']/strong[2]"));
            System.out.println("Result is " + result.getText()+ " cars in your area");

            //assert that result is more than 0
            int count = Integer.parseInt(result.getText());

            Assert.assertTrue(count>0);
        }

        @AfterClass
    public void tearDown(){
        driver.quit();
        }




}
