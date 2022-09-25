class P2Q2
{
	public static void main(String args[])
	{
 
		for(char i='A';i<='E';i++) //row
		{
			for(char j='A';j<=i;j++) //column
			{
				System.out.print(j+" ");
			}				
			System.out.println();
		}
	}
}	



/*
Output
A
A B
A B C
A B C D
A B C D E
*/