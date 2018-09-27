package d260918;
import java.time.LocalDateTime;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		LocalDateTime current = LocalDateTime.now();
		 
		int cDay=current.getDayOfMonth();
		int cMonth=current.getMonthValue();
		int cYear=current.getYear();
		int cHour=current.getHour();
		int cMin=current.getMinute();
		int cSec=current.getSecond();
		
		
		System.out.println("Current time(hh:mm:ss): "+cHour+":"+cMin+":"+cSec);
	    System.out.println("Current Date(dd/mm/yy): "+cDay+"/"+cMonth+"/"+cYear);
	    
	    System.out.println();
	    System.out.println();
	    
	    Year year=new Year();
		year.setYear(cYear);
		int oddDaysInYear=year.findOddDaysInYear(year.getYear());
		
		System.out.println("odd days in year="+oddDaysInYear);
		
		
		Month month=new Month();
		month.setMonth(cMonth);
		int oddDaysInMonth=month.findOddDaysInMonth(month.getMonth(),cYear);
		
		System.out.println("odd days in month="+oddDaysInMonth);
		
		
		Day day=new Day();
		day.setDay(cDay);
		int oddDaysInDay=day.findOddDaysInDay(day.getDay());
		
		System.out.println("odd days in day="+oddDaysInDay);
		
	
		System.out.println();
	    System.out.println();
	    
	  
	    System.out.println(printMonthName(cMonth)+"-"+cYear);
	    printWeek();
	    int allOddDays=(oddDaysInMonth+oddDaysInYear+1)%7;
	    print1T031Days(printMonthName(cMonth),cYear,allOddDays,cDay,cMonth,cYear,cHour,cMin,cSec);
	    
	    
	    //Time
	    Time time=new Time();
	    time.setHrs(cHour);
	    time.setMin(cMin);
	    time.setSec(cSec);
	    
	    
	    int Calender=0;
	    
	    int tDay=cDay;
		int tMonth=cMonth;
		int tYear=cYear;
		int toddDaysInYear;
		int toddDaysInMonth;
		int tallOddDays;
	    
	    while(Calender==0)
	    {
	    System.out.println("******** Choose One ********");
	    System.out.println();
	    System.out.println("1.Prev Month");
	    System.out.println("2.Next Month");
	    System.out.println("3.Prev Year");
	    System.out.println("4.Next Year");
	    System.out.println("5.Customs Month and Year");
	    System.out.println("6.find weekDay");
	    System.out.println("7.Exit");
	    System.out.print("Select your option:");
	    int s=obj.nextInt();
	    System.out.println();
	    
	    switch(s)
	    {
	    case 1:
	    	tMonth--;
	    	if(tMonth==-1)
	    	{
	    		tMonth=12;
	    		tYear--;
	    	}
	    	 
	    	System.out.println(printMonthName(tMonth)+"-"+tYear);
	 	   	printWeek();
	 	   	toddDaysInYear=year.findOddDaysInYear(tYear);
	 	   	toddDaysInMonth=month.findOddDaysInMonth(tMonth,tYear); 
	 	   	tallOddDays=(toddDaysInMonth+toddDaysInYear+1)%7;
	 	   	print1T031Days(printMonthName(tMonth),tYear,tallOddDays,cDay,cMonth,cYear,cHour,cMin,cSec);
	 	   	break;
	 	   
	    case 2:
	    	tMonth++;
	    	if(tMonth==13)
	    	{
	    		tMonth=1;
	    		tYear++;
	    	}
	    	
	    	System.out.println(printMonthName(tMonth)+"-"+tYear);
	 	   	printWeek();
	 	   	toddDaysInYear=year.findOddDaysInYear(tYear);
	 	   	toddDaysInMonth=month.findOddDaysInMonth(tMonth,tYear); 
	 	   	tallOddDays=(toddDaysInMonth+toddDaysInYear+1)%7;
	 	   	print1T031Days(printMonthName(tMonth),tYear,tallOddDays,cDay,cMonth,cYear,cHour,cMin,cSec);
	    	break;
	    	
	    case 3:
	    	for(int i=0;i<12;i++)
	    	{
	    		tMonth--;
		    	if(tMonth==0)
		    	{
		    		tMonth=12;
		    		tYear--;
		    	}
		    	 
		    	System.out.println(printMonthName(tMonth)+"-"+tYear);
		 	   	printWeek();
		 	   	toddDaysInYear=year.findOddDaysInYear(tYear);
		 	   	toddDaysInMonth=month.findOddDaysInMonth(tMonth,tYear); 
		 	   	tallOddDays=(toddDaysInMonth+toddDaysInYear+1)%7;
		 	   	print1T031Days(printMonthName(tMonth),tYear,tallOddDays,cDay,cMonth,cYear,cHour,cMin,cSec);
	    	}
	    	break;
	    	
	    case 4:
	    	for(int i=0;i<12;i++)
	    	{
	    		tMonth++;
		    	if(tMonth==13)
		    	{
		    		tMonth=1;
		    		tYear++;
		    	}
		    	
		    	System.out.println(printMonthName(tMonth)+"-"+tYear);
		 	   	printWeek();
		 	   	toddDaysInYear=year.findOddDaysInYear(tYear);
		 	   	toddDaysInMonth=month.findOddDaysInMonth(tMonth,tYear); 
		 	   	tallOddDays=(toddDaysInMonth+toddDaysInYear+1)%7;
		 	   	print1T031Days(printMonthName(tMonth),tYear,tallOddDays,cDay,cMonth,cYear,cHour,cMin,cSec);
	    	}
	    	break;
	    	
	    case 5:
	    	System.out.println("Enter Month");
	    	while(true)
	    	{
	    		tMonth=obj.nextInt();
	    		if(tMonth>0 && tMonth<13)
	    			break;
	    		else
	    			System.out.println("Enter correct Month!!");
	    	}
	    	System.out.println("Enter Year");
	    	while(true)
	    	{
	    		tYear=obj.nextInt();
	    		if(tYear>0)
	    			break;
	    		else
	    			System.out.println("Enter correct Year!!");
	    	}
	    	
	    	
	    	System.out.println(printMonthName(tMonth)+"-"+tYear);
	 	   	printWeek();
	 	   	toddDaysInYear=year.findOddDaysInYear(tYear);
	 	   	toddDaysInMonth=month.findOddDaysInMonth(tMonth,tYear); 
	 	   	tallOddDays=(toddDaysInMonth+toddDaysInYear+1)%7;
	 	   	print1T031Days(printMonthName(tMonth),tYear,tallOddDays,cDay,cMonth,cYear,cHour,cMin,cSec);
	    	break;
	    	
	    case 6:
	    	int tM,tY,tD;
	    	
	    	System.out.println("Enter Day");
	    	while(true)
	    	{
	    		tD=obj.nextInt();
	    		if(tD>0 && tD<32)
	    			break;
	    		else
	    			System.out.println("Enter correct Day!!");
	    	}
	    	
	    	System.out.println("Enter Month");
	    	while(true)
	    	{
	    		tM=obj.nextInt();
	    		if(tM>0 && tM<13)
	    			break;
	    		else
	    			System.out.println("Enter correct Month!!");
	    	}
	    	
	    	System.out.println("Enter Year");
	    	while(true)
	    	{
	    		tY=obj.nextInt();
	    		if(tY>0)
	    			break;
	    		else
	    			System.out.println("Enter correct Year!!");
	    	}
	    	
	    	toddDaysInYear=year.findOddDaysInYear(tY);
	    	toddDaysInMonth=month.findOddDaysInMonth(tM,tY);
	    	tallOddDays=(toddDaysInMonth+toddDaysInYear+tD)%7;
	    	System.out.println("The weekDay of "+tD+"/"+tM+"/"+tY+" is "+printWeekDay(tallOddDays));
	   		break;
	    	
	    case 7:
	    	Calender++;
	     
	     }//switch
	    }//while
	     
	     
	     
	}//Main
	
	public static String printWeekDay(int odd)
	{
		String[] weekDay={"SunDay","MonDay","TueDay","WednesDay","ThursDay","FriDay","saturDay"};
		return weekDay[odd];
	}
	
	public static String printMonthName(int month)
	{
		month--;
		String[] m={"January","February","March","April","May","June","July","August","September","October","November","December"};
		
		return m[month];
	}
	
	public static void printWeek()
	{
		String[] week={"Sun","Mon","Tue","Wed","Thur","Fri","sat"};
		for(int i=0;i<7;i++)
		{
			System.out.print(week[i]+"\t");
		}
		System.out.println();
	}
	
	public static void print1T031Days(String month,int year,int allOddDays,int cday,int cmonth,int cyear,int cHour,int cMin,int cSec)
	{
		int w=0,t=0;
		for(int i=0;i<allOddDays;i++)
		{
			System.out.print(" \t");
			w++;
		}
		if(month.equals("January")||month.equals("March")||month.equals("May")||month.equals("July")||month.equals("August")||month.equals("October")||month.equals("December"))
		{
			for(int i=1;i<=31;i++)
			{
				System.out.print(i);
				String m=printMonthName(cmonth);
				if(cday==i && m.equals(month) && cyear==year)
				{
					System.out.print("*");
					t++;
				}
				System.out.print("\t");
				w++;
				if(w==7)
				{
					w=0;
					System.out.println();
				}
			}
			System.out.println();
			if(t==1)
				System.out.println("Current time(hh:mm:ss): "+cHour+":"+cMin+":"+cSec);
		}
		else if(month.equals("April")||month.equals("June")||month.equals("September")||month.equals("November"))
		{
			for(int i=1;i<=30;i++)
			{
				System.out.print(i);
				String m=printMonthName(cmonth);
				if(cday==i && m.equals(month) && cyear==year)
				{
					System.out.print("*");
					t++;
				}
				System.out.print("\t");
				w++;
				if(w==7)
				{
					w=0;
					System.out.println();
				}
			}
			System.out.println();
			if(t==1)
				System.out.println("Current time(hh:mm:ss): "+cHour+":"+cMin+":"+cSec);
		}
		else if(year%4!=0||year%100==0||year%400!=0)
		{
			for(int i=1;i<=28;i++)
			{
				System.out.print(i);
				String m=printMonthName(cmonth);
				if(cday==i && m.equals(month) && cyear==year)
				{
					System.out.print("*");
					t++;
				}
				System.out.print("\t");
				w++;
				if(w==7)
				{
					w=0;
					System.out.println();
				}
			}
			System.out.println();
			if(t==1)
				System.out.println("Current time(hh:mm:ss): "+cHour+":"+cMin+":"+cSec);
		}
		else
		{
			for(int i=1;i<=29;i++)
			{
				System.out.print(i);
				String m=printMonthName(cmonth);
				if(cday==i && m.equals(month) && cyear==year)
				{
					System.out.print("*");
					t++;
				}
				System.out.print("\t");
				w++;
				if(w==7)
				{
					w=0;
					System.out.println();
				}
			}
			System.out.println();
			if(t==1)
				System.out.println("Current time(hh:mm:ss): "+cHour+":"+cMin+":"+cSec);
		}
		System.out.println();
	    System.out.println();
	}

	
}
