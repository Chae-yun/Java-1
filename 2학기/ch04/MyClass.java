class GrandFather
{
	private String name;
	//public GrandFather(){}
	public GrandFather(String name){
		this.name = name;
		System.out.println("GrandFather ������ " + name);
	}
}

public class MyClass extends GrandFather
{
	public MyClass(String str){
		super(str); //GrandFather�� �������Լ� ã�ư�
		//super(str)������ ���� �Ű����� ���� �������Լ� �־�� ��
		System.out.println("MyClass ������");
	}
	public static void main(String[] args) 
	{
		MyClass s = new MyClass("ȫ�浿");
	}
}
