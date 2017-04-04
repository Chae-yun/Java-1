class Odd 
{
	public static void main(String[] args) 
	{
		//1부터 50사이의 홀수를 구하라
		for (int i=1;i<=50;i++)
		{
			if(i%2==1)
			{
			System.out.print(i+" ");
			}//if
		}//for
		System.out.println();
		for (int j=51;j<=100;j++)
		{
			if(j%2==0)
			{
				System.out.print(j+" ");
			}//if
		}//for
	}//main
}//class
