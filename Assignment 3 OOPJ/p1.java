abstract class Publication{
	int noOfPages;
	double price;
	String publisherName;
	String name;
	
	Publication(String s,int n,double p,String pub)
	{
		noOfPages=n;
		price=p;
		publisherName=pub;	
		name=s;
	}
}

class Book extends Publication{
	
	Book(String s,int n,double p,String pub)
	{
		super(s,n,p,pub);
	}
	
}
class Journal extends Publication{
	
	Journal(String s,int n,double p,String pub)
	{
		super(s,n,p,pub);
		
	}
}
class Library{
	
	Publication P[]=new Publication[100];
	int i=0;
	void addBook(String s,int n,double p,String pub)
	{
		P[i]=new Book(s,n,p,pub);
		i++;
	}
	void addJournal(String s,int n,double p,String pub)
	{
		P[i]=new Journal(s,n,p,pub);
		i++;
	}
	
	void print()
	{
		for(int c=0;c<i;c++)
		{
			System.out.println("--------------------");
			System.out.println("name:-"+P[c].name);
			System.out.println("name:-"+P[c].noOfPages);
			System.out.println("name:-"+P[c].price);
			System.out.println("name:-"+P[c].publisherName);
			System.out.println("--------------------");
		}
	}


	
	public static void main(String args[])
	{
		Library l1=new Library();
		l1.addBook("mathematics-1",500,100,"XY");
		l1.addBook("science-1",520,600,"YZ");
		l1.addBook("chhattisgarhiya-1",400,800,"XZ");
		l1.addJournal("tarun's",400,800,"myOwn");
		l1.addBook("tarun-2",400,800,"Myown");
		l1.print();
	}
}