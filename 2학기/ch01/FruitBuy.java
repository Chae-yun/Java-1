class Fruit //extends Object �� �����Ǿ� �ִ�
{
	int apple = 50;
	int melon = 10;
	int banana = 30;
}

class FruitBuy 
{
	public static void main(String[] args) 
	{
		Fruit f1 = new Fruit();
		Fruit f2 = f1; //f1�� �������� �޾� f2���� �ֹǷ� ���� ������ ����Ŵ (��ü��������)
		System.out.println(f1.apple + " " + f1.melon + " " + f1.banana);
		System.out.println(f2.apple + " " + f2.melon + " " + f2.banana); //��� �Ȱ��� ����
	}
}
