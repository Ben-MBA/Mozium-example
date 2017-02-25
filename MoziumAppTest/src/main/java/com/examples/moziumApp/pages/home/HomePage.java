package com.examples.moziumApp.pages.home;

import com.mozium.api.page.annotation.MoziumAndroidLocator;
import com.mozium.api.page.annotation.MoziumIosLocator;
import com.mozium.api.page.by.MoziumSelector;
import com.mozium.api.page.model.MoziumMobileElement;
import com.mozium.api.page.model.MoziumMobilePage;
import com.mozium.api.script.assertion.MoziumAssert;
import com.mozium.api.script.log.MoziumLogLevel;
import com.mozium.api.script.log.MoziumLogger;

public class HomePage extends MoziumMobilePage {
	
	@MoziumIosLocator(identifier = "Clico", selector = MoziumSelector.id)
	@MoziumAndroidLocator(identifier = "com.haramy.clico:id/toolbar", selector = MoziumSelector.id)
	private MoziumMobileElement toolbar;
	
	public HomePage applicationUp() {
		MoziumLogger.log(HomePage.class.getName(), "Verify that the application is up", MoziumLogLevel.INFO);
		MoziumAssert.assertElementIsPresent(toolbar);
		return this;
	}

	

}
