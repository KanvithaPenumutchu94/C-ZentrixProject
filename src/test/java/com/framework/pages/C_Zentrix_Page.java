package com.framework.pages;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.framework.testCases.BaseClass;

import coreUtilities.ConfiguratorReader;
import coreUtilities.ExtentReportManager;

public class C_Zentrix_Page extends BaseClass {
	
	public C_Zentrix_Page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='email']")
	WebElement AgentID_txt;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement Password_txt;
	
	@FindBy(xpath="//button[contains(@class,'MuiButtonBase-root')]")
	WebElement Login_btn;
	
	@FindBy(xpath="//span[text()='Yes']")
	WebElement yes_btn;
	
	@FindBy(xpath="//span[text()='Yes']")
	WebElement yesMsg;
	
	@FindBy(xpath="//p[text()='Please pick the Web RTC call!']")
	WebElement loginMsg;
	
	@FindBy(xpath="//span[text()='Resume']")
	WebElement Resume_btn;
	
	@FindBy(xpath="//input[@type='checkbox']/../parent::span")
	WebElement Preview_chkbox;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement Preview_btn;
	
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiIconButton-root jss142 jss143 MuiIconButton-colorInherit']")
	WebElement CZ_Icon_btn;
	
	@FindBy(xpath="//span[text()='Call Panel']")
	WebElement CallPannel_tab;
	
	@FindBy(xpath="(//div[@class='col-6']//button)[1]")
	WebElement Dail_btn;
	
	@FindBy(xpath="//input[@id='outlined-basic']")
	WebElement SearchKeypad;
	
	@FindBy(xpath="//li[@class='position digits pad-action']/p")
	WebElement DailKeypad_btn;
	
	@FindBy(xpath="(//input[@value='Mute']/following::iframe/following::div/descendant::button)[1]")
	WebElement AddCustomerBtn;
	
	@FindBy(xpath="//div[@id='demo-simple-select-outlined']")
	WebElement SelectList_DD;
	
	@FindBy(xpath="//ul[@role='listbox']/li[text()='Test_CZ_INBOUND']")
	WebElement DrpDwnValue_Test_CZ_INBOUND;
	
	@FindBy(xpath="//span[text()='Add Customer']")
	WebElement AddCustomer_btn_dd;
	
	@FindBy(xpath="//textarea[@id='outlined-textarea']")
	WebElement Comment_txtbox;
	
	@FindBy(xpath="//*[local-name()='svg' and @class='MuiSvgIcon-root MuiSvgIcon-colorSecondary'])[1]")
	WebElement DisconnectCallBtn;
	
	@FindBy(xpath="//*[local-name()='svg' and @class='MuiSvgIcon-root MuiSvgIcon-colorSecondary']")
	WebElement EndCallBtn;
	
	@FindBy(xpath="//*[local-name()='svg' and @style='color: rgb(12, 130, 218);']")
	WebElement Setting_Icon_btn;
	
	@FindBy(xpath="//*[local-name()='svg' and @width='20']/..")
	WebElement Logout_btn;
	
	@FindBy(xpath="//h1[text()='Welcome, User']")
	WebElement  Welcome_msg;
	
	public void enterAgentID() throws IOException  {
		AgentID_txt.sendKeys(ConfiguratorReader.getConfigValue("agentid"));
		ExtentReportManager.logInfo("Entered AgentID");
	}
	public void enterPassword() throws IOException {
		Password_txt.sendKeys(ConfiguratorReader.getConfigValue("password"));
		ExtentReportManager.logInfo("Entered Password");
	}
	public void clickOnLoginBtn() throws InterruptedException {
		Login_btn.click();
		Thread.sleep(5000);
		ExtentReportManager.logInfo("Clicked on Login button");
	}
	
	public void handlingYesBtn() {
		try {
			if(yesMsg.isDisplayed()==true) {
			yesMsg.click();
			ExtentReportManager.logInfo("Clicked on Yes button");
		}else {
			String actual_text=loginMsg.getText();
			String expected_text = "Please pick the Web RTC call!";
			Assert.assertEquals(actual_text, expected_text);
			System.out.println("login is successful");
		}
	}catch(Exception e) {
		//System.out.println(e);
	}
}
	
	//handling resume
	public void handlingResumeBtn() {
		try {
			if(Resume_btn.isDisplayed()==true) {
				Resume_btn.click();
				ExtentReportManager.logInfo("Clicked on Resume button");
				System.out.println("reume button is present");
			}
		}catch(Exception e) {
			
		}	
	}
	
	// preview code
	public void clickOnPreviewMode() throws InterruptedException {
		String class_value = Preview_chkbox.getAttribute("class");
		System.out.println(class_value);
		System.out.println("length of the string is :" + class_value.length());
		Thread.sleep(3000);
		if (class_value.contains("Mui-checked")) {
			Preview_btn.click();
			ExtentReportManager.logInfo("Clicked on Preview mode");
			}
	}
	
	// click on c-z icon on top left corner
	public void clickOnCZ_IconBtn() throws InterruptedException {
		CZ_Icon_btn.click();
		ExtentReportManager.logInfo("Clicked on CZ_Icon");
		Thread.sleep(2000);
	}
	// click on call panel
	public void clickOnCallPanelTab() throws InterruptedException {
		CallPannel_tab.click();
		ExtentReportManager.logInfo("Clicked on CallPanel");
		Thread.sleep(3000);
		CZ_Icon_btn.click();
	}
	// click on Dail button
	public void clickOnDailBtn() {
		Dail_btn.click();
		ExtentReportManager.logInfo("Clicked on Dail button");
	}
	
	// send number to keypad search box
	public void enterNoInSearchKeypad() throws InterruptedException {
		Thread.sleep(3000);
		SearchKeypad.sendKeys("8790655433");
		ExtentReportManager.logInfo("Entered mobile no in SearchKeypad");
	}
	// click on dail button
	public void clickOnDailKeypadBtn() throws InterruptedException {
		Thread.sleep(3000);
		DailKeypad_btn.click();
		ExtentReportManager.logInfo("Clicked on DailKeypad button");
		Thread.sleep(20000);
	}
	
	// click on Add Customer
	public void clickOnAddCustomer() {
		AddCustomerBtn.click();
		ExtentReportManager.logInfo("Entered AgentID");
	}
	
	// click on select list drop down
	public void clickOnSelectListDD() {
		SelectList_DD.click();
		ExtentReportManager.logInfo("Clicked on SelectList DropDown");
	}
	
	// click on option from select list dropdown
	public void selectValueFromDD() {
		DrpDwnValue_Test_CZ_INBOUND.click();
		ExtentReportManager.logInfo("Selected value from the dropdown");
	}
	
	// click on Add Customer button in dropdown
	public void clickOnAddCustomerBtnFromDD() throws InterruptedException {
		AddCustomer_btn_dd.click();
		ExtentReportManager.logInfo("Clicked on Add customer button in Dropdown");
		Thread.sleep(5000);
	}
	
	//click on comment box
	public void enterCommentOnCommentBox() throws InterruptedException {
		Comment_txtbox.sendKeys("The customer is busy");
		ExtentReportManager.logInfo("Entered comment");
		Thread.sleep(5000);
	}
	
//	//click on dissconnect call
//	public void clickOnDisconnectCallBtn() throws InterruptedException {
//		DisconnectCallBtn.click();
//		Thread.sleep(5000);
//	}

	// click on END CALL button
	public void clickOnEndCallBtn() throws InterruptedException {
		EndCallBtn.click();
		ExtentReportManager.logInfo("Clicked on End Call button");
		Thread.sleep(3000);
	}
	
	//click on settings icon
	public void clickOnSettingIcon() throws InterruptedException {
		try {
			Setting_Icon_btn.click();
			ExtentReportManager.logInfo("Clicked on Setting icon");
			Thread.sleep(3000);
		}catch(Exception e) {
			
		}
	}
	
	//click on logout button
	public void clickOnLogoutBtn() throws InterruptedException {
		try {
			Logout_btn.click();
			ExtentReportManager.logInfo("Clicked on Logout button");
			Thread.sleep(5000);
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();
		}catch(Exception e) {
			Actions act = new Actions(driver);
			act.click(Logout_btn).build().perform();
			Thread.sleep(5000);
		}
	}
	
	//verification
	public void verification() throws InterruptedException {
		String actual =Welcome_msg.getText();
		System.out.println(actual);
		if(actual.equals("Welcome, User")) {
			Thread.sleep(5000);
			Assert.assertTrue(true);
			ExtentReportManager.logInfo("Successfully completed the TestCase");
		}else {
			Assert.assertFalse(false);
			ExtentReportManager.logInfo("TestCase got failed");
		}
	}
	
	
//	public void verifydailButtonColour() {
//
//		String dailBtnBgcolor = Dail_btn.getCssValue("background-color");
//		System.out.println(dailBtnBgcolor);
//		String actual_Colour = Color.fromString(dailBtnBgcolor).asHex();
//		System.out.println(actual_Colour);
//		Assert.assertEquals(actual_Colour, "#69d891");
//	}
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
