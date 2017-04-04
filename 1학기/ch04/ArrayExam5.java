class ArrayExam5
{
	public static void main(String[] args) 
	{
		int[] a=new int[5];
		a.length=3; //길이는 건들수 없다. 불러다 쓰기만 가능
		for (int i=0 ; i<a.length ; i++)
		{
			System.out.println("a["+i+"]="+a[i]);
		}
	}
}