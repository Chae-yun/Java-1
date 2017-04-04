class Car_1
{
	/*Car_1(){
		System.out.println("Car 생성자");
	}*/
	//Car_1()가 없다면? 에러가 발생한다. 왜냐하면 매개변수가 있는 생성자 함수밖에 없어서 => 매개변수 없는 생성자도 존재해야한다 => 항상 기계적으로 넣어주자
	Car_1(String name){
		System.out.println("차 이름이 있는 생성자");
	}
}

class Truck_1 extends Car_1
{
	Truck_1(){
		//super("SM3"); 이거 넣으면 Car_1()없어도 에러안나고 매개변수타입에 맞는 생성자함수만 실행한다.
		System.out.println("Truck 생성자");
	}
	public static void main(String[] args) 
	{
		Truck_1 mytruck = new Truck_1(); //에러 나는 이유 : 매개변수가 없는 생성자 호출했는데 상위클래스인 Car_1에는 매개변수가 있는 생성자함수밖에 없어서 => 매개변수 없는 생성자 명시 필요
		//하위 클래스에서 인자(매개변수)없는 객체가 생성되면 자동으로 상위 클래스의 인자 없는 생성자함수(디폴트)실행
		//따라서 mytruck을 생성하기 위해 Truck()을 실행하면 상위의 Car()부터 실행하게 된다.
	}
}

//시험내기 좋은 정확한 예제!! 외우기!!!