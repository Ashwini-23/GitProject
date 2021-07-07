package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectEyelinearPage {

	@FindBy(xpath="//button[@class=\"nwc-btn nwc-btn-secondary nw-productfilterblock-filterbutton  \"]")
	private WebElement brandbtn;
	
	@FindBy(xpath="//span[text()=\"Sephora Collection\"]")
	private WebElement sephoracollectionbtn;
	
	public SelectEyelinearPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void brandbutton() {
		brandbtn.click();
	}
	
	public void sephoracollectionbutton() {
		sephoracollectionbtn.click();
	}
	
}
