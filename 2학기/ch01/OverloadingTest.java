class C
{
	void show(){ //�Ű����� - 0
		System.out.println("�ݰ����ϴ�");
	}
	void show(int n){ //�Ű����� - 1(����)
		System.out.println("�ݰ����ϴ� " + n + "��");
	}
	void show(int n, String str){ //�Ű����� - 2(����, ���ڿ�)
		System.out.println(n + "�� �ݰ����ϴ� " + str);
	} //�����ε� 2�� ��(�޼����� Ÿ�Թٲ��ְ� ���� Ŭ�������� ���� �޼����̹Ƿ�)
}

class OverloadingTest 
{
	public static void main(String[] args) 
	{
		C c = new C();
		c.show();
		c.show(1);
		c.show(1, "�׸���!");
	} //�������̵� �����ε� �򰥸��ϱ� �ܿ��!!! ������
}
