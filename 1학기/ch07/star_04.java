class star_04
{
	public static void main(String[] args) 
	{
		for (int i=1; i<=5; i++)
		{
			for (int j=1; j<=5-i; j++) //43210 �پ��� ����
			{
				System.out.print(" ");
			}
			for (int k=1; k<=2*i-1; k++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
