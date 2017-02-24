//     -------           . -------------------------------------------.
//   _|       |_         |          Author : Moez Ben Aissa           | 
//  |----(0)----|        |                                            |
// \|           |/       |              **  MOZIUM  **                |
//  -------------        |                                            |
//  (   _ M _   )        |    An Automation E2E functional testing    |
//   ( |     | )         |             For web And Mobile             |
//   /         \         .--------------------------------------------. 
//   -----------
//    |       |
//    |   ~   |
//   ___*___*___
//  /           \
// 
package com.examples.common.mozium.api.external;

import com.mozium.api.MoziumExecutionContext;
import com.mozium.core.session.ExecutionManager;

public class ExternalExecutionContext extends MoziumExecutionContext {

	public static String getBrand() {
		return ExecutionManager.getExecutionContext().get(ExternalVarEnv.brand.name()).replace("-", "_");
	}

	public static String getContinent() {
		return ExecutionManager.getExecutionContext().get(ExternalVarEnv.continent.name());
	}

	public static String getCountry() {
		return ExecutionManager.getExecutionContext().get(ExternalVarEnv.country.name());
	}

	public static String getLocalisation() {
		return ExecutionManager.getExecutionContext().get(ExternalVarEnv.localization.name());
	}

	public static boolean brandHasnewLook() {
		return Brands.hasNewLookBrand(Brands.getCalculatedBrand());
	}

	public static void fireGeaolocalitionUrl() {
		if (!Brands.hasNewLookBrand(
				Brands.valueOf(ExecutionManager.getExecutionContext().get(ExternalVarEnv.brand.name())))) {
			getGeolocalisationUrl();

		} else {
			getRootUrl();
		}
	}

	public static void fireUpdateGeoUrlForOldBrands() {
		if (!Brands.hasNewLookBrand(
				Brands.valueOf(ExecutionManager.getExecutionContext().get(ExternalVarEnv.brand.name())))) {
			ExecutionManager.getMoziumDriver().get(getGeolocalisationUrl());
		}
		// added by each test
		// else{
		// ExecutionManager.getMoziumDriver().get(getRootUrl());
		// }
	}

	public static String getGeolocalisationUrl() {
		String brand = ExecutionManager.getExecutionContext().get(ExternalVarEnv.brand.name()).replaceAll("_", "-");
		String calculatedLanguage = ExecutionManager.getExecutionContext().get(ExternalVarEnv.language.name())
				.replaceAll("_", "-");
		String env = ExecutionManager.getExecutionContext().get(ExternalVarEnv.environment.name());
		String prefix = env.equals("prod") ? "www." : env + "-www.";

		String url = "http://" + prefix + brand + ".com/geo/setZone.jsp?lang=" + calculatedLanguage + "&country="
				+ calculatedLanguage;
		return url;

	}

	public static String getRootUrl() {
		String url;
		String brand = ExecutionManager.getExecutionContext().get(ExternalVarEnv.brand.name()).replaceAll("_", "-");
		String calculatedLanguage = ExecutionManager.getExecutionContext().get(ExternalVarEnv.language.name())
				.replaceAll("_", "-");
		String env = ExecutionManager.getExecutionContext().get(ExternalVarEnv.environment.name());

		if (isSmartphoneMode() || isTabletMode()) {
			String prefix = env.equals("prod") ? "m." : env + "-m.";
			url = "http://" + prefix + brand + ".com/" + calculatedLanguage + "/home/index.shtml";
		} else {
			String prefix = env.equals("prod") ? "www." : env + "-www.";

			url = "http://" + prefix + brand + ".com/" + calculatedLanguage + "/"
					+ ExecutionManager.getExecutionContext().get(ExternalVarEnv.localization.name()) + "/index.shtml";
		}

		return url;
	}

	public static String getBaseUrl() {
		String url;
		String brand = ExecutionManager.getExecutionContext().get(ExternalVarEnv.brand.name()).replaceAll("_", "-");
		String calculatedLanguage = ExecutionManager.getExecutionContext().get(ExternalVarEnv.language.name())
				.replaceAll("_", "-");
		String env = ExecutionManager.getExecutionContext().get(ExternalVarEnv.environment.name());
		String prefix;
		if (isSmartphoneMode() || isTabletMode()) {
			prefix = env.equals("prod") ? "m." : env + "-m.";
			url = "http://" + prefix + brand + ".com/" + calculatedLanguage;
		} else {
			prefix = env.equals("prod") ? "www." : env + "-www.";
			url = "http://" + prefix + brand + ".com/" + calculatedLanguage;
		}
		return url;
	}

	public static String getSecuredRootUrl() {
		String env = ExecutionManager.getExecutionContext().get(ExternalVarEnv.environment.name());
		boolean isProd = env.equals("prod");
		if (isProd) {
			return getRootUrl().replace("http", "https").replace("m.", "secure-m.");
		}
		return getRootUrl().replace("http", "https").replace("-m.", "-secure-m.");
	}

	public static String getSecuredBaseUrl() {
		String env = ExecutionManager.getExecutionContext().get(ExternalVarEnv.environment.name());
		boolean isProd = env.equals("prod");
		if (isProd) {
			return getRootUrl().replace("http", "https").replace("m.", "secure-m.");
		}
		return getRootUrl().replace("http", "https").replace("-m.", "-secure-m.");
	}

}
