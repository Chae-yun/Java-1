class  Switch
{
	public static void main(String[] args) 
	{
		int a=3;
		int b=5;
		System.out.println("a : "+a+", b : "+b);
		//스위치하기
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("a : "+a+", b : "+b);
	}
}