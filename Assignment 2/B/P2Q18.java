class P2Q18
{
	public static void main(String args[])
	{
		for(char i='E';i>='A';i--) //row
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
A B C D E
A B C D
A B C
A B
A
*/