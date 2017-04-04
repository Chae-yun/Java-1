class Car
{
	String name;
	String company;
	private int price; //private 를 접근제어자로 지정하면 다른 곳에서 불러올 수 없음
	Car(String n, String c, int p){
		setName(n); //캡슐화 시키면 보안성 업업
		setCompany(c);
		setPrice(p);
	}
	void setName
}

class CarTest 
{
	public static void main(String[] args) 
	{
		Car mycar = new Car(i30, 현대, 35000000);
		/*mycar.name = "i30";
		mycar.company = "현대";
		mycar.price = 35000000; 이렇게 설계 XX*/
		System.out.println(mycar.name + mycar.company + mycar.price);
	}
}
