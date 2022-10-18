import java.util.*;
class p5
{
	static int[] Cal(int p)
	{
		int a[] = new int [3];
		a[0]= p/365;
		a[1]=(p%365)/30;
		a[2]=(p%365)%30;
		return a;
		}
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	int p= sc.nextInt();
	int a[]=Cal(p);
	System.out.println("Years ="+a[0]);
	System.out.println("Month ="+a[1]);
	System.out.println("Day ="+a[2]);
	}	
}