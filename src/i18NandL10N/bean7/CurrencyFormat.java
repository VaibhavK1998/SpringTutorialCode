package i18NandL10N.bean7;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class CurrencyFormat {
//lecture 18
	public static void main(String[] args) {
		Locale locale=Locale.getDefault();
		Currency currency=Currency.getInstance(locale);
		System.out.println(currency.getDisplayName()+" "+currency.getSymbol());
		
	long money=(long)3893003003l;
NumberFormat moneyFetch=NumberFormat.getCurrencyInstance(locale);
System.out.println("money fetsched:"+moneyFetch.format(money));

Locale locale2=new Locale("", "US");
NumberFormat m2=NumberFormat.getCurrencyInstance(locale2);
System.out.println(m2.format(money));

	}

}
