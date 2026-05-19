package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class TakeScreenshot {

       private static final String ScreenshotPath = System.getProperty("user.dir") + "/Screenshots/";


       public void takeScreenshot(WebDriver driver,String screenshotName) {

           TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
           File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
           File destination = new File(ScreenshotPath + screenshotName + ".jpeg");

           try {
                FileUtils.copyFile(src, destination);
           } catch (IOException e) {
               e.printStackTrace();
           }


       }


}
