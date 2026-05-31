package Utils;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromExcel {

    private static final String testDataDir = System.getProperty("user.dir") + "/src/test/java/TestData/TestData.xlsx";

    File excelFile = new File(testDataDir);
    XSSFWorkbook workbook = new XSSFWorkbook(excelFile);


    public ReadFromExcel() throws IOException, InvalidFormatException {

        XSSFSheet sheet = workbook.getSheet("Login Details");

        String username = sheet.getRow(1).getCell(0).getStringCellValue();
        String password = sheet.getRow(2).getCell(0).getStringCellValue();

    }
}
