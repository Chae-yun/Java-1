class ArrayExam14
{
	public static void main(String[] args)
	{
		int sum=0, b=1;
		int[][] a = new int[4][4];
		for (int i = 0; i < a.length ; i++)//Çà
		{
			for (int j = 0; j < a[i].length; j++)//¿­
			{
				a[i][j]=sum+b;
				System.out.print(a[i][j]+"\t");
				sum+=4;
			}
			sum=0;
			b++;
			System.out.print("\n");//ÁÙ¹Ù²Þ
		}
	}
}