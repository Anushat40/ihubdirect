package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Directtest.baseclass;
import com.google.common.collect.Table.Cell;

public class dataprovider extends baseclass {
	public String user;
	public String pass;

	public String dp() throws IOException {
		FileInputStream fis = new FileInputStream("//home//anushat//Desktop//Login.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		for (int i = 1; i <= 1; i++) {
			user = sh.getRow(i).getCell(1).getStringCellValue();
			pass = sh.getRow(i).getCell(2).getStringCellValue();
		}
		return user;
	}
}
