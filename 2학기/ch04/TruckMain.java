class Truck extends Car 
{
	int ton; //Car이 가지고 있는 carname, color, velocity 는 기본적으로 가지고 있다
}

class TruckMain
{
	public static void main(String[] args) 
	{
		Truck mytruck = new Truck();
		mytruck.carname = "프론티어"; //상속받음
		mytruck.ton = 3; //자식의 속성
		System.out.println("나의 트럭은 " + mytruck.color + "이다."); //상속받음
		System.out.println(mytruck.carname + "은 " + mytruck.ton + "톤을 실을 수 있다.");
	}
}
