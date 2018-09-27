package d260918;

public class Day {

	private int day;
	
	
	
	
	public void setDay(int day)
	{
		if(day>0 && 32>day)
		{
			this.day=day;
		}
	}
	public int getDay()
	{
		return day;
	}
	
	public int findOddDaysInDay(int day)
	{
		int odd=0;
		odd=day%7;
		
		
		return odd;
	}
}
