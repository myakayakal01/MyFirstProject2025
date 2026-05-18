import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class StartChrome {

    WebDriver driver;

    @Test
    public void verifyLoginSuccess() throws InterruptedException {

        driver = new ChromeDriver(); //Start Browser
        //driver = new FirefoxDriver(); Start FireFox browser
        //driver = new SafariDriver(); Start Safari browser
        //driver = new EdgeDriver(); Start Edge browser

        driver.manage().window().maximize(); //maximize browser
        driver.get("https://www.saucedemo.com/"); //Open URL
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(1000);
        driver.findElement(By.id("login-button")).click();

        //String ProductText = driver.findElement(By.xpath("//div[@id='box-app-']")).getText();
        String ProductText = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        Assert.assertEquals(ProductText, "Products");

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


        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        Thread.sleep(1000);

        //driver.findElement(By.id("remove-sauce-labs-bike-light")).click();
        //Thread.sleep(1000);

        driver.findElement(By.id("checkout")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("first-name")).sendKeys("Onthatile");
        Thread.sleep(1000);
        driver.findElement(By.id("last-name")).sendKeys("Kgauhelo");
        Thread.sleep(1000);
        driver.findElement(By.id("postal-code")).sendKeys("1993");
        Thread.sleep(1000);

        driver.findElement(By.id("continue")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("finish")).click();

    }


    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}
