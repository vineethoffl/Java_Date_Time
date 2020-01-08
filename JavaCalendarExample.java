package javadateclassical;
import java.util.Calendar;
public class JavaCalendarExample
{
	public static void main(String[] args)
	{
		Calendar cal=Calendar.getInstance();
		System.out.println("the current date is : "+cal.getTime());
		cal.add(Calendar.DATE,-15);
		System.out.println("15 days ago: "+cal.getTime());
		cal.add(Calendar.MONTH,4);
		System.out.println("4 months later: "+cal.getTime());
		cal.add(Calendar.YEAR,2);
		System.out.println("2 years later: "+cal.getTime());
		System.out.println("At present calendar's year: "+cal.get(Calendar.YEAR));
		System.out.println("At present calendar's day: "+cal.get(Calendar.DATE));
		System.out.println("At present Date and Time Is: "+cal.getTime());
		int max=cal.getMaximum(Calendar.DAY_OF_WEEK);
		System.out.println("Maximum number of days in a week: "+max);
		 max=cal.getActualMaximum(Calendar.WEEK_OF_YEAR);
		System.out.println("Maximum number of weeks in a year: "+max);
		int min=cal.getMinimum(Calendar.DAY_OF_WEEK);
		System.out.println("Minimum number of days in week: "+min);
		min=cal.getMinimum(Calendar.WEEK_OF_YEAR);
		System.out.println("Minimum number of weeks in a year: "+min);
	}
}