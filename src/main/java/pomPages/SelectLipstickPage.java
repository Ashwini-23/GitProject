package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectLipstickPage {
	
	@FindBy(xpath="//span[text()=\"SHOP NNNOW\"]")
	private WebElement shopnowl;
	
	@FindBy(xpath="//button[@class=\"nwc-btn nwc-ripple-container nwc-btn-primary nw-pdp-addtobag\"]")
	private WebElement addtobagbtn;
	
	public SelectLipstickPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void shopnowlink() {
		shopnowl.click();
	}
	
	public void addtobagbutton() {
		addtobagbtn.click();
	}
	

}
