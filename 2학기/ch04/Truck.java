class Car
{
	Car(){
		System.out.println("Car 생성자");
	} //Car가 없다면 생성자가 없기때문에 super();를 컴파일러가 자동으로 끼워넣어줌 그래서 object까지 찾아 올라가기때문에 에러 없음
}

class Truck extends Car
{
	Truck(){
		System.out.println("Truck 생성자");
	}
	public static void main(String[] args) 
	{
		Truck mytruck = new Truck();
		//하위 클래스에서 인자(매개변수)없는 객체가 생성되면 자동으로 상위 클래스의 인자 없는 생성자함수(디폴트)실행
		//따라서 mytruck을 생성하기 위해 Truck()을 실행하면 상위의 Car()부터 실행하게 된다.
	}
}

//시험내기 좋은 정확한 예제!! 외우기!!!