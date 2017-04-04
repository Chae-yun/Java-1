class Assign_Op //누적합, 누적곱
{
	public static void main(String[] args) 
	{
		int sum=0; //합초기화
		for (int i=1; i<=10; i++)
		{
			sum+=i; //sum = sum + i;
			System.out.println(sum);
		}
		System.out.println(" ");
		int gob=1; //곱초기화
		for (int i=1; i<=10; i++)
		{
			gob*=i; //gob = gob * i;
			System.out.println(gob);
		}
	}
}