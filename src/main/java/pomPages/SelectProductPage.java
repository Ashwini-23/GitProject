package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectProductPage {
	
	@FindBy(xpath="(//span[text()=\"SHOP NNNOW\"])[3]")
	private WebElement shopnowbtn;
	
	@FindBy(xpath="//button[text()=\"ADD TO BAG\"]")
	private WebElement addtobagbtn;
	
	public SelectProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void shopnowbutton() {
		shopnowbtn.click();
	}
	
	public void addtobagbutton() {
		addtobagbtn.click();
	}
	

}
