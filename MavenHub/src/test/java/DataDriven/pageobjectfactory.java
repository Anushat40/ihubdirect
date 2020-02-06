package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class pageobjectfactory extends dataprovider {
	private static final String Keys_ENTER = null;
	public static WebDriver driver;
	private By signin = By.xpath("(//a[@class='sbold'])[1]");
	private By uid = By.xpath("(//input[@type=\"text\"])[7]");
	private By passid = By.name("password");
	private By submit = By.xpath("(//button[@type=\"submit\"])[2]");
	
	

	public pageobjectfactory(WebDriver driver) {
		pageobjectfactory.driver = driver;
	}

	public void login() throws IOException {
		dataprovider o = new dataprovider();
		String user = o.dp();
		String pass = o.dp();
		driver.findElement(uid).sendKeys(user);
		driver.findElement(passid).sendKeys(pass);
		driver.findElement(submit).click();
	}

	public void location(String location) {
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(location);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(Keys.ENTER);
	}

	public void signin() {
		driver.findElement(signin).click();
	}
}
