package i18NandL10N.bean7;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateFormatPractise {

	public static void main(String[] args) {
    Date date=new Date();
    System.out.println(date);

    System.out.println("-----------------------------------------------------------------------------");
    String pattern="dd/MM/yyyy";
    SimpleDateFormat simpleDateFormat=new SimpleDateFormat(pattern);
    System.out.println(simpleDateFormat.format(date));
    
    System.out.println("-----------------------------------------------------------------------------");
   Locale locale =Locale.getDefault();
  DateFormat dFormat= DateFormat.getDateInstance(0, locale);
  System.out.println(dFormat.format(date));
  Calendar c1=dFormat.getCalendar();

	}

}
