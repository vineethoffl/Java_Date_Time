package javadatetime;
import java.time.LocalTime;
public class TimeExample1 {

	public static void main(String[] args) 
	{
		// Current Time
		LocalTime localTime=LocalTime.now();
		System.out.println(localTime);
		
		//Specific Date
		LocalTime localTime2=LocalTime.of(4, 30, 45);
		System.out.println(localTime2);
		System.out.println("Hour : " + localTime.getHour());
		System.out.println("Minute : " + localTime.getMinute());
		System.out.println("Second : " + localTime.getSecond());
		
		//LocalTime's plus methods
		System.out.println("Addition of hours : " + localTime.plusHours(2));
		System.out.println("Addition of Minutes : " + localTime.plusMinutes(30));
		System.out.println("Addition of Seconds : " + localTime.plusSeconds(20));
		System.out.println("Addition of Nanos : " + localTime.plusNanos(60000));
		
		//LocalTime's minus methods
		System.out.println("Substraction of hours : " + localTime.minusHours(2));
		System.out.println("Substraction of Minutes : " + localTime.minusMinutes(30));
		System.out.println("Substraction of Seconds : " + localTime.minusSeconds(20));
		System.out.println("Substraction of Nanos : " + localTime.minusNanos(60000));
		
		LocalTime localTime3=LocalTime.of(11, 45, 20);
		
		//compare To() example
		if(localTime.compareTo(localTime)==0)
		{
			System.out.println("localDate1 and localDate2 are equal");
		}
		else
		{
			System.out.println("localDate1 and localDate2 are not equal");
		}
		
		//isBefore() example
		if(localTime2.isBefore(localTime3))
		{
			System.out.println("localDate2 comes before localDate3");
		}
		//isAfter() example
				if(localTime3.isAfter(localTime))
				{
					System.out.println("localDate3 comes after localDate1");
				}
		
		
	}

}
