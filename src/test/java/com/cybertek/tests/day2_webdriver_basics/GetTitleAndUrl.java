package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndUrl {

    public static void main(String[] args) {


        ////Task open chrome and navigate to http://practice.cybertekschool.com

        WebDriverManager.chromedriver().setup();


        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com");

        //getting title with selenium
        //to get this hold option button and entre entre
        //shortcut for creating variable
        //option entre entre
        //getTitle()-->get you the titel of the page
        String title = driver.getTitle();



        //soutv +entre print variable name and valur
        System.out.println("title = " + title);


        //getCurrentUrl --> get the url from browser
        //driver.currenturl option entre entre
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        //getPageSource()--> gets the source of the page
        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);

    }
}