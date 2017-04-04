//상속과 메서드 오버라이딩
class A 
{
	int number = 5;
	String color = "black";

	void show(){
		System.out.println("나는 부모 A클래스 입니다.");
	}
}

class B extends A //B클래스는 A클래스를 상속받는다.
{
	String name = "child";

	void show(){ //재정의(메서드오버라이딩)
		System.out.println("나는 자식 B클래스 입니다.");
	}
}

public class ABTest
{
	public static void main(String args[])
	{
		A a = new A();
		B b = new B();
		System.out.println(a.number);
		System.out.println(b.number); //상속받았기 때문에 따로 정의해주지 않아도 있다
		//System.out.println(a.name); 자식한테 추가된 것은 부모한테 없다
		System.out.println(b.name);
		a.show();
		b.show(); //재정의했기 때문에 부모와 다르다
	}
}