package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MacHomePage {
	
	@FindBy(id="6718376331")
	private WebElement searchtb;
	
	@FindBy(xpath="//i[@class=\"icomoon-search3 nw-searchbar-leftsearchicon\"]")
	private WebElement searchbtn;
	
	@FindBy(xpath="//a[@class=\"nw-mainnav-link   nwc-anchortag\"]")
	private WebElement makeupbtn;
	
	@FindBy(xpath="//a[text()=\"Eyeliner\"]")
	private WebElement eyelinearl;
	
	

	public MacHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void searchtextbox(String key) {
		searchtb.sendKeys(key);
	}
	
	public void searchbutton() {
		searchbtn.click();
	}
	
	public void eyelinearlink() {
		eyelinearl.click();
	}
	public WebElement getMakeupbtn() {
		return makeupbtn;
	}

}
