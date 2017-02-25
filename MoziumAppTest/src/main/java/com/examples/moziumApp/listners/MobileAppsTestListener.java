package com.examples.moziumApp.listners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult; 

import com.examples.moziumApp.pages.account.AccountPage;
import com.mozium.api.MoziumExecutionContext;

public class MobileAppsTestListener implements IInvokedMethodListener {

	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
//		if (MoziumExecutionContext.isIOS()) {
//			if (new AccountPage().isConnected()) {
//				new AccountPage().disconnect();
//			}
//		}
	}

	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub

	}

}
