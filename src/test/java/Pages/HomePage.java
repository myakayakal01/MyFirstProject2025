package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {


    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement backpack;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement bikeLight;

    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    WebElement boltTShirt;

    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    WebElement fleeceJacket;


    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    WebElement onesie;

    @FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
    WebElement shirt;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement productText;


    public void verifyProductsPage() {
        String actualText = productText.getText();
        Assert.assertEquals(actualText, "Products");
    }


    public void addBackpackToCart() {
        backpack.click();
    }

    public void addBikeLightToCart() {
        bikeLight.click();
    }

    public void addBoltTShirtToCart() {
        boltTShirt.click();
    }

    public void addFleeceJacketToCart() {
        fleeceJacket.click();
    }

    public void addOnesieToCart() {
        onesie.click();
    }

    public void addShirtToCart() {
        shirt.click();
    }

    public void setBackpack(WebElement backpack) {
        this.backpack = backpack;
    }
}
