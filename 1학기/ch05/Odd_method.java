class Odd_method
{
	public static void main(String[] args) 
	{
		//1���� n������ Ȧ���� ����϶�
		getodd(50);
	}
	static void getodd(int n){
		for (int i=1;i<=50;i++)
		{
			if(i%2==1)
			{
			System.out.print(i+" ");
			}//if
		}
	}
}
