class FruitDriver 
{
	public static void main(String[] args) 
	{
		int total;
		Fruit f1 = new Fruit(30, 30, 30);
		System.out.println("f1의 총 갯수" + f1.count());
		System.out.println("사과의 총 갯수" + f1.getApple());
		System.out.println("딸기의 총 갯수" + f1.getStraw());
		System.out.println("포도의 총 갯수" + f1.getGrapes());
		//사과의 갯수를 알기 위해 멤버변수에 직접 접근(지금은 바꿈)
		f1.setApple(50);
		//객체내의 메서드결과값(원래 갖고 있던 sum 값 : 90)
		//그래서 객체의 멤버변수가 변했으나 메서드 결과는 변하지 않는 이상한 결과
		//해결책은 멤버변수에 직접 접근하지 못하게 하는 것 (private)
		System.out.println("f1의 총 갯수" + f1.count());
		System.out.println("사과의 총 갯수" + f1.getApple());
	}
}
