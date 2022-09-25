class P2Q17
{
	public static void main(String args[])
	{
	     int a=0;
		for(int i=1;i<=5;i++) //row
		{
			
			for(int j=1;j<=i;j++) //column
			{
				a++;
				System.out.print(a+" ");
			}				
			System.out.println();
		}
	}
}	



/*
Output
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/