package com.examples.moziumWebTest.tests;

import org.testng.annotations.Test;

import com.examples.moziumWebTest.MoziumWebTest.pages.GooglePage;
import com.mozium.api.test.annotation.MoziumInjectData;

public class TestSearchOnGoogle {

	@MoziumInjectData(json = "./data/googleSearch.json")
	@Test(groups = "Google", description = "test the search google page")
	public void testSearch() {
		new GooglePage().
		openPage().
		search().
		verifyResult();
	}
	@MoziumInjectData(json = "./data/googleSearch.json")
	@Test(groups = "Google", description = "test the search google page")
	public void testShouldFail1() {
		new GooglePage().
		openPage().
		search().
		verifyFailedAssertion1SetsFailedTest();
	}
	@MoziumInjectData(json = "./data/googleSearch.json")
	@Test(groups = "Google", description = "test the search google page")
	public void testShouldFail2() {
		new GooglePage().
		openPage().
		search().
		verifyFailedAssertion2SetsFailedTest();
	}
	@MoziumInjectData(json = "./data/googleSearch.json")
	@Test(groups = "Google", description = "test the search google page")
	public void testShouldFail3() {
		new GooglePage().
		openPage().
		search().
		verifyFailedAssertion3SetsFailedTest();
	}
	
	@MoziumInjectData(json = "./data/googleSearch.json")
	@Test(groups = "Google", description = "test the search google page")
	public void testElementAbsentShouldNot() {
		new GooglePage().
		openPage().
		search().
		verifyFailedAssertion3SetsFailedTest();
	}
}
