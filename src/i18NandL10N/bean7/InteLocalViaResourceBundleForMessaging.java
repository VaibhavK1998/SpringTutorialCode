package i18NandL10N.bean7;

import java.util.Locale;
import java.util.ResourceBundle;

//lecture 19

public class InteLocalViaResourceBundleForMessaging {

	public static void main(String[] args) {
		Locale locale=new Locale("hi", "IN");
		ResourceBundle bundle=ResourceBundle.getBundle("i18NandL10N/resource7/MessageBundle", locale);
		String msg=bundle.getString("key_greeting");
		System.out.println(msg);
		
		
	}

}
