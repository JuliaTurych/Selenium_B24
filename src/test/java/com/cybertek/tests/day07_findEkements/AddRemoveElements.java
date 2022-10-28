package com.cybertek.tests.day07_findEkements;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddRemoveElements {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");
        //<button onclick="addElement()">Add Element</button>
        WebElement addBtn = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
for (int i = 0; i<50; i++){
addBtn.click();
}

//<button class="added-manually" onclick="deleteElement()">Delete</button>
List<WebElement> deleteBtnS = driver.findElements(By.xpath("//button[@onclick='deleteElement()']"));

//count of delete buttons
        System.out.println("Count buttons "+ deleteBtnS.size());
if(deleteBtnS.size() ==50){
    System.out.println("Pass: 50 buttons added successfully");
} else{
    System.out.println("Failed cannot find 50 buttons");
}

//        for (WebElement eachBtn : deleteBtnS ){
//            eachBtn.click();
//        }
        // for each method with lambda expression (->)
        deleteBtnS.forEach(deleteBtn -> deleteBtn.click());

        //run findElements again for delete buttons again and see if it is 0
        deleteBtnS = driver.findElements(By.xpath("//button[@onclick='deleteElement()']"));
if(deleteBtnS.size() == 0){
    System.out.println("pass: all 50 btns deleted succesfully");
} else {
    System.out.println("fail: couldn't delete all 50 buttons");
}

driver.quit();


    }
}
