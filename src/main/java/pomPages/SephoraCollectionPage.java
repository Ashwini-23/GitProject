package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SephoraCollectionPage {
	
	@FindBy(xpath="//span[text()=\"SHOP NNNOW\"]")
	private WebElement shopnowbtn;
	
	@FindBy(xpath="//button[text()=\"ADD TO BAG\"]")
	private WebElement addtobagbtn;
	
	public SephoraCollectionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void shopnowbutton() {
		shopnowbtn.click();
	}
	
	public void addtobagbutton() {
		addtobagbtn.click();
	}
	
}
