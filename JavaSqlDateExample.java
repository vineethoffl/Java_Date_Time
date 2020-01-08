package javadateclassical;

import java.sql.Date;
public class JavaSqlDateExample
{
	public static void main(String args[])
	{
		long millis=System.currentTimeMillis();  //Returns the current time in milliseconds.
		java.sql.Date d1=new java.sql.Date(millis);
		System.out.println(d1);
		String str="2019-12-31";
		Date d2=Date.valueOf(str);//converting string into sql date
		System.out.println(d2);
	}
}
