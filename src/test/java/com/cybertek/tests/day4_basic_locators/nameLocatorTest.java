package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class nameLocatorTest {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //how to make browser bigger size
        driver.manage().window().maximize();//maximize work for windows and mac both
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullNameInput = driver.findElement(By.name("full_name"));
        fullNameInput.sendKeys("mike Smith");

        //task
        //put some email and click  sign up button

        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("mike@smith.com");

        //lazy way to write above code
        //driver.findElement(By.name("email")).sendKeys("mike@smith.com");

        WebElement signUpButton = driver.findElement(By.name("wooden spoon"));
        signUpButton.click();

        // lazy way to write above code

        //driver.findElement(By.name("wooden_spoon")).click();








    }
}
