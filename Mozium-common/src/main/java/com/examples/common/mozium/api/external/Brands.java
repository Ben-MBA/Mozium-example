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


import java.util.Random;

public enum Brands {

	accorhotels, ibis, novotel, hotelf1, sofitel, mercure, pullmanhotels, mgallery, adagio_city;

	private static Brands defaultBrand = accorhotels;

	public static boolean hasNewLookBrand(Brands brand) {
		switch (brand) {
		case accorhotels:
			return true;
		case ibis:
			return true;
		case novotel:
			return true;
		case hotelf1:
			return true;
		default:
			return false;
		}
	}

	public static String getsupportedLanguage(String language) {
		String supportedLanguage;
		supportedLanguage = Brands.supportLanguage(Brands.getCalculatedBrand(), SupportedLanguage.valueOf(language))
				.name();
		return supportedLanguage;

	}

	private static SupportedLanguage supportLanguage(Brands brand, SupportedLanguage language) {

		// switch (brand) {
		// case accorhotels:
		// return language;
		// case ibis:
		// switch (language) {
		// case ar:
		// case ko:
		// case tr:
		// case th:
		// case sv:
		// return SupportedLanguage.fr;
		// default:
		// return language;
		// }
		// case novotel:
		// switch (language) {
		// case ar:
		// case ko:
		// case tr:
		// case th:
		// case sv:
		// case ja:
		// case id:
		// return SupportedLanguage.fr;
		// default:
		// return language;
		// }
		// case hotelf1:
		// switch (language) {
		// case fr:
		// return language;
		// case gb:
		// return language;
		// default:
		// return SupportedLanguage.fr;
		// }
		// case pullmanhotels:
		// switch (language) {
		// case fr:
		// case gb:
		// case de:
		// case es:
		// case id:
		// return language;
		// default:
		// return SupportedLanguage.fr;
		// }
		// case mercure:
		// switch (language) {
		// case ar:
		// case ko:
		// case tr:
		// case th:
		// case sv:
		// case ja:
		// case id:
		// return SupportedLanguage.fr;
		// default:
		// return language;
		// }
		// case sofitel:
		// switch (language) {
		// case fr:
		// case gb:
		// case de:
		// case es:
		// case it:
		// return language;
		// default:
		// return SupportedLanguage.fr;
		// }
		// default:
		// return SupportedLanguage.fr;
		// }

		switch (brand) {
		case accorhotels:
			switch (language) {
			case fr:
			case gb:
			case ja:
				return language;
			default:
				return SupportedLanguage.fr;
			}
		case ibis:
			switch (language) {
			case fr:
			case gb:
			case ja:
				return language;
			default:
				return SupportedLanguage.fr;
			}
		case novotel:
			switch (language) {
			case fr:
			case gb:
				return language;
			default:
				return SupportedLanguage.fr;
			}
		case hotelf1:
			switch (language) {
			case fr:
			case gb:
				return language;
			default:
				return SupportedLanguage.fr;
			}
		case pullmanhotels:
			switch (language) {
			case fr:
			case gb:
				return language;
			default:
				return SupportedLanguage.fr;
			}
		case mercure:
			switch (language) {
			case fr:
			case gb:
				return language;
			default:
				return SupportedLanguage.fr;
			}
		case sofitel:
			switch (language) {
			case fr:
			case gb:
				return language;
			default:
				return SupportedLanguage.fr;
			}
		default:
			return SupportedLanguage.fr;
		}

	}

	public static Brands getRandomBrand() {
		Brands[] brands = Brands.values();
		Random generator = new Random();
		return brands[generator.nextInt(brands.length-2)];
	}

	public static Brands getCalculatedBrand() {
		return defaultBrand;
	}

	public static void setDefaultBrand(Brands defaultBrand) {
		Brands.defaultBrand = defaultBrand;
	}

}
