class DateDemo
{
	int date;
	int month;
	int year;
	int i=1;
	int j=0;
	
	DateDemo()
	{
		date=01;
		month=01;
		year=1970;
	}
	DateDemo(int d)
	{
		date=d;
		month=01;
		year=1970;
	}
	DateDemo(int d,int m)
	{
		date=d;
		month=m;
		year=1970;
	}
	DateDemo(int d,int m,int y)
	{
		date=d;
		month=m;
		year=y;
	}
	
	void nextday()
	{
		switch(month)
		{
			case 1:
			case 3:
			case 5:
		    case 7:
			case 8:
			case 10:
			case 12:
			{
				if(date<31)
				{
					date++;
					break;
				}
				else
				{
					date=1;
					break;
				}
			}
			
			case 2:
			{
			if(date<28)
				{
					date++;
					break;
				}
				else
				{
					date=1;
					break;
				}
			}
			case 4:
			case 6:
			case 9:
			
			case 11:
			{
				if(date<30)
				{
					date++;
					break;
				}
				else
				{
					date=1;
					break;
				}
			}
		}
		switch(date)
		{
			case 1:
			{
				if (month<12)
					month++;
				else
					month=1;
			}
		}
		switch(month)
		{
			case 1:
			{
				if(date==1)
				year++;
				break;
				
			}
		}
		
		System.out.println(String.format("%02d-%02d-%04d",date,month,year));
	}
		void priviousday()
	{
		switch(month)
		{
			
			case 3:
			{
			if(date>1)
				{
					date--;
					break;
				}
				else
				{
					date=28;
					break;
				}
			}
			
			case 5:
		    case 7:
			case 8:
			case 10:
			case 12:
			{
				if(date>1)
				{
					date--;
					break;
				}
				else
				{
					date=30;
					break;
				}
			}
			case 1:
			case 2:
			case 4:
			case 6:
			case 9:
			
			case 11:
			{
				if(date>1)
				{
					date--;
					break;
				}
				else
				{
					date=31;
					break;
				}
			}
		}
		for(;j<1;j++)
		{
		switch(date)
		{
			case 30:
			case 31:
		    case 28:
			{
				if (month>1)
					month--;
				else
					month=12;
				break;
			}
			
			
		}
		}
		
		switch(month)
		{
			case 12:
			{
				if(date ==31)
				year--;
			break;
				
			}
		}
		if(i==1)
		{
			i++;
			priviousday();
		}
		else
		System.out.println(String.format("%02d-%02d-%04d",date,month,year));
		
	}
	public static void main(String args[])
	{
		DateDemo date = new DateDemo();
		date.nextday();
		date.priviousday();
		DateDemo date1 = new DateDemo(01,03,2000);
		date1.nextday();
		date1.priviousday();
	}
}