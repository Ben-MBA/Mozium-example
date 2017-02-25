package com.examples.moziumApp.pages.settings;

import com.mozium.api.page.annotation.MoziumAndroidLocator;
import com.mozium.api.page.annotation.MoziumIosLocator;
import com.mozium.api.page.by.MoziumSelector;
import com.mozium.api.page.model.MoziumMobileElement;
import com.mozium.api.page.model.MoziumMobilePage;

public class SettingPage extends MoziumMobilePage{

	
	@MoziumIosLocator(identifier = "//UIAApplication[1]/UIAWindow[1]/UIAButton[7]", selector = MoziumSelector.xpath)
	@MoziumAndroidLocator(identifier = "com.accor.appli.hybrid:id/disconnectBtn", selector = MoziumSelector.id)
	private MoziumMobileElement label_reputation;

	@MoziumIosLocator(identifier = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[3]/UIAButton[2]", selector = MoziumSelector.xpath)
	private MoziumMobileElement label_Name;

	@MoziumIosLocator(identifier = "//UIAApplication[1]/UIAWindow[1]/UIAButton[9]", selector = MoziumSelector.xpath)
	@MoziumAndroidLocator(identifier = "//*[@text='Settings'] | //*[@resource-id='com.accor.appli.hybrid:id/my_settings']", selector = MoziumSelector.xpath)
	private MoziumMobileElement label_Location;

	@MoziumIosLocator(identifier = "//UIAApplication[1]/UIAWindow[1]/UIAButton[8]", selector = MoziumSelector.xpath)
	@MoziumAndroidLocator(identifier = "//*[@resource-id='com.accor.appli.hybrid:id/myInfosBloc'] | //*[@resource-id='com.accor.appli.hybrid:id/my_infos']", selector = MoziumSelector.xpath)
	private MoziumMobileElement label_Email;
	
	@MoziumIosLocator(identifier = "//UIAApplication[1]/UIAWindow[1]/UIAButton[8]", selector = MoziumSelector.xpath)
	@MoziumAndroidLocator(identifier = "//*[@resource-id='com.accor.appli.hybrid:id/myInfosBloc'] | //*[@resource-id='com.accor.appli.hybrid:id/my_infos']", selector = MoziumSelector.xpath)
	private MoziumMobileElement label_Phone;
	
	@MoziumIosLocator(identifier = "//UIAApplication[1]/UIAWindow[1]/UIAButton[8]", selector = MoziumSelector.xpath)
	@MoziumAndroidLocator(identifier = "//*[@resource-id='com.accor.appli.hybrid:id/myInfosBloc'] | //*[@resource-id='com.accor.appli.hybrid:id/my_infos']", selector = MoziumSelector.xpath)
	private MoziumMobileElement label_VisitorAverage;
	
	@MoziumIosLocator(identifier = "//UIAApplication[1]/UIAWindow[1]/UIAButton[8]", selector = MoziumSelector.xpath)
	@MoziumAndroidLocator(identifier = "//*[@resource-id='com.accor.appli.hybrid:id/myInfosBloc'] | //*[@resource-id='com.accor.appli.hybrid:id/my_infos']", selector = MoziumSelector.xpath)
	private MoziumMobileElement label_DealDuration;
	
	@MoziumIosLocator(identifier = "//UIAApplication[1]/UIAWindow[1]/UIAButton[8]", selector = MoziumSelector.xpath)
	@MoziumAndroidLocator(identifier = "//*[@resource-id='com.accor.appli.hybrid:id/myInfosBloc'] | //*[@resource-id='com.accor.appli.hybrid:id/my_infos']", selector = MoziumSelector.xpath)
	private MoziumMobileElement label_Description;
	
	
	public SettingPage validatePage() {
		// TODO Auto-generated method stub
		return null;
	}

	public SettingPage changeMessageNotification() {
		// TODO Auto-generated method stub
		return null;
	}

	public SettingPage goBack() {
		// TODO Auto-generated method stub
		return null;
	}

}
