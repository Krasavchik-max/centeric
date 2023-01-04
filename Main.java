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
        System.out.println("До таймаута");
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("После таймаута");
        driver.findElement(By.xpath("//button[contains(@class,'z-index-999')]")).click();

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("//span[contains(@class,'ng-tns-c85-4')]")).click();
        System.out.println("Визовый центр ");
        driver.findElement(By.xpath("//span[contains(text(),'Poland Visa Application Center-Grodno')]")).click();

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//span[contains(@class,'ng-tns-c85-6')]")).click();
        System.out.println("Категория Записи");
        driver.findElement(By.xpath("//span[contains(text(),'National Visa D')]")).click();

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("//span[contains(@class,'ng-tns-c85-8')]")).click();
        System.out.println("Подкатегория");
        driver.findElement(By.xpath("//span[contains(text(),'Karta Polaka D-visa')]")).click();

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement element = driver.findElement(By.xpath("//div[contains(@class,'alert-info')]"));
        String text = element.getText();
        System.out.println(text);

    }

    }
