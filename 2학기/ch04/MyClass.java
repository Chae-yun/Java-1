class GrandFather
{
	private String name;
	//public GrandFather(){}
	public GrandFather(String name){
		this.name = name;
		System.out.println("GrandFather 생성자 " + name);
	}
}

public class MyClass extends GrandFather
{
	public MyClass(String str){
		super(str); //GrandFather의 생성자함수 찾아감
		//super(str)없으면 위에 매개변수 없는 생성자함수 넣어야 됨
		System.out.println("MyClass 생성자");
	}
	public static void main(String[] args) 
	{
		MyClass s = new MyClass("홍길동");
	}
}
