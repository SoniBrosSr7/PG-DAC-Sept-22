class MathOperation{
	static int add(int a,int b)
	{
		return a+b;
	}
	static int subtract(int a,int b)
	{
		return a-b;
	}
	static int product(int a,int b)
	{
		return a*b;
	}
	static double power(int a,int b)
	{
		return Math.pow(a,b);
	}
}
class Demo
{
	public static void  main(String args[])
	{
		MathOperation o1=new MathOperation();
		System.out.println(o1.add(10,20));
		System.out.println(o1.subtract(10,20));
		System.out.println(o1.product(10,20));
		System.out.println(o1.power(10,20));
	}
}