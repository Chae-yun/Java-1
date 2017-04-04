class Ship
{
	public String Name(){
		return "배 이름";
	}
}

class MyShip extends Ship
{
	public String Name(){
		return "해적선";
	}
}

class YourShip extends Ship
{
	public String Name(){
		return "타이타닉 호";
	}
}

class ShipName
{
	public static void search(Ship s){ //매개변수가 Ship(부모클래스)형태의 객체 => 앞에서 업캐스팅했기 때문에 OK
		if(s instanceof MyShip){
			MyShip b = (MyShip)s; //다운캐스팅
			System.out.println("MyShip 이름 : " + b.Name());
		}
		else if(s instanceof YourShip){
			YourShip b = (YourShip)s;
			System.out.println("YourShip 이름 : " + b.Name());
		}
	}
}

class ShipMainExam 
{
	public static void main(String[] args) 
	{
		Ship myship = new MyShip();
		Ship yourship = new YourShip();
		ShipName.search(myship);
		ShipName.search(yourship);
	}
}