import java.util.*;
class p4
{
	static float Int(int p,int r,int n)
	{
		float i= (p*r*n)/100;
		return i;
	}
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	int p= sc.nextInt();
	int r= sc.nextInt();
	int n= sc.nextInt();
	float i = Int(p,r,n);
	System.out.println(i);
	}	
}