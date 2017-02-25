package com.examples.moziumWebTest.MoziumWebTest.pages;

import com.mozium.api.page.annotation.MoziumWebLocator;
import com.mozium.api.page.by.MoziumSelector;
import com.mozium.api.page.model.MoziumWebElement;
import com.mozium.api.page.model.MoziumWebPage;
import com.mozium.api.script.assertion.MoziumAssert;
import com.mozium.api.script.web.workStation.MoziumNavigator;
import com.mozium.external.drivers.selenium.helpers.WebDriverFinder;

public class GooglePage extends MoziumWebPage {

	@MoziumWebLocator(identifier = "q", selector = MoziumSelector.name, value = "#searchedKey")
	private MoziumWebElement input_Search;

	@MoziumWebLocator(identifier = "btnG", selector = MoziumSelector.name)
	private MoziumWebElement btn_Search;

	@MoziumWebLocator(identifier = "btnF", selector = MoziumSelector.xpath)
	private MoziumWebElement btn_Missing;
	
	public String getUrl() {
		return "http://www.google.com";
	}

	public GooglePage openPage() {
		MoziumNavigator.openUrl(getUrl());
		return this;
	}

	public GooglePage search() {
		input_Search.type();
		btn_Search.click();
		return this;
	}

	public void verifyResult() {

		// first way [bad way]
		boolean isPresent = WebDriverFinder
				.isElementPresent(input_Search);
		boolean isTextPresent = WebDriverFinder.isTextPresent("#searchedKey");
		boolean isElementHasValue = WebDriverFinder.getElementValue(
				input_Search).startsWith("Moez Ben Aissa");
		boolean isElementHasAttribut = WebDriverFinder.getElementAttribut(
				input_Search, "class").equals("gsfi");
		MoziumAssert.assertEquals(true, isElementHasAttribut && isTextPresent
				&& isElementHasValue && isPresent, isElementHasAttribut +"/ "+isTextPresent+"/ "+isElementHasValue+"/ "+isPresent);
		
		// second way
		MoziumAssert.assertElementIsPresent(input_Search);
		MoziumAssert.assertContains(WebDriverFinder.getElementValue(
				input_Search), "Moez Ben Aissa", "The values are different!!!");
		MoziumAssert
				.assertEqualsToElementAttribut(input_Search, "class", "gsfi");
		MoziumAssert.assertTextPresent("#searchedKey");
		MoziumAssert.assertTextNotPresent("this text is be missing");
		MoziumAssert.assertElementIsNotPresent(btn_Missing);
		MoziumWebElement dynamique=new MoziumWebElement(btn_Missing.getIdentifier(), btn_Missing.getSelector());
		MoziumAssert.assertElementIsNotPresent(dynamique);

	}
	public void verifyFailedAssertion1SetsFailedTest() {
		MoziumAssert.assertTextPresent("this text should be missing");
	}
	
	public void  verifyFailedAssertion2SetsFailedTest() {
		MoziumAssert.assertElementIsPresent(btn_Missing);
	}
	public void  verifyFailedAssertion3SetsFailedTest() {
		String toto=null;
		MoziumAssert.assertNotNull(toto,"toto is null");
	}
	
	
}
