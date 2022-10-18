class Box{
	int hight;
	int width;
	int bredth;
	Box(int h,int w,int b)
	{
		hight=h;
		width=w;
		bredth=b;
	}
	int getVolume()
	{
		return hight*bredth*width;
	}
	int getArea()
	{
		return 2*((hight*bredth)+(width*bredth)+(hight*width));
	}
	public static void main(String args[])
	{
		Box b1= new Box(10,10,10);
		Box b2= new Box(10,10,20);
		System.out.println(b1.getVolume());
		System.out.println(b1.getArea());
		System.out.println(b2.getVolume());
		System.out.println(b2.getArea());
	}

}