package javadatetime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
public class JavaOffsetDateTime {

	public static void main(String[] args) 
	{
	OffsetDateTime offsetDT=OffsetDateTime.now();
	System.out.println(offsetDT.getDayOfMonth());
	System.out.println(offsetDT.getDayOfYear());
	System.out.println(offsetDT.getDayOfWeek());
	System.out.println(offsetDT.toLocalDate());
	OffsetDateTime value1=offsetDT.minusDays(365);
	System.out.println(value1);
	OffsetDateTime value2=offsetDT.plusDays(365);
	System.out.println(value2);
	}

}
