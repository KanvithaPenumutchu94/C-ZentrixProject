package com.framework.testCases;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.framework.pages.C_Zentrix_Page;


@Listeners(value=com.framework.listeners.ITestListener.class)
public class RunnerClass extends BaseClass {
	
	C_Zentrix_Page c_zentrxiPage;
	
	@Test
	public void RunnerTest() throws IOException, InterruptedException  {
		logger.info("Starting the TestCase");
		
		c_zentrxiPage=new C_Zentrix_Page();
		
		c_zentrxiPage.enterAgentID();
		logger.info("Entered AgentID");
			
		c_zentrxiPage.enterPassword();
		logger.info("Entered Password");

		
		c_zentrxiPage.clickOnLoginBtn();
		logger.info("Clicked on Login button");

		
		c_zentrxiPage.handlingYesBtn();
		logger.info("Clicked on Yes button");
		
		
		c_zentrxiPage.handlingResumeBtn();
		logger.info("Clicked on Resume button");
		
		c_zentrxiPage.clickOnPreviewMode();
		logger.info("Clicked on Preview mode");
		
		c_zentrxiPage.clickOnCZ_IconBtn();
		logger.info("Clicked on CZ_Icon");
		
		
		c_zentrxiPage.clickOnCallPanelTab();
		logger.info("Clicked on CallPanel");
		
		c_zentrxiPage.clickOnDailBtn();
		logger.info("Clicked on Dail button");
		
		c_zentrxiPage.enterNoInSearchKeypad();
		logger.info("Entered mobile no in SearchKeypad");
		
		c_zentrxiPage.clickOnDailKeypadBtn();
		logger.info("Clicked on DailKeypad button");
		
		c_zentrxiPage.clickOnAddCustomer();
		logger.info("Clicked on AddCustomer");
		
		c_zentrxiPage.clickOnSelectListDD();
		logger.info("Clicked on SelectList DropDown");
		
		c_zentrxiPage.selectValueFromDD();
		logger.info("Selected value from the dropdown");
		
		c_zentrxiPage.clickOnAddCustomerBtnFromDD();
		logger.info("Clicked on Add customer button in Dropdown");
		
		c_zentrxiPage.enterCommentOnCommentBox();
		logger.info("Entered comment");
		
		c_zentrxiPage.clickOnEndCallBtn();
		logger.info("Clicked on End Call button");
		
		c_zentrxiPage.clickOnSettingIcon();
		logger.info("Clicked on Setting icon");
		
		c_zentrxiPage.clickOnLogoutBtn();
		logger.info("Clicked on Logout button");
		
		c_zentrxiPage.verification();
		logger.info("Successfully completed the TestCase");
	}

}
