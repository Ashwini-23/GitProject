package genericlib;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.internal.annotations.ITest;


public class baseClass{
	public WebDriver driver;
	public propertyfile p = new propertyfile();
	public WebDriverUtilities w = new WebDriverUtilities();
	
	
	@BeforeMethod
	public void openApp() throws FileNotFoundException, IOException{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.getData("url"));
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeApp(ITestResult r) throws IOException {
		int status = r.getStatus();
		String name = r.getName();
		if(status==2) {
			screenShot s = new screenShot();
			s.getPhoto(driver, name);
		}
		driver.quit();
	}
	
	

}
