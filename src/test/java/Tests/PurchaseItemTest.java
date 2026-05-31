package Tests;

import Pages.HomePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


@Test
public class PurchaseItemTest extends Base{


     public void enterUserName()
     {
         loginPage.enterUserName("standard_user");

     }

     @Test(dependsOnMethods = "enterUserName")
     public void enterPassword()
     {
         loginPage.enterPassword("secret_sauce");
     }

     @Test(dependsOnMethods = "enterPassword")
     public void clickLoginButton()
     {
         loginPage.clickLoginButton();
     }

     public void verifyLoginSuccess()
     {
        // HomePage.verifyProductsText();
     }


     @AfterTest
     public void closeBrowser()
     {
         driver.quit();
     }

}
