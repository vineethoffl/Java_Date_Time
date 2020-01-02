package javadatetime;
import java.time.LocalDate;
import java.time.Month;
public class DateTimeExample 
{

	public static void main(String[] args)
	{
		// current date
		LocalDate localDate=LocalDate.now();
		System.out.println("Today's Date id : "+localDate);
        //specific date
		LocalDate localDate2=LocalDate.of(2020, Month.JANUARY,02);
		System.out.println(localDate2);
		LocalDate localDate3=LocalDate.of(1947, Month.AUGUST,15);
		System.out.println(localDate3);
		
		System.out.println("Year :  "+localDate.getYear());
		System.out.println("Month : "+localDate.getMonth().getValue());
		System.out.println("Day of Month : "+localDate.getDayOfMonth());
		System.out.println("Day of Week : "+localDate.getDayOfWeek());
		System.out.println("Day of Year : "+localDate.getDayOfYear());
		
		//localdate's plus methods
		System.out.println("Addition of Days : "+localDate.plusDays(5));
		System.out.println("Addition of months : "+localDate.plusMonths(15));
		System.out.println("Addition of weeks : "+localDate.plusWeeks(45));
		System.out.println("Addition of years : "+localDate.plusYears(5));
		
		//LocalDate,s minus methods
		System.out.println("Substraction of of Days : "+localDate.minusDays(5));
		System.out.println("Substraction of of Months : "+localDate.minusMonths(25));
		System.out.println("Substraction of of Weeks : "+localDate.minusWeeks(50));
		System.out.println("Substraction of of Years: "+localDate.minusYears(15));
		
		//isEqual() example
		if(localDate.isEqual(localDate2))
		{
			System.out.println("localDate1 and localDate2 are equal");
		}
		else
		{
			System.out.println("localDate1 and localDate2 are not equal");	
		}
	
		//ifAfter() Example
		if(localDate2.isAfter(localDate3))
		{
			System.out.println("localDate2 comes after localDate3");
		}
		
		//isBefore() example
		if(localDate3.isBefore(localDate))
		{
			System.out.println("localDate3 comes before localDate1 ");
		}
	}
}
