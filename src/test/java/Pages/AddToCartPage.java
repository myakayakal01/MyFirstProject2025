package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage {



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
    WebElement shirt; public void addBackpackToCart() {

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
