class  DecimalToBin_method
{
	//��������(����)��(�����Ǵ� �޼���)   ���������     ����Ÿ���� ����    �޼����̸�   �Ű�����(�൵ �ǰ� �� �൵ ��?)
	public                                            static             void                    main           (String[] args)
	//static : �޸� �켱�ε�, �޼��� ����ñ��� �޸�(ram)�� ����(�Ϲ������� ���������� static��..)
	/*����!! ���α׷��� ����� �� ���� ���� �ε�(static)�Ǵ� �޼���μ� �̸��� main()�̰�,
	����Ÿ���� void��, �Ű������� string[] args �̴�.
	�׸��� ��� ���� Ŭ�������� ����� ������ main�� �޸𸮿� ����ִ�.
	�ٸ� �޼���� ������ ������ �ָ޸𸮿��� �������. ȣ��Ǹ� �ٽ� �޸𸮿� �ö�´�.
	�ܺ� Ŭ������ �����Ǿ� �ִ�.(main�� �ݵ�� public. �׷��� ������.(??))*/
	{
		//10���� int 64�� 32��Ʈ 2������ ��ȯ�ϴ� ���α׷��� �ۼ��϶�
		//�����
		int num=64;
		System.out.println(toBinary(num));
		System.out.println(toBinary(150)); //�޼���ϱ� ��� ȣ��
		System.out.println(toBinary(100));
		System.out.println(toBinary(200));
		/*String result=""; //����XX, ��Ʈ���� ���� ������ ��� 0�� 1�� ���̱� ����?
		for (int i=1;i<=32;i++)
		{
			result=num%2+result;
			num=num/2; //num/=2 ���Կ�����, num �ڽ��� 2�� ������ ��ȭ��Ų��.
			//System.out.println(result); �ܰ躰�� ���� ���� ��
		}
		System.out.println("64��"+result);*/
	}
	static String toBinary(int num){ //mainȣ���ϴ� �Ŵϱ� static
		//int num �ϰ� �ٸ��͵� ���� �ʹٸ� int num, int a, int b.. �� '������Ÿ�� ������'�̶�� ����
		String result=""; //toBinary���� ���̴� ���̱� ������ result������ ����� ������.
		for (int i=1;i<=32;i++)
		{
			result=num%2+result;
			num=num/2; //num/=2 ���Կ�����, num �ڽ��� 2�� ������ ��ȭ��Ų��.
			//System.out.println(result); �ܰ躰�� ���� ���� ��
		}
		return result;
	}
}
