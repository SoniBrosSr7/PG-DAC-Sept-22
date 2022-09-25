class P2Q10
{
	public static void main(String args[])
	{
		for(char i='E';i>='A';i--) //row
		{  
			for(char j=i;j>'A';j--) //column
			{
				System.out.print(" ");
			}	
			
			for(char j=i;j<='E';j++) //column
			{
				System.out.print(j+" ");
				
			}				
			System.out.println();
		}
	}
}	



/*
Output
    E
   D E
  C D E
 B C D E
A B C D E
*/