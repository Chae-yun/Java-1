class Car 
{
	String carname;
	String color;
	int velocity;
	void speedUp(){
		velocity += 5;
		System.out.println("�ӵ� " + velocity + " ����");
	}
	void speedDown(){
		velocity -= 5;
		System.out.println("�ӵ� " + velocity + " ����");
	}
}

class Truck extends Car
{
	int ton = 5;
	void speedUp(){
		velocity += 10;
		System.out.println("�ӵ� " + velocity + " ����");
	}
}

class MainTruckExam
{
	public static void main(String[] args) 
	{
		Truck mytruck = new Truck();
		mytruck.speedUp();
		mytruck.speedDown();
	}
}
