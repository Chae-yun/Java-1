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

	void show(){
		System.out.println("���� �ڽ� BŬ���� �Դϴ�.");
	}
}