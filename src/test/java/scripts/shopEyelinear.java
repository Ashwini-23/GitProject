package scripts;

import org.testng.annotations.Test;

import genericlib.baseClass;
import pomPages.MacHomePage;
import pomPages.SelectEyelinearPage;
import pomPages.SephoraCollectionPage;

public class shopEyelinear extends baseClass {
	@Test
	public void getEyelinear() {
		MacHomePage mhp = new MacHomePage(driver);
		w.mouseOver(driver, mhp.getMakeupbtn());
		mhp.eyelinearlink();
		
		
		 SelectEyelinearPage sep = new SelectEyelinearPage(driver);
		 sep.brandbutton();
		 sep.sephoracollectionbutton();
		 
		 SephoraCollectionPage scp = new SephoraCollectionPage(driver);
		 scp.shopnowbutton();
		 scp.addtobagbutton();
	}

}
