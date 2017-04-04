class ArrayExam10
{
	public static void main(String[] args) 
	{
		int a[];
		int[] b;
		int[] c={31,32,33};
		a=new int[4];
		b=new int[]{21,22,23,24};
		c=b;
		/*for (int result=0 ; result<c.length ; result++)
		{
			System.out.print(c[result]+"  ");
		}*/
		System.out.println(a.length+" "+b.length+" "+c.length); //a[4]까지만 출력가능
	}
}