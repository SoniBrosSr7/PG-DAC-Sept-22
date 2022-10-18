class Student{
	String name;
	double s1;
	double s2;
	double s3;
	
	void getDetails(String n,double a,double b, double c)
	{
		name=n;
		s1=a;
		s2=b;
		s3=c;
	}
	void avrage()
	{
		System.out.println((s1+s2+s3)/3);
	}
	void printDetails()
	{
		System.out.println(name);
		System.out.println(s1+s2+s3);
	}
	
	public static void main(String argc[])
	{
		Student s=new Student();
		s.getDetails("Tarun",100,150,200);
		s.avrage();
		s.printDetails();
	}
	
}