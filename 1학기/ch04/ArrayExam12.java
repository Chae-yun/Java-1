class ArrayExam12
{
	public static void main(String[] args) 
	{
		int add=1;
		int[][] a = new int[4][4];
		for (int i = 0; i < a.length ; i++)//Çà
		{
			for (int j = 0; j < a[i].length; j++)//¿­
			{
				a[i][j]=add++;
				System.out.print(a[i][j]+"\t");
			}
			System.out.print("\n");//ÁÙ¹Ù²Þ
		}
	}
}
