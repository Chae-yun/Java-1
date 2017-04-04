class star_06
{
	public static void main(String[] args) 
	{
		for (int i=1; i<=5; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			for (int k=1; k<=10-2*i; k++)
			{
				System.out.print(" ");
			}
			for (int l=1; l<=i; l++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
