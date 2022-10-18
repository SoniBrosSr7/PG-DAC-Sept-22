class Automobile{
	private String make;
    private String type;
	private double speed;
	private double price;
	private double milage;
	private String regestrationNo;
	
	void setData(String m,String t,double s,double p,double mi,String reg)
	{
	  	  make=m;
		  type=t;
		  speed=s;
		  price=p;
		  milage=mi;
		  regestrationNo=reg;
		  
	}
	
	void printData()
	{
       System.out.println("make:-"+make);
	   System.out.println("type:-"+type);
	   System.out.println("speed:-"+speed);
	   System.out.println("price:-"+price);
	   System.out.println("milage:-"+milage);  
	   System.out.println("regestration no:-"+regestrationNo);  
	}
}
class Truck extends Automobile{
	double capacity;
	String hoodType;
	int noOfWheels;
	
		void setData(String m,String t,double s,double p,double mi,String reg,double c,String h,int n)
	{
	   super.setData(m,t,s,p,mi,reg);
	   capacity=c;
	   hoodType=h;
	   noOfWheels=n;  
	}
	
	void printData()
	{
        super.printData();
		System.out.println("capacity:-"+capacity);  
		System.out.println("hoodType:-"+hoodType);  
		System.out.println("noOfWheels:-"+noOfWheels);  
		
	}
}
class Car extends Automobile{
	int noOfDoors;
	int seatingCapacity;
	
	void setData(String m,String t,double s,double p,double mi,String reg,int d,int n)
	{
	   super.setData(m,t,s,p,mi,reg);
	   noOfDoors=d;
	   seatingCapacity=n;
	}
	
	void printData()
	{
        super.printData();
		System.out.println("noOfDoors:-"+noOfDoors);  
		System.out.println("seatingCapacity:-"+seatingCapacity);  
	}
	
}
class P4{
	public static void main(String args[])
	{
		Automobile a=new Automobile();
		a.setData("Benz","Sedan",200,2500000,22,"Benz123456");
		a.printData();
		Truck t= new Truck();
		t.setData("Audi","Sedan",200,2500000,22,"Audi123456",40000,"Open",10);
		t.printData();
		Car c= new Car();
		c.setData("Rolls Royace","Sedan",200,2500000,22,"Rolls123456",4,4);
		c.printData();
	}
}