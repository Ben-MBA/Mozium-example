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

public enum SupportedContinent {
	AMERICA, AFRICA, EUROPE, ASIA;

	private static SupportedContinent defaultContinent = EUROPE;


	public static SupportedContinent getCalculatedContinent() {
		return defaultContinent;
	}

	public static void setDefaultBrowserMode(SupportedContinent defaultContinent) {
		SupportedContinent.defaultContinent = defaultContinent;
	}
}
