package com.examples.moziumApp.tests.search;

import org.testng.annotations.Test;

import com.examples.moziumApp.pages.home.HomePage;
import com.examples.moziumApp.pages.menu.MenuPage;
import com.examples.moziumApp.pages.search.ProductPage;
import com.examples.moziumApp.pages.search.SearchPage;
import com.mozium.api.test.annotation.MoziumInjectData;

public class SearchTests {

	@MoziumInjectData(json = "./data/search/data-search.json")
	@Test(groups = { "Search",
			"Authenticated" }, description = "This test aim to validate the search feature from the HP")
	public void test_VerifyUserIsConnectedTestCase() {
		new HomePage().applicationUp();
		new SearchPage().fillInformations().search().selectProduct();
		new ProductPage().verifyPage();
	}

	@MoziumInjectData(json = "./data/search/data-search.json")
	@Test(groups = { "Search", "Authenticated" }, description = "This test aim to validate the search from menu")
	public void test_VerifyTheClientModeTestCase() {
		new HomePage().applicationUp();
		new MenuPage().verifyUserIsConnected().gotSearch();
		new SearchPage().fillInformations().search().selectProduct();
		new ProductPage().verifyPage().callPhone();
		
	}

}
