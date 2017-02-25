package com.examples.moziumApp.pages.search;

import com.mozium.api.page.annotation.MoziumAndroidLocator;
import com.mozium.api.page.annotation.MoziumIosLocator;
import com.mozium.api.page.by.MoziumSelector;
import com.mozium.api.page.model.MoziumMobileElement;
import com.mozium.api.page.model.MoziumMobilePage;

public class SearchPage extends MoziumMobilePage{
	@MoziumIosLocator(identifier = "//UIAApplication[1]/UIAWindow[1]/UIAButton[7]", selector = MoziumSelector.xpath)
	@MoziumAndroidLocator(identifier = "com.accor.appli.hybrid:id/disconnectBtn", selector = MoziumSelector.id)
	private MoziumMobileElement searchedInput_Activity;

	@MoziumIosLocator(identifier = "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[3]/UIAButton[2]", selector = MoziumSelector.xpath)
	private MoziumMobileElement searchedInput_Where;

	@MoziumIosLocator(identifier = "//UIAApplication[1]/UIAWindow[1]/UIAButton[9]", selector = MoziumSelector.xpath)
	@MoziumAndroidLocator(identifier = "//*[@text='Settings'] | //*[@resource-id='com.accor.appli.hybrid:id/my_settings']", selector = MoziumSelector.xpath)
	private MoziumMobileElement input_From;

	@MoziumIosLocator(identifier = "//UIAApplication[1]/UIAWindow[1]/UIAButton[8]", selector = MoziumSelector.xpath)
	@MoziumAndroidLocator(identifier = "//*[@resource-id='com.accor.appli.hybrid:id/myInfosBloc'] | //*[@resource-id='com.accor.appli.hybrid:id/my_infos']", selector = MoziumSelector.xpath)
	private MoziumMobileElement input_To;
	
	@MoziumIosLocator(identifier = "//UIAApplication[1]/UIAWindow[1]/UIAButton[8]", selector = MoziumSelector.xpath)
	@MoziumAndroidLocator(identifier = "//*[@resource-id='com.accor.appli.hybrid:id/myInfosBloc'] | //*[@resource-id='com.accor.appli.hybrid:id/my_infos']", selector = MoziumSelector.xpath)
	private MoziumMobileElement select_Deals;
	
	@MoziumIosLocator(identifier = "//UIAApplication[1]/UIAWindow[1]/UIAButton[8]", selector = MoziumSelector.xpath)
	@MoziumAndroidLocator(identifier = "//*[@resource-id='com.accor.appli.hybrid:id/myInfosBloc'] | //*[@resource-id='com.accor.appli.hybrid:id/my_infos']", selector = MoziumSelector.xpath)
	private MoziumMobileElement btn_Search;
	
	public SearchPage fillInformations() {
		// TODO Auto-generated method stub
		return null;
	}

	public SearchPage search() {
		// TODO Auto-generated method stub
		return null;
	}

	public SearchPage selectProduct() {
		// TODO Auto-generated method stub
		return null;
	}

}
