package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartChrome {

    WebDriver driver;
    private static int screenshotCounter = 0;

    // Helper method to take screenshots
    private void takeScreenshot(String pageName) {
        try {
            // Create screenshots directory if it doesn't exist
            String screenshotDir = "screenshots";
            Files.createDirectories(Paths.get(screenshotDir));

            // Generate screenshot filename with counter and timestamp
            screenshotCounter++;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmmss");
            String timestamp = LocalDateTime.now().format(formatter);
            String filename = String.format("%s/%02d_%s_%s.png", screenshotDir, screenshotCounter, pageName, timestamp);

            // Take screenshot
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            Files.copy(screenshot.toPath(), Paths.get(filename));

            System.out.println("Screenshot taken: " + filename);
        } catch (IOException e) {
            System.out.println("Failed to take screenshot: " + e.getMessage());
        }
    }

    @Test
    public void verifyLoginSuccess() throws InterruptedException {

        driver = new ChromeDriver(); //Start Browser
        //driver = new FirefoxDriver(); Start FireFox browser
        //driver = new SafariDriver(); Start Safari browser
        //driver = new EdgeDriver(); Start Edge browser

        driver.manage().window().maximize(); //maximize browser
        driver.get("https://www.saucedemo.com/"); //Open URL
        takeScreenshot("01_LoginPage");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(1000);
        driver.findElement(By.id("login-button")).click();

        //String ProductText = driver.findElement(By.xpath("//div[@id='box-app-']")).getText();
        String ProductText = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        Assert.assertEquals(ProductText, "Products");
        Thread.sleep(1000);
        takeScreenshot("02_ProductsPage");

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
        Thread.sleep(1000);
        takeScreenshot("03_ItemsAdded");


        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        Thread.sleep(1000);
        takeScreenshot("04_CartPage");

        //driver.findElement(By.id("remove-sauce-labs-bike-light")).click();
        //Thread.sleep(1000);

        driver.findElement(By.id("checkout")).click();
        Thread.sleep(1000);
        takeScreenshot("05_CheckoutInfoPage");

        driver.findElement(By.id("first-name")).sendKeys("Onthatile");
        Thread.sleep(1000);
        driver.findElement(By.id("last-name")).sendKeys("Kgauhelo");
        Thread.sleep(1000);
        driver.findElement(By.id("postal-code")).sendKeys("1993");
        Thread.sleep(1000);
        takeScreenshot("06_CheckoutDetailsEntered");

        driver.findElement(By.id("continue")).click();
        Thread.sleep(1000);
        takeScreenshot("07_CheckoutOverviewPage");

        driver.findElement(By.id("finish")).click();
        Thread.sleep(1000);
        takeScreenshot("08_OrderConfirmation");

    }


    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}
