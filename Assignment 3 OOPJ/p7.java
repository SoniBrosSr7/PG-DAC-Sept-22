class Author{
	private String name;
	private String email;
	private char ch;
	
	Author(String n,String e,char c)
	{
		name=n;
		email=e;
		ch=c;
	}
	void getDetails()
	{
	   System.out.println(name);
	   System.out.println(email);
	    System.out.println(ch);
	}
}
class Book{
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	
	Book(String n1,String n2,String em,char c,double pr,int qs)
	{
		name=n1;
		author=new Author(n2,em,c);
		price=pr;
		qtyInStock=qs;
		
	}
	
	void getName()
	{
		System.out.println(name);
	}
	
	Author getAuthor()
	{
	  return author;
	}
	void getPrice()
	{
		System.out.println(price);
	}
	void setPrice(double pr)
	{
		this.price=pr;
	}
	void getQtyInStock()
	{
		System.out.println(qtyInStock);
	}
	void setQtyInStock(int qs)
	{
		qtyInStock=qs;
	}

public static void main(String args[])
{
	Book b1=new Book("The Wings of Fire","APJ Abdul Kalam","abdulkalam@gmail.com",'M',500,25);
	b1.getName();
	b1.getPrice();
	b1.getQtyInStock();
	Author author=b1.getAuthor();
	author.getDetails();
	
}
}