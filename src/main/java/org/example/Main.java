package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.example.LoginAndPassword;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.example.LoginAndPassword.LGN;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://visa.vfsglobal.com/blr/ru/pol/login");
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("mat-input-0")));
        driver.findElement(By.id("mat-input-0")).sendKeys(LGN);
        driver.findElement(By.id("mat-input-1")).sendKeys(LoginAndPassword.PSWD);
        driver.findElement(By.xpath("//span[@class='mat-button-wrapper']")).click();

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        new WebDriverWait(driver, 50).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='col-12 col-sm-auto d-lg-none']/button")));

        driver.findElement(By.xpath("//div[@class='col-12 col-sm-auto d-lg-none']/button")).click();


    }
    
}