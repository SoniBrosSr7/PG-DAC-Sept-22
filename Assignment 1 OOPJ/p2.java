import java.util.*;
class p2{
	static float[] cal(int r)
	{
		float a[] = new float [2];
		 a[0]= 2*(float)Math.PI*r;
		 a[1]= 2*(22/7)*r*r;
		return a;
	}
	public static void main( String args[])
	{
	Scanner sc = new Scanner(System.in);
	int r= sc.nextInt();
	float a[]=cal(r);
	System.out.println("Area of this circle " +a[0]);
	System.out.println("Area of this circle " +a[1]);
	
	}
	
}