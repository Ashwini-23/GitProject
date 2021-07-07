package scripts;

import org.testng.annotations.Test;

import genericlib.baseClass;
import pomPages.MacHomePage;
import pomPages.SelectProductPage;

public class shopFromBag extends baseClass{
	@Test
	public void getBag() {
	MacHomePage mhp = new MacHomePage(driver);
	mhp.bagiconbutton();
	mhp.continueshoppingbutton();
	
	SelectProductPage spp = new SelectProductPage(driver);
	spp.shopnowbutton();
	spp.addtobagbutton();
	}
}
