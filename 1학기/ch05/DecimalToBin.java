class  DecimalToBin
{
	public static void main(String[] args) 
	{
		//10���� int 64�� 32��Ʈ 2������ ��ȯ�ϴ� ���α׷��� �ۼ��϶�
		//�����
		int num=64;
		String result=""; //����XX, ��Ʈ���� ���� ������ ��� 0�� 1�� ���̱� ����?
		for (int i=1;i<=32;i++)
		{
			result=num%2+result;
			num=num/2; //num/=2 ���Կ�����, num �ڽ��� 2�� ������ ��ȭ��Ų��.
			//System.out.println(result); �ܰ躰�� ���� ���� ��
		}
		System.out.println("64��"+result);
	}
}
