import java.util.*;
import java.text.*;

public class DateTestAppl {

	public static void main(String[] args) throws ParseException {
		/*Date date = new Date();
		//System.out.println(date);
		DateFormat df= new SimpleDateFormat("dd MMMM yyyy G 'время:' HH:mm z");
		//System.out.println(df.format(date));
		DateFormat df1= new SimpleDateFormat("'Сегодня:' MMMM dd yyyy",Locale.ENGLISH);
		DateFormat df2= new SimpleDateFormat("'Сегодня:' MMMM dd yyyy - h:mm a",new Locale("en"));
		
		
		//System.out.println(df2.format(date));
		df2.setTimeZone(TimeZone.getTimeZone("GMT+6"));
		//System.out.println(df2.format(date));
		
		//Date from string
		df = new SimpleDateFormat("dd/MM/yy");
		Date dateStr = df.parse("31/06/2016");
		//System.out.println(dateStr);
		
		DateFormat dfSort = new SimpleDateFormat("dd/MM/yyyy");
		String [] dates={"12/10/1980","1/1/1960","3/7/1970"};
		Arrays.sort(dates,new StringDatesComparator(dfSort));
		System.out.println(Arrays.deepToString(dates));*/
		
		//Second part;
		Calendar calendar1 = new GregorianCalendar(); // григорианский календарь
		Calendar calendar2 = Calendar.getInstance(); // календарь из локализации по умолчанию
		//Calendar calendar3 = new GregorianCalendar(year, month c 0, dayOfMonth c 1);
		Calendar calendar3 = new GregorianCalendar(2016, 11, 29);//12го месяца не существует, поэтому -> Январь 2011
		System.out.println(calendar1.getTime());
		
		calendar3.set(Calendar.YEAR, 1980);
//		System.out.println(calendar3.getTime());
//		System.out.println(calendar1.get(Calendar.DAY_OF_WEEK));
//		System.out.println(calendar1.getFirstDayOfWeek());
//		
//		System.out.println(calendar3.getMaximum(Calendar.DAY_OF_MONTH));
//		System.out.println(calendar3.getActualMaximum(Calendar.DAY_OF_MONTH));

		
//		calendar2.add(Calendar.DAY_OF_MONTH,-10);
//		System.out.println(calendar2.getTime());
		
		DateFormat df = new SimpleDateFormat("dd/MM/yy");
		Date date = df.parse("10/07/2010");
		
		Calendar calendar = Calendar.getInstance();
		Calendar TODAY = Calendar.getInstance();
		calendar.setTime(date);
		int year = TODAY.get(Calendar.YEAR) - calendar.get(Calendar.YEAR)-1;
		int month = TODAY.get(Calendar.MONTH) - calendar.get(Calendar.MONTH);
		int day = TODAY.get(Calendar.DAY_OF_MONTH) - calendar.get(Calendar.DAY_OF_MONTH);
		if ((month>0) || (month==0 && day>=0))
			year++;

		
		System.out.println(year);

	}

}
