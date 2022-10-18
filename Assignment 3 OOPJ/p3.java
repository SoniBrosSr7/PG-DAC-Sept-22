class Person{
	int age;
	double weight;
	double hight;
	String dateOfBirth;
	String address;
	
	void setData(int a,double w,double h,String d,String ad)
	{
		age=a;
		weight=w;
		hight=h;
		dateOfBirth=d;
		address=ad;
	}
	
	void getData()
	{
		System.out.println("age:-"+age);
		System.out.println("weight:-"+weight);
		System.out.println("hight:-"+hight);
		System.out.println("dateofbirth:-"+dateOfBirth);
		System.out.println("address:-"+address);
	}
}

class Employee extends Person
{
	double salary;
	String dateOfJoining;
	double experiance;
	
	void setData(int a,double w,double h,String d,String ad,double s,String dj,double ex)
	{
		super.setData(a,w,h,d,ad);
		salary=s;
		dateOfJoining=dj;
		experiance=ex;
		
	}
	void getData()
	{
		super.getData();
		System.out.println("salary:-"+salary);
		System.out.println("dateOfJoining:-"+dateOfJoining);
		System.out.println("experiance:-"+experiance);
	}
}
class Student extends Person
{
	int roll;
	String listOfSubject[];
	double marks;
	
	void setData(int a,double w,double h,String d,String ad,int r,String [] li,double m)
	{
		super.setData(a,w,h,d,ad);
		roll=r;
		listOfSubject=li;
		marks=m;
		
	}
	void calculateGrade()
	{
		System.out.println((marks/listOfSubject.length));
	}
	void getData()
	{
		int i=0;
		super.getData();
		System.out.println("roll:-"+roll);
		System.out.println("list of subject:-");
		for(String s:listOfSubject)
		{
			i++;
			System.out.println(i+"):-"+s);
		}
		System.out.println("marks:-"+marks);
		
	}
}
class Professor extends Employee
{
	String cource;
	String listOfAdvice[];
	
	void setData(int a,double w,double h,String d,String ad,double s,String dj,double ex,String c,String []li)
	{
		super.setData(a,w,h,d,ad,s,dj,ex);
		cource=c;
		listOfAdvice=li;
		
		
	}
	void getData()
	{
		int i=0;
		super.getData();
		System.out.println("cource:-"+cource);
		System.out.println("list of adice:-");
		for(String s:listOfAdvice)
		{
			i++;
			System.out.println(i+"):-"+s);
		}
	}
	
}
class Technician  extends Employee
{
	void setData(int a,double w,double h,String d,String ad,double s,String dj,double ex)
	{
		super.setData(a,w,h,d,ad,s,dj,ex);
	}
	void getData()
	{
		super.getData();
	}
}
class P3{
	public static void main(String args[])
	{
		Technician t=new Technician();
		t.setData(23,64,168,"30/01/1997","Bhilai,kaliyabid",100000,"20/01/2021",2);
		t.getData();
		Employee E1=new Employee();
		E1.setData(23,64,168,"30/01/1999","Raipur,Mewar",100000,"20/01/2022",2);
		E1.getData();
		Professor p1=new Professor();
		p1.setData(23,64,168,"30/01/1999","Maharpur,kaliyabid",100000,"20/01/2021",2,"Civil",new String[]{"thermal","Maths"});
		p1.getData();
		Student s1=new Student();
		s1.setData(23,64,168,"30/01/1999","Durg,kaliyabid",1,new String[]{"thermal"},100);
		s1.calculateGrade();
		s1.getData();
		Person p=new Person();
		p.setData(23,64,168,"30/01/1999","Bhopal,kaliyabid");
		p.getData();
	}
}