package com.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LearningTestNG
{
    @BeforeMethod
    public void openBrowserAndEnterURL()
    {
        System.out.println("@BeforeMethod: This method will launch browser and enter the url...");
    }
    @Test
    public void login()
    {
        System.out.println("@Test: This is Dummy Code for Login Page....");
    }

    @Test
    public void register()
    {
        System.out.println("@Test: This is Dummy Code for Register Page....");

    }
    @Test
    public void product()
    {
        System.out.println("@Test: This is Dummy Code for Product Page....");

    }

    @AfterMethod
    public void closeBrowser()
    {
        System.out.println("@AfterMethod: This is dummy code for closing the browser...");
    }

    @BeforeClass
    public void connectToDb()
    {
        System.out.println("@BeforeClass: This is dummy code for connecting with DB");
    }
}
