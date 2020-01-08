package javadateclassical;
import java.util.*;
public class JavaUtilDateExample
{
	public static void main(String args[])
	{
		Date mydate = new Date();
		System.out.println("Sytem date :"+mydate.toString());  //prints local date
		mydate.setTime(15680);
		System.out.println("Time after setting :"+mydate.toString());  //prints local date + 15680 milli seconds
		int d = mydate.hashCode();
		System.out.println("Amount (in ms)  by which time is shifted : "+d);
		Date d1 = new Date(2020,01,06);
		Date d2 = new Date(2019,12,06);
		boolean a=d2.after(d1);
		System.out.println("Is date2 is after date1 : "+a);
		a = d1.after(d2);
		System.out.println("Is date1 is after date2 : "+a);
		System.out.println();
		Object date3=d1.clone();
		System.out.println("Cloned date3 : "+date3.toString());
		System.out.println();
		boolean b =d2.before(d1);
		System.out.println("Is date2 is before date1 : "+d);
		Date d3 = new Date(97,10,27);
		Date d4 = new Date(97,6,12);
		int comparison = d1.compareTo(d2);
		int comparison2 = d2.compareTo(d1);
		int comparison3 = d1.compareTo(d2);
		System.out.println("d1>d2"+comparison);
		System.out.println("d1<d2"+comparison2);
		System.out.println("d1=d2"+comparison3);
		System.out.println();
		boolean r1 = d1.equals(d2);
		System.out.println("Result of equal r1 :"+r1);
		boolean r2=d1.equals(d1);
	    System.out.println("Result of equals<() r2 : "+r2);
	    long count1=d1.getTime();//Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this Date object.
	    long count2=d1.getTime();
	    System.out.println("Milliseconds of d1 : "+count1);
	    System.out.println("Milliseconds of d2 : "+count2);
	}
}