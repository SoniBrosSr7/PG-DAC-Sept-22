interface Shape{
	void area();
	void draw();
	void move(double x,double y);
}
class Circle implements Shape{
	double radius;
	double x;
	double y;
	public void area()
	{
	System.out.println("area of circle is :-"+(3.14*radius*radius));	
	}
	Circle(double r,double x,double y)
	{
		radius=r;
		this.x=x;
		this.y=y;
		
	}
	public void draw()
	{
		System.out.println("Sucessfully drawn!!!");
	}
	public void move(double x,double y )
	{
		this.x=x;
		this.y=y;
		System.out.println("Suucessfully moved to new center:-"+"("+this.x+","+this.y+")");
	}
	void print()
	{
		System.out.println("cirecle redius"+radius);
		System.out.println("center:-"+"("+this.x+","+this.y+")");
	}
}
class Rectangle implements Shape{
	double length;
	double bredth;
	double x;
	double y;
		public void area()
	{
		System.out.println("area of rectangle is :-"+(length*bredth));
	}
	Rectangle(double l,double b,double x,double y)
	{
		length=l;
		bredth=b;
		this.x=x;
		this.y=y;
		
	}
	public void draw()
	{
		System.out.println("Sucessfully drawn");
	}
	public void move(double x,double y)
	{
		this.x=x;
		this.y=y;
		System.out.println("Suucessfully moved to new center:-"+"("+this.x+","+this.y+")");
	}
	
	void print()
	{
		System.out.println("rectange length"+length);
		System.out.println("rectangle "+bredth);
		System.out.println("center:-"+"("+this.x+","+this.y+")");
	}
}

class P5{
	public static void main(String args[])
	{
		Circle c = new Circle(5,0,0);
		c.draw();
		c.area();
		c.move(5,5);
		c.print();
		Rectangle r=new Rectangle(10,20,0,0);
		r.draw();
		r.area();
		r.move(5,5);
		r.print();
		;
	}
}