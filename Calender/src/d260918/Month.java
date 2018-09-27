package d260918;

public class Month {

	private int month;
	
	
	
	
	public void setMonth(int month)
	{
		if(month>0 && 13>month)
		{
			this.month=month;
		}
	}
	public int getMonth()
	{
		return month;
	}
	
	public int findOddDaysInMonth(int month,int year)
	{
		month--;
		int odd=0;
		if(year%4!=0||year%100==0||year%400!=0)
		{
		int[] m={3,0,3,2,3,2,3,3,2,3,2,3};
		for(int i=0;i<month;i++)
			{
				odd=odd+m[i];
			}
		}
		else
		{
			int[] m={3,1,3,2,3,2,3,3,2,3,2,3};
			for(int i=0;i<month;i++)
			{
				odd=odd+m[i];
			}
		}
		
		odd=odd%7;
		
		return odd;
	}

}
