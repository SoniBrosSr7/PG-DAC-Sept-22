class P2Q3
{
	public static void main(String args[])
	{
 
		for(char i='A';i<='E';i++) //row
		{
			for(char j='A';j<=i;j++) //column
			{
				System.out.print("* ");
			}				
			System.out.println();
		}
	}
}	



/*
Output
*
* *
* * *
* * * *
* * * * *
*/