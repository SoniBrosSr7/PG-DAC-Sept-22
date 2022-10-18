import java.util.*;
class p3{
	static float cal(int a[])
	{
	int sum= a[0]+a[1]+a[2]+a[3]+a[4];
    float p= sum/5;
    return p;	
	}
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	int a[]=new int[5];
	a[0]=sc.nextInt();
	a[1]=sc.nextInt();
	a[2]=sc.nextInt();
	a[3]=sc.nextInt();
	a[4]=sc.nextInt();
	float p=cal(a);
	System.out.println("percentage marks = "+p+"%" );
	}
	
	
}