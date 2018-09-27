package d260918;

public class Year {
	private int year;
	
	
	
	
	public void setYear(int y)
	{
		if(y>0)
		{
			this.year=y;
		}
	}
	public int getYear()
	{
		return year;
	}
	public int findOddDaysInYear(int y)
	{
		y--;
		int lp100s=0;
		int t,odd=0;
		t=y%400;
		int lp=((t/4)*2);
		int nonlp=t-(t/4);
		for(int i=100;i<400;i=i+100)
			if(t>=i)
				lp100s++;
			
			
			
			
		odd=(nonlp+lp-lp100s)%7;
		
		return odd;
	}
}
