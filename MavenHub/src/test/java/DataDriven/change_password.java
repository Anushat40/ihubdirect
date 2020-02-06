package DataDriven;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Directtest.baseclass;

public class change_password extends baseclass {
	private static final OutputType<File> OuputType_FILE = null;

	@Test
	public void tc_1() throws IOException, InterruptedException {
		test = report.createTest("tc_1");
		driver.get("http://183.82.123.14/iHubMultiStoresDirectDev");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		pageobjectfactory page = new pageobjectfactory(driver);
		Thread.sleep(1000);
		page.location("hyderabad");
		Thread.sleep(1000);
		page.signin();
		Thread.sleep(1000);
		page.login();
	}

}
