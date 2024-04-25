package i18NandL10N;

import java.util.Locale;

public class First {

	public static void main(String[] args) {
		Locale locale1=Locale.getDefault();
		System.out.println(locale1.getDisplayCountry());
		System.out.println(locale1.getDisplayLanguage());
		System.out.println(locale1.getLanguage());
		System.out.println(locale1.getCountry());
		
		System.out.println("----------------------------------------------------------------------");
		
		Locale locale= new Locale("fr", "FR");
		System.out.println(locale.getDisplayCountry());
		System.out.println(locale.getDisplayLanguage());
		System.out.println(locale.getLanguage());
		System.out.println(locale.getCountry());
		
	System.out.println("----------------------------------------------------------------------");

		
	
String [] countryCodes=Locale.getISOCountries();
String[] langS=Locale.getISOLanguages();

for(String langCode:langS) {
	Locale locale3=new Locale(langCode);
	System.out.println("LangCode:"+langCode+" LanguageName: "+locale3.getDisplayLanguage());
}
System.out.println("----------------------------------------------------------------------");
for(String code:countryCodes) {
	Locale locale2=new Locale("",code);
	System.out.println("countryCode:"+code+" countryName: "+locale2.getDisplayCountry());
	
	
	
}
	}

}
