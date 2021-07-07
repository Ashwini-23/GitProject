package genericlib;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {
	
	public void DropDown(WebElement ele , String text) {
		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}
	
	public void mouseOver(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	public void doubleClick(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	public void rightClick(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	}
	public void alertPopup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	public void switchFrame(WebDriver driver) {
		driver.switchTo().frame(0);
		
	}
	public void switchBack(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	public void scrollBar(WebDriver driver,int x ,int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollby("+x+" , "+y+")");
		
	}
	
	
	
	

}
