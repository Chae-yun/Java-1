class ArrayExam2
{
	public static void main(String[] args) 
	{
		//int[] a = new int[]{1,2,3,4,5,6,7,8,9,10};  //123�ܰ� ���� ����
		int[] a=new int[10];
		for (int i=0 ; i<a.length ; i++)
		{
			a[i]=i+1; //���� �ʱ�ȭ ���� �ʰ� ���α׷����� �ʱ�ȭ, �ʱ�ȭ �����־����Ƿ� 0�� i+1����
			System.out.println("a["+i+"]="+a[i]);
		}
	}
}