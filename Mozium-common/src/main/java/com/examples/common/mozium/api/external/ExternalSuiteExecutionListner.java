package com.examples.common.mozium.api.external;

import org.testng.ISuite;

import com.mozium.api.MoziumSuiteExecutionListener;
import com.mozium.core.session.ExecutionManager;
import com.mozium.core.session.context.enums.MoziumResoltionFormat;
import com.mozium.services.log.LogTrackerEvent;

import bsh.This;

public class ExternalSuiteExecutionListner extends MoziumSuiteExecutionListener {

	@Override
	protected void beforeStartExecution(ISuite suite) {
		super.beforeStartExecution(suite);
		caclulateAndInitExectionContext();
	}

	public static void caclulateAndInitExectionContext() {

		String environment = System.getenv(ExternalVarEnv.environment.name());
		String language = System.getenv(ExternalVarEnv.language.name());
		String resolutionFormat = System.getenv(ExternalVarEnv.resolutionFormat.name());

		String brand = System.getenv(ExternalVarEnv.brand.name());
		String country;
		String localization = System.getenv(ExternalVarEnv.localization.name());

		String contient;

		LogTrackerEvent.trace(This.class.getName(), "Test suite Initial Context : [" + environment + ", " + brand + ", "
				+ language + ", " + localization + ", " + resolutionFormat + "]");

		if (environment == null || environment.equals("")) {
			LogTrackerEvent.trace(This.class.getName(),
					"Warning :  Variable <environment> not set in launch configuration");
			environment = "rec2";
		}
		if (brand == null || brand.equals("")) {
			LogTrackerEvent.trace(ExecutionManager.class.getName(),
					"Warning :  Variable <brand> not set in launch configuration");
			brand = Brands.getRandomBrand().name();
		}
		if (language == null || language.equals("")) {
			LogTrackerEvent.trace(This.class.getName(),
					"Warning :  Variable <language> not set in launch configuration");
			language = SupportedLanguage.getRandomLanguage().name();
		}
		if (resolutionFormat == null || resolutionFormat.equals("")) {
			LogTrackerEvent.trace(ExecutionManager.class.getName(),
					"Warning : Variable <browsermode> not set in launch configuration");
			resolutionFormat = MoziumResoltionFormat.getRandomResoltuionFromat().name();

		}
		Brands.setDefaultBrand(Brands.valueOf(brand));
		MoziumResoltionFormat.setDefaultResolutionFormat(MoziumResoltionFormat.valueOf(resolutionFormat));
		SupportedLanguage.setDefaultLangauge(SupportedLanguage.valueOf(Brands.getsupportedLanguage(language)));
		if (localization == null || localization.equals("")) {
			LogTrackerEvent.trace(This.class.getName(),
					"Warning :  Variable <localization> not set in launch configuration");
			localization = SupportedLanguage.getDefaultLocalization();
		}
		country = SupportedLanguage.getDefaultCountry().name();
		contient = SupportedCountries.getContient(SupportedCountries.valueOf(country)).name();

		getExecutionContext().put(ExternalVarEnv.environment.name(), environment);
		getExecutionContext().put(ExternalVarEnv.brand.name(), Brands.getCalculatedBrand().name().replaceAll("_", "-"));
		getExecutionContext().put(ExternalVarEnv.language.name(),
				SupportedLanguage.getCalculatedLangauge().name().replaceAll("_", "-"));
		getExecutionContext().put(ExternalVarEnv.resolutionFormat.name(), MoziumResoltionFormat.getCalculatedBrowserMode().name());
		getExecutionContext().put(ExternalVarEnv.localization.name(), localization);
		getExecutionContext().put(ExternalVarEnv.country.name(), country);
		getExecutionContext().put(ExternalVarEnv.continent.name(), contient);

		LogTrackerEvent.trace(This.class.getName(), "Test suite will be executed on the calculated Context : ["
				+ environment + ", " + brand + ", " + language + ", " + localization + ", " + resolutionFormat + "]");

	}
}
