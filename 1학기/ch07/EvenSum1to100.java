class EvenSum1to100
{
	public static void main(String[] args) 
	{ //1부터 100사이의 짝수의 합을 출력
		int sum=0;
		for (int i=1;i<=100;i++) //반복횟수
		{
			if(i%2==0){
				sum+=i;
			}
		}
		System.out.print(sum);
	}
}