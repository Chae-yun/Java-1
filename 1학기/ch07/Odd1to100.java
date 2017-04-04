class Odd1to100
{
	public static void main(String[] args) 
	{ //1부터 100까지의 홀수를 출력하는 프로그램
		for (int i=1;i<=100;i++) //반복횟수
		{
			if(i%2==1){
				System.out.print(i+"   ");
			}
		}
	}
}
