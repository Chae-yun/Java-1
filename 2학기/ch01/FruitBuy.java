class Fruit //extends Object 가 생략되어 있다
{
	int apple = 50;
	int melon = 10;
	int banana = 30;
}

class FruitBuy 
{
	public static void main(String[] args) 
	{
		Fruit f1 = new Fruit();
		Fruit f2 = f1; //f1의 참조값을 받아 f2에게 주므로 같은 내용을 가르킴 (객체참조변수)
		System.out.println(f1.apple + " " + f1.melon + " " + f1.banana);
		System.out.println(f2.apple + " " + f2.melon + " " + f2.banana); //결과 똑같이 나옴
	}
}
