class t2 
{
	 static void pattern()
	{
		for (int i =1;i<=6 ;i++ )
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2==1)
				{
				System.out.print('a');
				}
				else 
				{
					System.out.print('b');
				}
			}
			System.out.println( );
			
		}
	}
	public static void main(String[] args) 
	{
		t2.pattern();
		
	}
}
