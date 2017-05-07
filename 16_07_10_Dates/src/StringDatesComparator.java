import java.text.DateFormat;
import java.text.ParseException;
import java.text.*;
import java.util.Comparator;
import java.util.Date;

public class StringDatesComparator implements Comparator<String> {
private DateFormat dfSort;

	public StringDatesComparator(DateFormat dfSort) {
		super();
		this.dfSort = dfSort;
	}

	@Override
	public int compare(String arg0, String arg1) {
		
		try {
			Date date1 = dfSort.parse(arg0);
			Date date2 = dfSort.parse(arg1);
			return (date1.compareTo(date2));
		} catch (ParseException e) {
			
		}
		return 0;		
	}
}
