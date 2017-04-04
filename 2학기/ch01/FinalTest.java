class Apple //여기 final 붙이면 에러에러
{
	int size;
	double weight;
	final int Amount = 20;

	/*Apple(int s, double w){
		size = s;
		weight = w;
	}*/

	void show(){ //여기 final 붙이면 에러에러
		//Amount = 25; final 이라서 에러에러
		System.out.println("무게 " + weight + "g, 크기 " + size + "cm");
	}
}

class Boosa extends Apple
{
	String color;
	void show(){
		System.out.println("무게 " + weight + "g, 크기 " + size + "cm, 색깔 " + color); //오버라이딩(재정의)
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
