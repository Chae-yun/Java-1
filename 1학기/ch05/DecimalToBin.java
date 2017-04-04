class  DecimalToBin
{
	public static void main(String[] args) 
	{
		//10진수 int 64를 32비트 2진수로 변환하는 프로그램을 작성하라
		//선언부
		int num=64;
		String result=""; //공백XX, 스트링을 쓰는 이유는 계속 0과 1을 붙이기 때문?
		for (int i=1;i<=32;i++)
		{
			result=num%2+result;
			num=num/2; //num/=2 대입연산자, num 자신을 2로 나누어 변화시킨다.
			//System.out.println(result); 단계별로 보고 싶을 때
		}
		System.out.println("64는"+result);
	}
}
