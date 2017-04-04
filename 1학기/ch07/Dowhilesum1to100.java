class Dowhilesum1to100 
{
	public static void main(String[] args) 
	{
		int i=1, sum=0;
		do{
			sum+=i;
			i++;
		}while(i<=100);
		System.out.print(sum);
	}
}
