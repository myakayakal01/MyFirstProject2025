package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CheckoutCompletePage {

       WebDriver driver;
       public CheckoutCompletePage(WebDriver driver) {
        this.driver = driver;
       }


       @FindBy(xpath = "//*[@id=\"checkout_complete_container\"]/h2")
       WebElement checkoutCompleteTitle;

       public void verifyCheckoutCompleteTitle() {
           String checkoutCompleteTitleText = checkoutCompleteTitle.getText();
           Assert.assertEquals(checkoutCompleteTitleText, "THANK YOU FOR YOUR ORDER");
       }


}
