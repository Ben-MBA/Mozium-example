package com.examples.moziumApp.tests.account;

import org.testng.annotations.Test;

import com.examples.moziumApp.pages.account.AccountPage;
import com.examples.moziumApp.pages.home.HomePage;
import com.examples.moziumApp.pages.menu.MenuPage;
import com.mozium.api.test.annotation.MoziumInjectData;

public class AccountTests {


	@MoziumInjectData(json = "./data/account/data-account.json")
	@Test(groups = { "Account",
			"Authenticated" }, description = "This test aim to validate that the application save User in the cach")
	public void test_VerifyUserIsConnectedTestCase() {
		new HomePage().applicationUp();
		new MenuPage().verifyUserIsConnected().gotAccount();
		new AccountPage().verfyUserProfileExists().VerifyStarts().verifyUserFields().swapUpper().verifyImageIsnotDisplayed();
	}

	@MoziumInjectData(json = "./data/account/data-account.json")
	@Test(groups = { "Account", "Authenticated" }, description = "This test aim to validate that mode is ok")
	public void test_VerifyTheClientModeTestCase() {
		new HomePage().applicationUp();
		new MenuPage().verifyUserIsConnected().gotAccount();
		new AccountPage().changeClientMode().verifyReputationChanged();
	}
	
	@MoziumInjectData(json = "./data/account/data-account.json")
	@Test(groups = { "Account", "Authenticated" }, description = "This test aim to validate that mode is ok")
	public void test_VerifyTheAccountFormTestCase() {
		new HomePage().applicationUp();
		new MenuPage().verifyUserIsConnected().gotAccount();
		new AccountPage().verifyUserFields();
	}
	

}
