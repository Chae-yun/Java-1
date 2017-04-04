class ArrayExam2
{
	public static void main(String[] args) 
	{
		//int[] a = new int[]{1,2,3,4,5,6,7,8,9,10};  //123단계 전부 포함
		int[] a=new int[10];
		for (int i=0 ; i<a.length ; i++)
		{
			a[i]=i+1; //직접 초기화 하지 않고 프로그램으로 초기화, 초기화 안해주었으므로 0에 i+1대입
			System.out.println("a["+i+"]="+a[i]);
		}
	}
}