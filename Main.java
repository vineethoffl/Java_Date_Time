package javadatetime;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
public class Main
{
	public static void main(String[] args)
	{
		int r;
		int room=1;
		int id=1;
		int i=0;
		String b;
		String b1="";
		String b2="";
		String b3="";
		LocalDate sdate;
		LocalDate edate;
		LocalDate bdate;
		Reg arr[]=new Reg[10];	
		Book brr[]=new Book[10];
		Scanner ob=new Scanner(System.in);
		do
		{
		System.out.print(".1Booking \n2.View \n3.Exit---->");
		r=ob.nextInt();
		switch(r)
		{
		case 1:
			do
			{
				System.out.println("<\t----###Registration###----->");
		System.out.println("Enter your name:");
		String n=ob.next();
		System.out.println("Enter your address:");
		String a=ob.next();
		System.out.println("Contact Number:");
		String p=ob.next();
		System.out.println("Email ID:");
		String e=ob.next();
		System.out.println("Enter proof type:");
		String pt=ob.next();
		System.out.println("Enter proof id:");
		String pi=ob.next();
		arr[i]=new Reg();
		arr[i].register(id,n,a,p,e,pt,pi);
		System.out.println("Thank you for registering.Your id is :"+id);
		System.out.println("Do you want to book a room (y/n)?");
		b=ob.next();
		if(b.equals("y"))
		{
			System.out.println("<\t#####Booking#####>");
		System.out.println("Please choose the services required.");
		System.out.println("AC/non-AC(AC/nAC)");
		String ac=ob.next();
		System.out.println("Cot(Single/Double)");
		String cot=ob.next();
		System.out.println("With cable connection/without cable connection(C/nC)");
		String cable=ob.next();
		System.out.println("Wi-Fi needed or not(W/nW)");
		String wifi=ob.next();
		System.out.println("Laundry service needed or not(L/nL)");
		 String laundry=ob.next();
		 System.out.println("Enter the date of booking(dd/mm/yy)");
		 String bookdate=ob.next();
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");//String date = "16/08/2016";
		bdate = LocalDate.parse(bookdate, formatter);
		brr[i]=new Book();
	brr[i].booking(id,room,bdate,ac,cot,cable,wifi,laundry);
	System.out.println("Do you want to proceed?(yes/no)");
	b1=ob.next();
	if(b1.equals("yes"))
	{
		System.out.println("Thank you for booking. Your room number is "+room);
	}
	else
	{
		System.out.println("Thank you");
	}
		}
		else
		{
			System.out.println("Thank you");
		}
	System.out.println("Do you want to continue registration?(yes/no)");
	b2=ob.next();		
	i++;
	id++;
	room++;
		}while(b2.equals("yes"));
			break;	
		case 2:
			System.out.println("<########View all bookings########>");
			System.out.println("Enter the start date(dd/mm/yyyy)");
			String stdate=ob.next();
			DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("d/MM/yyyy");
			//String date = "16/08/2016";
		 sdate = LocalDate.parse(stdate, formatter1);
			System.out.println("Enter the end date(dd/mm/yyyy)");
			String endate=ob.next();
			DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("d/MM/yyyy");//String date = "16/08/2016";
			edate = LocalDate.parse(endate, formatter2);
			System.out.println("The bookings made from "+stdate+" to "+endate+" are");
			System.out.println("Room number\t"+"Customer ID");
			for(int j=0;j<i;j++)
			{
				if(brr[j].date.isAfter(sdate)&&brr[j].date.isBefore(edate))
			brr[j].display();	
			}
			break;
		case 3:
			System.exit(0);
			break;
			default:
		break;
		}
		System.out.println("Do you want to continue (yes/no)");
		b3=ob.next();
}while(b3.equals("yes"));
		}
}