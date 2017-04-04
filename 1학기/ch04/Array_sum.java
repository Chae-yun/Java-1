class Array_sum 
{
	public static void main(String[] args) 
	{
		int[] a=new int[100];
		int sum=0, sign;
		for (int i=0 ; i<a.length ; i++)
		{
			sign=1;
			if(i%2==1)
			{
				sign=(-1); //-에 가독성을 위해 괄호 묶어주기
			}
			a[i]=(i+1)*sign;
			System.out.print(a[i]+"  ");
			sum+=a[i];
		}
		/*int sum=0;
		for (int i=0 ; i<a.length ; i++)
		{
			if(i%2==1){ //a[1] a[3] a[5]...가 음수
				a[i]=-(i+1);
			}
			else{
				a[i]=(i+1);
			}
			System.out.print(a[i]+"  ");
			sum+=a[i];
		}*/
		System.out.println("\n총 합 : "+sum);
	}
}
