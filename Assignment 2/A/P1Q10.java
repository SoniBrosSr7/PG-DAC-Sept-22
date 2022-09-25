class P1Q10
{
	public static void main(String args[])
	{
		
		for(int i=1;i<=5;i++) //row
		{
			for(int j=5;j>i;j--) //column
			{
				System.out.print(" ");
			}				
			
			
			for(int j=1;j<=5;j++) //column
			{
				System.out.print("*");
			}				
			System.out.println();
		}
		
		
	}
}	




/*
Output
    *****
   *****
  *****
 *****
*****
*/