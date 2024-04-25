package i18NandL10N.bean7;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatUsage {

	public static void main(String[] args) {
		long n=390039300;
		double m=9303480.390203;
	Locale locale=Locale.getDefault();
	 NumberFormat nFormat=NumberFormat.getInstance(locale);
System.out.println(nFormat.format(m));

	}

}
