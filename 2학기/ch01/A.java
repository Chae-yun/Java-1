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

	void show(){
		System.out.println("나는 자식 B클래스 입니다.");
	}
}