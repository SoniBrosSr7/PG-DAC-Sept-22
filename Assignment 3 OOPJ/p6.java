import java.util.*;
class Book{
	String author;
	String title;
	double cost;
	int stockPosition;
	
	Book(String a,String t,double c,int sp)
	{
		author=a;
		title=t;
		cost=c;
		stockPosition=sp;
	}
	void print()
	{
		System.out.println("Book Author"+author);
		System.out.println("Book title"+title);
		System.out.println("Book cost"+cost);
		System.out.println("Book stockPosition"+stockPosition);
	}
	
	
}

class BookShop{
	Book b[]=new Book[1000];
	int i=0;
	void addBook(String a,String t,double c,int sp)
	{
		b[i]=new Book(a,t,c,sp);
		i++;
		System.out.println("Book added sucessfully");
	}
	void serchBook()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("author name");
		String  a=sc.next();
		System.out.println("book name");
		String t=sc.next();
		for(int j=0;j<i;j++)
		{
			if(b[j].author.equals(a) && b[j].title.equals(t))
			{
				b[j].print();
				
				int x=sc.nextInt();
				if(x<(b[i-1].stockPosition))
				{
					System.out.println("total cost:-"+(x*b[j].cost));
				}
				else{
					System.out.println("required copies are not available");
				}
			}
			else
			{
				System.out.println("Book is not available in stock");
			}
		}
	}
	public static void main(String args[])
	{
		BookShop bs=new BookShop();
		bs.addBook("Tarun","maths-1",500,25);
		bs.addBook("Ramesh","physics-2",300,10);
		bs.addBook("Jagdish","chem-3",200,50);
		bs.serchBook();
	}
}