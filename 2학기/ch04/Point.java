/*2���� ������ ���� ��Ÿ���� Point Ŭ������ �����ϰ� �ۼ��϶�
1. ��������� x, y ��ǥ�� ���´�.(x_coordinate, y_coordinate)
2. ������ �Լ��� (0,0)���� �ʱ�ȭ�ϰų�, Ư�� (x, y)�� �ʱ�ȭ�ϴ� 2���� ������ ���´�.
3. X��ǥ�� ��ȯ�ϴ� �޼ҵ�(getX)�� ���´�.
4. Y��ǥ�� ��ȯ�ϴ� �޼ҵ�(getY)�� ���´�.
5. X��ǥ�� �־��� ������ �����ϴ� �޼ҵ�(setX)�� ���´�.
6. Y��ǥ�� �־��� ������ �����ϴ� �޼ҵ�(setY)�� ���´�.
7. ��ǥ���� (x, y)�� ���·� ����ϴ� �޼ҵ�(printAttr)�� ���´�.*/
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
	public static void main(String args[]){ //���� CircleDriver���� �Ŷ� �Ȱ���.
		Circle c = new Circle(2.3, 3.5, 5.);
		c.printAttr();
	}
}

/*2���� ������ ���� ��Ÿ���� CircleŬ������ �����ϰ� �ۼ��϶�. ��, Circle�� Point�� ����Ѵ�.
1. ��������� ���� �������� ���´�.
2. Circle ��ü�� �⺻��(x_coordinate = y_coordinate = radius = 0)���� �ʱ�ȭ �ϴ� �����ڸ޼��带 ���´�.
3. �߽����� Point Ŭ�����κ��� ��ӹ����� Ư���� (x,y)���� radius�� Circle ��ü�� �ʱ�ȭ�ϴ� ������ �޼��带 ���´�.
4. �������� ��ȯ�ϴ� �޼���(getRadius)�� ���´�.
5. ���� ������ ��ȭ�ϴ� �޼���(getArea)�� ���´�.
6. ���� �߽ɰ� ������ ����ϴ� �޼���(printAttr)�� ���´�.*/
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
		System.out.print("���� ������ : " + getRadius() + "\n���� �߽� : ");
		super.printAttr();
		System.out.println("���� ���� : " + getArea());
	}
}