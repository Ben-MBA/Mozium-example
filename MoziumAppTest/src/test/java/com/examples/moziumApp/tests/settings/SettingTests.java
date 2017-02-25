package com.examples.moziumApp.tests.settings;

import org.testng.annotations.Test;

import com.examples.moziumApp.pages.home.HomePage;
import com.examples.moziumApp.pages.menu.MenuPage;
import com.examples.moziumApp.pages.settings.SettingPage;
import com.mozium.api.test.annotation.MoziumInjectData;

public class SettingTests {

	@MoziumInjectData(json = ".data/settings/data-setting.json")
	@Test(groups = { "Search",
			"Authenticated" }, description = "This test aim to validate the setting feature")
	public void test_VerifyUserIsConnectedTestCase() {
		new HomePage().applicationUp();
		new MenuPage().verifyUserIsConnected().gotSettings();
		new SettingPage().validatePage().changeMessageNotification().goBack();
	}

}
