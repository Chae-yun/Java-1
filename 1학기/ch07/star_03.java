class star_03
{
	public static void main(String[] args) 
	{
		for (int i=1 ; i<=5 ; i++)
		{
			for (int j=1 ; j<=i-1 ; j++) //01234 �þ�� ����
			{
				System.out.print(" ");
			}
			for (int k=1 ; k<=6-i ; k++) //54321 �پ��� ��
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
