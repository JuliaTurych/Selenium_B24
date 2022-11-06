package com.cybertek.tests.day09_testNG_dropDown;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGIntro {
    //can be used by each test
    String url = "https://www.etsy.com";

@BeforeClass
    public void setUp(){
        System.out.println("@Before class Setup method...");
        System.out.println("Open browser and navigating to ..."+ url);
    System.out.println("========================================================");
    }
    @BeforeMethod
    public void setUpApp(){
        System.out.println("Before method is runnning...");
        System.out.println("Navigating to "+ url);
        System.out.println("====================================================");
    }
    @Test(priority = 1)// run first
    public void test1(){
        System.out.println("Running test1 ...");
        int num = 10;
        Assert.assertEquals(10,num);
    }

    @Test(priority = 2)
    public void myTest2(){
        System.out.println("Running my Test");
        String name = "Bob";
        Assert.assertTrue(name.contains("b"));
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("Before Method is running...");
        System.out.println("================================");
    }

    @AfterClass
    public void cleanUp(){
        System.out.println("After class method is running...");
        System.out.println("================================");
}

}
