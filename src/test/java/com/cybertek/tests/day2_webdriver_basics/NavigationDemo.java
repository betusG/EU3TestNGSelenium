package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

    public static void main(String[] args) throws InterruptedException { //sleep automaticly put in her after red warning

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");//driver navigate to page

        //navigate to another website with different selenium metod
        driver.navigate().to("https://facebook.com");

        //this line means wait 3 second and move on
        Thread.sleep(3000);//this 3000 millis means 3 second

        //it naviget to google facebook now we we want to go back to google previos page
        //navigates to perivios page
        driver.navigate().back();








    }
}
