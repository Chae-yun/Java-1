class Apple //���� final ���̸� ��������
{
	int size;
	double weight;
	final int Amount = 20;

	/*Apple(int s, double w){
		size = s;
		weight = w;
	}*/

	void show(){ //���� final ���̸� ��������
		//Amount = 25; final �̶� ��������
		System.out.println("���� " + weight + "g, ũ�� " + size + "cm");
	}
}

class Boosa extends Apple
{
	String color;
	void show(){
		System.out.println("���� " + weight + "g, ũ�� " + size + "cm, ���� " + color); //�������̵�(������)
	}
}

class FinalTest
{
	public static void main(String[] args) 
	{
		/*Apple a1 = new Apple(20, 500);
		a1.show();*/
	}
}
