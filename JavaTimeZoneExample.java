package javadateclassical;
import java.util.Calendar;
import java.util.TimeZone;
public class JavaTimeZoneExample
{
	public static void main(String[] args)
	{
		String[] id=TimeZone.getAvailableIDs();//Gets all the available IDs supported.
		System.out.println("In Timezone cl,ass available IDs are: ");
		for(int i=0;i<id.length;i++)
		{
			System.out.println(id[i]);
		}
		TimeZone z=TimeZone.getTimeZone("Asia/kolkata");//getTimeZone Gets the TimeZone for the given ID.
		System.out.println("The Offset value of TimeZone: "+z.getOffset(Calendar.ZONE_OFFSET) );//getOffset Returns the offset of this time zone from UTC at the specified date
		System.out.println("Value of ID is: "+z.getID());
		String name=z.getDisplayName();
		System.out.println("Display name for default time zone: "+name);
	}
}
