class FlagSum
{
	public static void main(String[] args) 
	{ //1 -2 +3 -4 ..... ����ϱ�
		//������ 1����100������ ¦���� ���� ��� (EvenSum1to100)
		int sum=0;
		/*for (int i=1;i<=10;i++) //�ݺ�Ƚ��
		{
			if(i%2==1){
				sum+=i;
			}
			else if(i%2==0){
				sum-=i;
			}
		}
		System.out.print(sum);*/
		for (int i=1;i<=10;i++) //�ݺ�Ƚ��
		{
			if (i==1)
			{
				System.out.print(i);
			}
			else if(i%2==1){
				System.out.print("+"+i);
			}
			else if(i%2==0){
				System.out.print("-"+i);
			}
		}
	}
}
