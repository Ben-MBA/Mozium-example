package com.examples.moziumApp.pages.menu;

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

public class MenuPage extends MoziumMobilePage{

	@MoziumAndroidLocator(identifier = "//*[@content-desc='Open navigation drawer']", selector = MoziumSelector.xpath)
	private MoziumMobileElement bnt_MainMenu;
	
	@MoziumIosLocator(identifier = "//*[@label='Search']", selector = MoziumSelector.xpath)
	@MoziumAndroidLocator(identifier = "com.haramy.clico:id/design_menu_item_text", selector = MoziumSelector.id)
	private MoziumMobileElement bnt_Search;
	
	@MoziumIosLocator(identifier = "//*[@label='Account']", selector = MoziumSelector.xpath)
	@MoziumAndroidLocator(identifier = "com.haramy.clico:id/design_menu_item_text", selector = MoziumSelector.id)
	private MoziumMobileElement bnt_Account;
	
	@MoziumIosLocator(identifier = "//*[@Label='Setting']", selector = MoziumSelector.xpath)
	@MoziumAndroidLocator(identifier = "//*[@text='Settings']", selector = MoziumSelector.xpath)
	private MoziumMobileElement bnt_Settings;
	
	@MoziumAndroidLocator(identifier = "com.haramy.clico:id/profile_image", selector = MoziumSelector.id)
	private MoziumMobileElement image_ProfilePhoto;
	
	@MoziumAndroidLocator(identifier = "com.haramy.clico:id/layoutTopBackground", selector = MoziumSelector.id)
	private MoziumMobileElement label_ProfileName;
	
	@MoziumAndroidLocator(identifier = "com.haramy.clico:id/textView", selector = MoziumSelector.id)
	private MoziumMobileElement label_ProfileEmail;
	
	@MoziumAndroidLocator(identifier = "com.haramy.clico:id/ratingBar", selector = MoziumSelector.id)
	private MoziumMobileElement label_Starts;
	
	public MenuPage(){
		MoziumLogger.log(MenuPage.class.getName(), "Open Menu", MoziumLogLevel.INFO);
		if(MoziumExecutionContext.isAndroid()){
			bnt_MainMenu.click();
		}
		
	}
	
	public MenuPage gotSearch(){
		MoziumLogger.log(MenuPage.class.getName(), "Open Search Menu", MoziumLogLevel.INFO);
		bnt_Search.click();
		return this;
	}
	
	public MenuPage gotAccount(){
		MoziumLogger.log(MenuPage.class.getName(), "Open Account Menu", MoziumLogLevel.INFO);
		if(MoziumExecutionContext.isAndroid()){
			bnt_Account.setSelector(MoziumSelector.xpath);
			bnt_Account.setIdentifier("//*[@text='Account']");
		}
		bnt_Account.click();
		return this;
	}
	
	public MenuPage gotShare(){
		MoziumLogger.log(MenuPage.class.getName(), "Open Share Menu", MoziumLogLevel.INFO);
		bnt_Search.click();
		return this;
	}
	
	public MenuPage gotSettings(){
		MoziumLogger.log(MenuPage.class.getName(), "Open Settings Menu", MoziumLogLevel.INFO);
		bnt_Settings.click();
		return this;
	}
	public MenuPage verifyUserIsConnected(){
		if(MoziumExecutionContext.isAndroid()){
		MoziumAssert.validateElementIsPresent(image_ProfilePhoto);
		MoziumAssert.validateElementIsPresent(label_ProfileName);
		MoziumAssert.validateElementIsPresent(label_ProfileEmail);
		}
		return this;
	}

	public MenuPage swapUpper() {
		MoziumTouchScreen.swipe(0, 0, 3);
		return this;
	}

	
}
