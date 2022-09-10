

package com.website.scripts;
import java.io.IOException;
import org.testng.annotations.Test;
import com.website.constants.AutomationConstants;
import com.website.excelutilities.Excelutility;


import com.website.login.Loginpage2;
import com.website.login.Loginpage4;

import org.openqa.selenium.By;
import org.testng.Assert;




	public class TC_039 extends TestBase {
		Loginpage4 objLogin4;
		@Test(priority=1)
	    public void verifyValidLogin() throws IOException, InterruptedException {
	    objLogin4 = new Loginpage4(driver);
	    Thread.sleep(5000);
	    objLogin4.click_Coursebutton();
	    Thread.sleep(5000);
	    objLogin4.click_DigitalMarketingbutton();
	    Thread.sleep(5000);

	    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
	    String actualTitle =driver.getTitle();
	    Assert.assertEquals(expectedTitle,actualTitle);
	  
	    }



	}



