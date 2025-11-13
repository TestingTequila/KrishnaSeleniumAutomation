package com.testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LearningTestNGAttributes
{
    @BeforeMethod
    public void browserAndEnterURL()
    {
        System.out.println("@BeforeMethod: This method will launch browser and enter the url...");
    }
    @Test(priority = 2, dependsOnMethods = "register", alwaysRun = true)
    public void login()
    {
        System.out.println("@Test: This is Dummy Code for Login Page....");
    }

    @Test(priority = 1)
    public void register()
    {
        System.out.println("@Test: This is Dummy Code for Register Page....");
        Assert.fail();

    }
    @Test(priority = 3, enabled = true)
    public void product()
    {
        System.out.println("@Test: This is Dummy Code for Product Page....");

    }

    @Test(priority = 4, enabled = false, alwaysRun = true)
    public void contactUs()
    {
        System.out.println("@Test: This is Dummy Code for Contact Us Page....");

    }
}
