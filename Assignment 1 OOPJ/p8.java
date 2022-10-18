import java.util.*;
class p8{
	public static void main( String args[])
	{
		Scanner sc = new Scanner(System.in);
		double ba=sc.nextInt();
		double hra= 0;
	    double da =0;
		if(ba<10000)
		{
			hra=.1*ba;
			da= .9*ba;
			double gs=ba+hra+da;
			System.out.println(gs);
		}
		else
		{
			hra=2000;
			da=.98*ba;
		    double gs=ba+hra+da;
			System.out.println(gs);
			
		}
	}
	
}