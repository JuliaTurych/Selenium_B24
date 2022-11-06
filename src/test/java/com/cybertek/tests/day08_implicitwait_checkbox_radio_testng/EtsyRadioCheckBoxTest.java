package com.cybertek.tests.day08_implicitwait_checkbox_radio_testng;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class EtsyRadioCheckBoxTest {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://www.etsy.com/";

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();

        //implicit wait command
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);

        WebElement searchField = driver.findElement(By.name("search_query"));
        searchField.sendKeys("Wooden spoon"+ Keys.ENTER);

        //click on all filters
        //<div class="wt-pr-xs-1" data-search-filter-button="">
        //    <button id="search-filter-button" class="wt-btn wt-btn--small wt-btn--secondary wt-display-flex-xs wt-align-items-center" aria-controls="search-filters-overlay">
        //        <span class="wt-icon wt-icon--smaller-xs"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" aria-hidden="true" focusable="false"><path d="M5,7.6h5.7c0.4,1.2,1.5,2,2.8,2s2.4-0.8,2.8-2H19c0.6,0,1-0.4,1-1s-0.4-1-1-1h-2.7c-0.4-1.2-1.5-2-2.8-2s-2.4,0.8-2.8,2H5 c-0.6,0-1,0.4-1,1S4.4,7.6,5,7.6z M13.5,5.6c0.6,0,1,0.4,1,1s-0.4,1-1,1s-1-0.4-1-1S12.9,5.6,13.5,5.6z"></path><path d="M19,11.1h-7.7c-0.4-1.2-1.5-2-2.8-2s-2.4,0.8-2.8,2H5c-0.6,0-1,0.4-1,1c0,0.6,0.4,1,1,1h0.7c0.4,1.2,1.5,2,2.8,2 s2.4-0.8,2.8-2H19c0.6,0,1-0.4,1-1C20,11.5,19.6,11.1,19,11.1z M8.5,13.1c-0.6,0-1-0.4-1-1c0-0.6,0.4-1,1-1s1,0.4,1,1 C9.5,12.7,9.1,13.1,8.5,13.1z"></path><path d="M19,16.6h-1.2c-0.4-1.2-1.5-2-2.8-2s-2.4,0.8-2.8,2H5c-0.6,0-1,0.4-1,1s0.4,1,1,1h7.2c0.4,1.2,1.5,2,2.8,2s2.4-0.8,2.8-2 H19c0.6,0,1-0.4,1-1S19.6,16.6,19,16.6z M15,18.6c-0.6,0-1-0.4-1-1s0.4-1,1-1s1,0.4,1,1S15.6,18.6,15,18.6z"></path></svg></span>
        //        <span class="wt-hide-xs wt-show-md filter-expander">All Filters</span>
        //    </button>
        //</div>
        //
        WebElement allFilters = driver.findElement(By.id("search-filter-button"));

        allFilters.click();

        //<input type="checkbox" id="special-offers-free-shipping" name="free_shipping" value="true" autocomplete="off">
        WebElement freeShipping = driver.findElement(By.xpath("//label[@for='special-offers-free-shipping']"));
freeShipping.click();

WebElement onSale = driver.findElement(By.xpath("//label[@for='special-offers-on-sale']"));
onSale.click();

//<input type="radio" id="price-input-1" name="price_bucket_range" value="_25" class="radio price-bucket" data-path="_25" data-context="price" aria-label="Under $25" autocomplete="off">
        WebElement under25 = driver.findElement(By.xpath("//label[@for='price-input-1']"));
        under25.click();


        //<button class="wt-btn wt-btn--primary wt-width-full wt-mt-xs-3 wt-mb-xs-3 wt-mr-xs-3" type="submit" form="search-filter-form" aria-label="Apply" data-wt-overlay-close="">
        //        Apply
WebElement applyBtn = driver.findElement(By.xpath("//button[@aria-label='Apply']"));
applyBtn.click();

Thread.sleep(2000);
WebElement resultCount = driver.findElement(By.xpath("//span[contains(text(),'results')][1]"));
        System.out.println("Results = "+resultCount.getText());


driver.quit();

    }
}
