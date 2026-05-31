package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage {


    @FindBy(id = "checkout")
    WebElement checkout;

    public void clickCheckout(){
        checkout.click();
    }

}
