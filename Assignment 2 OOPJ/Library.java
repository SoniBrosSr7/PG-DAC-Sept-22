import java.util.Scanner;
class Book{
	String title;
	String []author;
	int page;
	float price;
	String publisher;
	
	Book(String n,String a[],int p,float pr,String pub)
	{
		title=n;
		author=a;
		page=p;
		price=pr;
		publisher=pub;
		
	}
}
class Library
{
	 int i=0;
	Book[] b=new Book[100];
	void addBook(String n,String a[],int p,float pr,String pub)
	{
		for(int c=0;c<100;c++)
		{
			if(b[c]==null)
			{
			b[c]=new Book(n,a,p,pr,pub);
			break;
			}
		}
		i++;
	}
		
	
	
	void deleteBook()
	{

		System.out.println("select book to deleate");
		for(int j=1;j<i+1;j++)
		System.out.println(j+" for book-"+j);
	    Scanner sc = new Scanner(System.in);
		int j=sc.nextInt();
		b[j-1]=null;
		System.out.println("deleated sucessfull");
		
	}
	void print()
	{ for(int a=0;a<i;a++)
		{
			if(b[a]==null)
				continue;
		System.out.println("----------------------------");
		System.out.println("title :-"+b[a].title);
		System.out.println("list of author name:-");
		for(String s:b[a].author)
		{
			System.out.println(":-"+	s);
		}
		System.out.println("page :-"+b[a].page);
		System.out.println("price :-"+b[a].price);
		System.out.println("publisher :-"+b[a].publisher);
		System.out.println(a);
		}
	}
	void totalPrice()
	{
		float sum=0;
		for(int r=0;r<i;r++)
		{
			sum=sum+b[r].price;
		}
		System.out.println(sum);
		
	}
	
	
	public static void main(String args[])
	{
		Library l1=new Library();
		l1.addBook("maths-1",new String[]{"Tarun","Ramesh"},500,500.23f,"x");
		l1.addBook("maths-2",new String[]{"Shyam","Manish"},400,400.23f,"xz");
		l1.addBook("maths-3",new String[]{"Jagdish","Kalpesh"},300,300.23f,"yz");
		l1.addBook("maths-4",new String[]{"Mehesh","Mukesh"},200,200.23f,"xy");
		l1.addBook("maths-5",new String[]{"Pratik","Manju"},100,100.23f,"xyz");
		l1.print();
		l1.totalPrice();
		l1.deleteBook();
		l1.print(); 
		l1.addBook("maths-",new String[]{"Pratik","Manju"},100,100.23f,"xyz");
		l1.print(); 
	}
}