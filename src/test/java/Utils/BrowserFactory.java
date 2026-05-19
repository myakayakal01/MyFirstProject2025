package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class BrowserFactory {

       static WebDriver driver;

        public static WebDriver startBrowser(String browserName,String url){
            if(browserName.equalsIgnoreCase("chromE")){
                ChromeOptions chromeOptions = new ChromeOptions();
                //ChromeOptions.addArguments("--headless");
                driver = new ChromeDriver(chromeOptions);
            } else if(browserName.equalsIgnoreCase("InternetExplorer")){
                driver = new InternetExplorerDriver();
            } else if(browserName.equalsIgnoreCase("firefox")){
                driver = new FirefoxDriver();
            } else if(browserName.equalsIgnoreCase("safari")) {
                driver = new SafariDriver();
            } else{
                    driver = new EdgeDriver();
                }
                driver.manage().window().maximize();
                driver.get(url);
                return driver;
            }

            @Test
            public void test(){

                startBrowser("chrome","https://www.saucedemo.com/");

            }
        }





