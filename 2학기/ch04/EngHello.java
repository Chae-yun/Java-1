class Greeting
{
	public String name = "È«±æµ¿";
	public void sayHello(){
		System.out.println("¾¾ ¾È³çÇÏ¼¼¿ä");
	}
}

public class EngHello extends Greeting 
{
	public String name = "Mr.Hong";
	public void sayHello(){ //ÀçÁ¤ÀÇ
		System.out.println(name + " Nice to meet you");
	}
	public void test(){
		System.out.println(super.name);
		super.sayHello();
	}
	public static void main(String[] args){
		EngHello eng = new EngHello();
		eng.sayHello();
		eng.test();
	}
}
