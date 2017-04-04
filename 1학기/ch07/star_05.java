class star_05
{
	public static void main(String[] args) 
	{
		for (int i=1; i<=5; i++)
		{
			for (int j=1; j<=5-i; j++) //43210 줄어드는 공백
			{
				System.out.print(" ");
			}
			for (int k=1; k<=2*i-1; k++) //별 반쪽
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		for (int i=1; i<=4; i++)
		{
			for (int j=1; j<=i; j++) //43210 줄어드는 공백
			{
				System.out.print(" ");
			}
			for (int k=1; k<=9-2*i; k++) //별 반쪽
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
