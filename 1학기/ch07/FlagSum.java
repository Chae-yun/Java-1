class FlagSum
{
	public static void main(String[] args) 
	{ //1 -2 +3 -4 ..... 출력하기
		//과제로 1부터100사이의 짝수의 합을 출력 (EvenSum1to100)
		int sum=0;
		/*for (int i=1;i<=10;i++) //반복횟수
		{
			if(i%2==1){
				sum+=i;
			}
			else if(i%2==0){
				sum-=i;
			}
		}
		System.out.print(sum);*/
		for (int i=1;i<=10;i++) //반복횟수
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
