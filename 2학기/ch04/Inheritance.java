class A
{
	int x;
}

class B extends A
{
	String x; //상속을 받은 B가 A를 이김 (자식이 셈) 결국 x는 String
}

class Inheritance 
{
	public static void main(String[] args) 
	{
		B b = new B();
		b.x=100;
		System.out.println("b.x = " + b.x);
	}
}

//에러남(메세지 기억)