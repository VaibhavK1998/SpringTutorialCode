package i18NandL10N.bean7;
import java.util.Locale;

import org.springframework.context.MessageSource;

public class Student {
	private MessageSource source;
	
	public MessageSource getSource() {
		return source;
	}
	public void setSource(MessageSource source) {
		this.source = source;
	}
	public void display() {
		Locale locale=new Locale("en", "US");
		String msg=source.getMessage("key_greeting", null, locale);
		System.out.println(msg);
	}

}
