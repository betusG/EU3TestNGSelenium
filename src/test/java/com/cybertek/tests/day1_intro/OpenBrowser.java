package com.cybertek.tests.day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

    public static void main(String[] args) {

        //we have to enter this line every time we wna to open chrome
        //hey webdrivermanager can you make chrome ready for me for automation

       // WebDriverManager.chromedriver().setup();//making your browser getting ready for search

       // WebDriver driver = new ChromeDriver();// this line gives us empty brand new chrome
        //we create object from chrome driver it comes from selenium
        //weDriver represent the browser
        //we are creating driver from chrome browser
        //new chromeDriver()-->this part will open chrome driver
        //.get (url)metod used for navigation to page

       // driver.get("https://cybertekschool.com");//represent driver
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.facebook.com");


    }
}
