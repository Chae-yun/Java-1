class FruitDriver 
{
	public static void main(String[] args) 
	{
		int total;
		Fruit f1 = new Fruit(30, 30, 30);
		System.out.println("f1�� �� ����" + f1.count());
		System.out.println("����� �� ����" + f1.getApple());
		System.out.println("������ �� ����" + f1.getStraw());
		System.out.println("������ �� ����" + f1.getGrapes());
		//����� ������ �˱� ���� ��������� ���� ����(������ �ٲ�)
		f1.setApple(50);
		//��ü���� �޼�������(���� ���� �ִ� sum �� : 90)
		//�׷��� ��ü�� ��������� �������� �޼��� ����� ������ �ʴ� �̻��� ���
		//�ذ�å�� ��������� ���� �������� ���ϰ� �ϴ� �� (private)
		System.out.println("f1�� �� ����" + f1.count());
		System.out.println("����� �� ����" + f1.getApple());
	}
}
