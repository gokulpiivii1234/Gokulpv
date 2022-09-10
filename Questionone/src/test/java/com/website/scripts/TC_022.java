package com.website.scripts;
import java.io.IOException;
import org.testng.annotations.Test;
import com.website.constants.AutomationConstants;
import com.website.excelutilities.Excelutility;


import com.website.login.Loginpage2;

import org.openqa.selenium.By;
import org.testng.Assert;




	public class TC_022 extends TestBase {
		Loginpage2 objLogin2;
		@Test(priority=1)
	    public void verifyValidLogin() throws IOException, InterruptedException {
	    objLogin2 = new Loginpage2(driver);
	    Thread.sleep(5000);
	    objLogin2.click_Coursebutton();
	    Thread.sleep(5000);
	    objLogin2.click_DataScienceandAnalyticsbutton();
	    Thread.sleep(5000);
	   
	    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
	    String actualTitle =driver.getTitle();
	    Assert.assertEquals(expectedTitle,actualTitle);
	  
	    }



	}



