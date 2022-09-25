class P2Q5
{
	public static void main(String args[])
	{
 
		for(char i='A';i<='E';i++) //row
		{
			for(char j='A';j<=i;j++) //column
			{
				System.out.print(i+" ");
			}				
			System.out.println();
		}
	}
}	



/*
Output
A
B B
C C C
D D D D
E E E E E
*/