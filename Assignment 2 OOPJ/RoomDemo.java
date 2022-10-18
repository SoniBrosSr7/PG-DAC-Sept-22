class Room{
	int hight;
	int bredth;
	int width;
	
	Room(int h,int b,int w)
	{
		hight=h;
		bredth=b;
		width=w;
	}
	void volume()
	{
		System.out.println(hight*bredth*width);
	}
}
class RoomDemo{
	public static void  main(String srgs[])
	{
		Room r=new Room(10,10,10);
		r.volume();
	}
}