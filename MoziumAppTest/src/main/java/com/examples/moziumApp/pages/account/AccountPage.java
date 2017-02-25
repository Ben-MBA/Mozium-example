package com.examples.moziumApp.pages.account;

import com.mozium.api.MoziumExecutionContext;
import com.mozium.api.page.annotation.MoziumAndroidLocator;
import com.mozium.api.page.annotation.MoziumIosLocator;
import com.mozium.api.page.by.MoziumSelector;
import com.mozium.api.page.model.MoziumMobileElement;
import com.mozium.api.page.model.MoziumMobilePage;
import com.mozium.api.script.assertion.MoziumAssert;
import com.mozium.api.script.log.MoziumLogLevel;
import com.mozium.api.script.log.MoziumLogger;
import com.mozium.api.script.mobile.workstation.MoziumTouchScreen;
import com.mozium.api.script.wait.MoziumWait;

public class AccountPage extends MoziumMobilePage {

	@MoziumIosLocator(identifier = "//*[@type='XCUIElementTypeSwitch']", selector = MoziumSelector.xpath)
	@MoziumAndroidLocator(identifier = "com.haramy.clico:id/switch1", selector = MoziumSelector.id)
	private MoziumMobileElement radio_Mode;

	@MoziumIosLocator(identifier = "reputation", selector = MoziumSelector.id)
	@MoziumAndroidLocator(identifier = "android.widget.LinearLayout", selector = MoziumSelector.className)
	private MoziumMobileElement label_Reputation;

	@MoziumIosLocator(identifier = "firstName", selector = MoziumSelector.id)
	@MoziumAndroidLocator(identifier = "com.haramy.clico:id/textView_firstName", selector = MoziumSelector.id)
	private MoziumMobileElement label_FirstName;

	@MoziumIosLocator(identifier = "lastName", selector = MoziumSelector.id)
	@MoziumAndroidLocator(identifier = "com.haramy.clico:id/textView_lastName", selector = MoziumSelector.id)
	private MoziumMobileElement label_lastName;
	//ATMA 523
	@MoziumIosLocator(identifier = "email", selector = MoziumSelector.id)
	@MoziumAndroidLocator(identifier = "com.haramy.clico:id/textView_email", selector = MoziumSelector.id)
	private MoziumMobileElement label_Email;
	
	@MoziumIosLocator(identifier =  "phone", selector = MoziumSelector.id)
	@MoziumAndroidLocator(identifier = "com.haramy.clico:id/textView_phone", selector = MoziumSelector.xpath)
	private MoziumMobileElement label_Phone;
	
	@MoziumIosLocator(identifier = "deals", selector = MoziumSelector.id)
	@MoziumAndroidLocator(identifier = "com.haramy.clico:id/textView_sharedDeals", selector = MoziumSelector.xpath)
	private MoziumMobileElement label_SharedDeals;
	
	@MoziumIosLocator(identifier = "lastSearch", selector = MoziumSelector.id)
	@MoziumAndroidLocator(identifier = "com.haramy.clico:id/textView_lastSearch", selector = MoziumSelector.xpath)
	private MoziumMobileElement label_lastSearch;
	
	@MoziumAndroidLocator(identifier = "com.haramy.clico:id/ratingBar", selector = MoziumSelector.id)
	private MoziumMobileElement label_Starts;
	
	@MoziumIosLocator(identifier = "//*[@type='XCUIElementTypeImage']", selector = MoziumSelector.xpath)
	@MoziumAndroidLocator(identifier = "com.haramy.clico:id/toolbar_layout", selector = MoziumSelector.id)
	private MoziumMobileElement imgae_ProfilePhoto;
	

	public AccountPage() {
		super();
		MoziumLogger.log(this.getClass().getName(), "Account page is loading...", MoziumLogLevel.DEBUG);
		MoziumWait.waitUntilVisibleElement(label_FirstName, 100, false);
	}

	public AccountPage VerifyAccountPage() {
		
		MoziumLogger.log(this.getClass().getName(), "Validate the Account Page", MoziumLogLevel.INFO);
		MoziumAssert.validateElementIsPresent(radio_Mode);
		MoziumAssert.validateElementIsPresent(label_Email);
		MoziumAssert.validateElementIsPresent(label_FirstName);
		MoziumAssert.validateElementIsPresent(label_lastName);
		MoziumAssert.validateElementIsPresent(label_lastSearch);
		MoziumAssert.assertElementIsPresent(label_Reputation);
		MoziumAssert.assertElementIsPresent(label_SharedDeals);
		return this;
	}

	public boolean isConnected() {
			if(MoziumExecutionContext.isAndroid()){
				MoziumLogger.log(this.getClass().getName(), "Verify that user is connected...", MoziumLogLevel.INFO);
			}else{
				
			}
		return false;
	}

	public AccountPage disconnect() {
		MoziumLogger.log(this.getClass().getName(), "Method not implemented yet...", MoziumLogLevel.WARNING);
		return this;
	}

	public AccountPage verfyUserProfileExists() {
		MoziumAssert.assertElementIsPresent(imgae_ProfilePhoto);
		return this;
	}

	public AccountPage verifyUserFields() {
		
		MoziumAssert.validateElementValueContains(label_Email, "#email", "Validate that email is filled as expected");
		MoziumAssert.validateElementValueContains(label_FirstName, "#firstName", "Validate that firstName is filled as expected");
		MoziumAssert.validateElementValueContains(label_lastName, "#lastName", "Validate that lastName is filled as expected");
		return this;
	}

	public AccountPage verifyImageIsnotDisplayed() {
		MoziumAssert.validateElementIsNotPresent(imgae_ProfilePhoto, "Verify that the image is not displayed");
		return this;
	}

	public AccountPage changeClientMode() {
		radio_Mode.click();
		return this;
	}

	public AccountPage verifyReputationChanged() {
		MoziumLogger.log(this.getClass().getName(), "WARNING : This verification is added to test the fail!", MoziumLogLevel.WARNING);
		MoziumLogger.log(this.getClass().getName(), "INFO : Verify Test Validation ", MoziumLogLevel.INFO);
		MoziumLogger.log(this.getClass().getName(), "ERROR : Verify Test Validation ERROR", MoziumLogLevel.ERROR);
		MoziumAssert.assertElementIsNotPresent(label_Reputation, "Verify that reputation is changed");
		return this;
	}

	public AccountPage VerifyStarts() {
		if(MoziumExecutionContext.isAndroid()){
			MoziumAssert.validateElementIsPresent(label_Starts);
		}else{
			MoziumLogger.log(this.getClass().getName(), "Warning : No starts in the IOS version!", MoziumLogLevel.WARNING);
		}
		
		return this;
	}

	public AccountPage swapUpper() {
		MoziumTouchScreen.swipe(0.01, 0.01,10);
		return this;
	}

}
