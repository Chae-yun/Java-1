//��Ӱ� �޼��� �������̵�
class A 
{
	int number = 5;
	String color = "black";

	void show(){
		System.out.println("���� �θ� AŬ���� �Դϴ�.");
	}
}

class B extends A //BŬ������ AŬ������ ��ӹ޴´�.
{
	String name = "child";

	void show(){ //������(�޼���������̵�)
		System.out.println("���� �ڽ� BŬ���� �Դϴ�.");
	}
}

public class ABTest
{
	public static void main(String args[])
	{
		A a = new A();
		B b = new B();
		System.out.println(a.number);
		System.out.println(b.number); //��ӹ޾ұ� ������ ���� ���������� �ʾƵ� �ִ�
		//System.out.println(a.name); �ڽ����� �߰��� ���� �θ����� ����
		System.out.println(b.name);
		a.show();
		b.show(); //�������߱� ������ �θ�� �ٸ���
	}
}