class Assign_Op //������, ������
{
	public static void main(String[] args) 
	{
		int sum=0; //���ʱ�ȭ
		for (int i=1; i<=10; i++)
		{
			sum+=i; //sum = sum + i;
			System.out.println(sum);
		}
		System.out.println(" ");
		int gob=1; //���ʱ�ȭ
		for (int i=1; i<=10; i++)
		{
			gob*=i; //gob = gob * i;
			System.out.println(gob);
		}
	}
}