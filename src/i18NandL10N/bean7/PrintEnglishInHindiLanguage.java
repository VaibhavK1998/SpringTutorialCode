package i18NandL10N.bean7;

import java.util.Locale;

public class PrintEnglishInHindiLanguage {

	public static void main(String[] args) {
	//Locale locale=Locale.CHINA;
		Locale locale=new Locale("hi");
	String [] countryCodes=Locale.getISOCountries();
	for(String code:countryCodes) {
		Locale locale2=new Locale("",code);
		System.out.println("countryCode:"+code+" countryName: "+locale2.getDisplayCountry(locale));
	
		
		
	}
	}

}
