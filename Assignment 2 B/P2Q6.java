class P2Q6
{
	public static void main(String args[])
	{
 
		for(char i='A';i<='E';i++) //row
		{
			for(char j='E';j>i;j--) //column
			{
				System.out.print("  ");
			}				
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