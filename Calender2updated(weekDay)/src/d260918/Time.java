package d260918;

public class Time {
	
	private int hrs;
	private int min;
	private int sec;
	
	
	public void setHrs(int hrs)
	{
		if(24>hrs && hrs>=0)
		{
			this.hrs=hrs;
		}
	}
	public int getHrs()
	{
		return hrs;
	}
	
	public void setMin(int min)
	{
		if(60>min && min>=0)
		{
			this.min=min;
		}
	}
	public int getMin()
	{
		return min;
	}
	
	public void setSec(int sec)
	{
		if(60>sec && sec>=0)
		{
			this.sec=sec;
		}
	}
	public int getsec()
	{
		return sec;
	}
}
