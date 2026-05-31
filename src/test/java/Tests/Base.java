package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Utils.BrowserFactory;
import Utils.TakeScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base{


    BrowserFactory browserFactory =  new BrowserFactory();

    final WebDriver driver = BrowserFactory.startBrowser("chrome", "https://www.saucedemo.com/");

    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

    HomePage homePage = PageFactory.initElements(driver, HomePage.class);

    TakeScreenshot takeScreenshot = new TakeScreenshot();


}
