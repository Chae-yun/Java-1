class EvenSum1to100
{
	public static void main(String[] args) 
	{ //1���� 100������ ¦���� ���� ���
		int sum=0;
		for (int i=1;i<=100;i++) //�ݺ�Ƚ��
		{
			if(i%2==0){
				sum+=i;
			}
		}
		System.out.print(sum);
	}
}