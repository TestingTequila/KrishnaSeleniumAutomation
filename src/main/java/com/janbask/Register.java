package com.janbask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Register {
    public static void main(String[] args) {
        //1. Open the browser
        WebDriver driver = new ChromeDriver();

        //2. Enter the Url
        driver.get("https://janbaskdemo.com/");

        //3. Click on My Account Icon
        WebElement myAccountIcon = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        myAccountIcon.click();

        //4. Click on Register Link
        WebElement registerLink = driver.findElement(By.xpath("//a[text() ='Register']"));
        registerLink.click();

        //5. Fill the Registration form
        WebElement firstNameTextBox = driver.findElement(By.id("input-firstname"));
        firstNameTextBox.sendKeys("Aftab");

        WebElement lastNameTextBox = driver.findElement(By.name("lastname"));
        lastNameTextBox.sendKeys("Ahmad");

        WebElement emailTextBox = driver.findElement(By.id("input-email"));
        emailTextBox.sendKeys("aftab.ahmad@janbask.com");

        WebElement telephoneTextBox = driver.findElement(By.id("input-telephone"));
        telephoneTextBox.sendKeys("56456456");

        WebElement countryDropDown = driver.findElement(By.id("input-country"));
        Select country = new Select(countryDropDown);
        country.selectByValue("99");

        WebElement passwordTextBox = driver.findElement(By.id("input-password"));
        passwordTextBox.sendKeys("test@1234");

        WebElement passwordConfirmTextBox = driver.findElement(By.id("input-confirm"));
        passwordConfirmTextBox.sendKeys("test@1234");

        WebElement yesRadioButton = driver.findElement(By.name("newsletter"));
        yesRadioButton.click();

        WebElement subscriptionDropDown = driver.findElement(By.name("subscription"));
        Select subscribe = new Select(subscriptionDropDown);
        subscribe.selectByValue("Monthly");

        //6. Check 'Privacy Policy' checkbox
        WebElement privacyPolicyCheckBox = driver.findElement(By.name("agree"));
        privacyPolicyCheckBox.click();

        //7. Click on Continue button
        WebElement continueButton = driver.findElement(By.id("submitbtn"));
        continueButton.click();

        //8. Validate Registration Status
        String pageTitle = driver.getTitle();
        if (pageTitle.equals("Your Account Has Been Created!")) {
            System.out.println("Registration is Successful...");
        } else {
            System.out.println("User Already Registered with given email id....");
        }
        //9. Close the browser
        driver.close();

    }
}
