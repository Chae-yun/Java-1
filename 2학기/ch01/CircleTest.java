class Circle
{
	/*원을 모델링하라 (반지름 9, 중심좌표는 (3, 2), 넓이를 구하고 (-10, 9)만큼 이동하고 중심점 좌표를 출력하라.
	1. 반지름, 중심점 좌표 => 생성자함수(메서드) Circle(r, x, y)
	2. 반지름을 이용해 원의 넓이를 구하라 => 메서드 getArea(), PI = 3.14
	3. 원을 이동시켜라 => 메서드 move(dx, dy)
	4. 이동한 원의 중심좌표를 출력하여라 => getXY()*/

	double r, x, y;
	final double PI = 3.14; //상수

	Circle(double r, double x, double y){
		this.r = r; //얻어온 r을 원래 Circle에 있던 위에 줄에서 선언했던 r에 집어넣는다.
		this.x = x;
		this.y = y;
	}
	
	double getArea(){
		return r * r * PI;
	}

	String getXY(){
		return ("원의 중심점의 좌표 : (" + x + ", " + y + ")");
	}

	void move(double dx, double dy){
		x += dx;
		y += dy;
	}
}

class CircleTest
{
	public static void main(String[] args) 
	{
		Circle cir = new Circle(9, 3, 2);
		System.out.println("원의 넓이는 " + cir.getArea() + "입니다.");
		System.out.println("이동 전 " + cir.getXY());
		cir.move(-10, 9);
		System.out.println("이동 후 " + cir.getXY());
	}
}
//Circle 클래스와 CircleTest 클래스는 완전히 독립되어 있다