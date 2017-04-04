class ArrayExam11
{
	public static void main(String[] args) 
	{
		int[][] a = new int[4][4];
		for (int i = 0; i < a.length; i++) //За
		{
			for (int j = 0; j < a[i].length; j++) //ї­
			{
				a[i][j]=1;
				System.out.print(a[i][j]+"\t");
				//System.out.print((a[i][j]+1)+"\t");
			}
			System.out.print("\n");
		}
	}
}
