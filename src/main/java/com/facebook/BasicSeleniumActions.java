package com.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSeleniumActions {
    public static void main(String[] args) throws InterruptedException {
        //1- Open the browser
        WebDriver driver = new ChromeDriver();

        //2- Enter the url
        driver.get("https://www.facebook.com/");

        //3- Capture Title of the page
        String pageTitle = driver.getTitle();
        System.out.println("Page Title is: " + pageTitle);

        //4- Apply wait in Selenium
        Thread.sleep(5000);

        //4- Close the browser
        driver.close();


    }
}
