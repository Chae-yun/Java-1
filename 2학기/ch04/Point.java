/*2차원 공간의 점을 나타내는 Point 클래스를 설계하고 작성하라
1. 멤버변수로 x, y 좌표를 갖는다.(x_coordinate, y_coordinate)
2. 생성자 함수는 (0,0)으로 초기화하거나, 특정 (x, y)로 초기화하는 2가지 종류를 갖는다.
3. X좌표를 반환하는 메소드(getX)를 갖는다.
4. Y좌표를 반환하는 메소드(getY)를 갖는다.
5. X좌표를 주어진 값으로 변경하는 메소드(setX)를 갖는다.
6. Y좌표를 주어진 값으로 변경하는 메소드(setY)를 갖는다.
7. 좌표값을 (x, y)의 형태로 출력하는 메소드(printAttr)를 갖는다.*/
public class Point
{
	protected double x_coordinate, y_coordinate;
	public Point(){
		setX(0);
		setY(0);
	}
	public Point(double x, double y){
		setX(x);
		setY(y);
	}
	public double getX(){
		return x_coordinate;
	}
	public double getY(){
		return y_coordinate;
	}
	protected void setX(double nX){
		x_coordinate = nX;
	}
	protected void setY(double nY){
		y_coordinate = nY;
	}
	public void printAttr(){
		System.out.println("(" + x_coordinate + ", " + y_coordinate + ")");
	}
	public static void main(String args[]){ //새로 CircleDriver만든 거랑 똑같다.
		Circle c = new Circle(2.3, 3.5, 5.);
		c.printAttr();
	}
}

/*2차원 공간의 원을 나타내는 Circle클래스를 설계하고 작성하라. 단, Circle은 Point를 상속한다.
1. 멤버변수로 원의 반지름을 갖는다.
2. Circle 객체를 기본값(x_coordinate = y_coordinate = radius = 0)으로 초기화 하는 생성자메서드를 갖는다.
3. 중심점은 Point 클래스로부터 상속받으며 특정한 (x,y)값과 radius의 Circle 객체를 초기화하는 생성자 메서드를 갖는다.
4. 반지름을 반환하는 메서드(getRadius)를 갖는다.
5. 원의 면적을 반화하는 메서드(getArea)를 갖는다.
6. 원의 중심과 면적을 출력하는 메서드(printAttr)를 갖는다.*/
class Circle extends Point
{
	static final double PI = 3.14;
	protected double radius;
	public Circle(){
		super();
		setRadius(0);
	}
	public Circle(double x, double y, double r){
		super(x, y);
		setRadius(r);
	}
	public void setRadius(double r){
		radius = r;
	}
	public double getRadius(){
		return radius;
	}
	public double getArea(){
		return radius * radius * PI;
	}
	public void printAttr(){
		System.out.print("원의 반지름 : " + getRadius() + "\n원의 중심 : ");
		super.printAttr();
		System.out.println("원의 면적 : " + getArea());
	}
}