package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genericlib.baseClass;
import pomPages.MacHomePage;
import pomPages.SelectLipstickPage;

public class shopLipstick extends baseClass {
	
	@Test
	public void getLipstick() throws FileNotFoundException, IOException {
		MacHomePage mhp = new MacHomePage(driver);
		mhp.searchtextbox(p.getData("search"));
		mhp.searchbutton();
		
		SelectLipstickPage slp = new SelectLipstickPage(driver);
		slp.shopnowlink();
		slp.addtobagbutton();
		
	}

}
