package com.examples.common.mozium.api.external;

import com.mozium.api.MoziumTestExecutionListner;
import com.mozium.core.session.ExecutionManager;
import com.mozium.external.drivers.selenium.DriverType;

public class ExternalTestExecutionListner extends MoziumTestExecutionListner{
	@Override
	protected void fireCustumActionsOnTestStart() {
		super.fireCustumActionsOnTestStart();
		fireUpdateGeoUrlForOldBrands();
	}
	private static void fireUpdateGeoUrlForOldBrands() {
		if (ExecutionManager.getConfiguration().getDriverType().name().equals(DriverType.webDriver.name())) {
			ExternalExecutionContext.fireUpdateGeoUrlForOldBrands();
		}
	}
}
