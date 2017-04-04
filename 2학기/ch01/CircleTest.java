class Circle
{
	/*���� �𵨸��϶� (������ 9, �߽���ǥ�� (3, 2), ���̸� ���ϰ� (-10, 9)��ŭ �̵��ϰ� �߽��� ��ǥ�� ����϶�.
	1. ������, �߽��� ��ǥ => �������Լ�(�޼���) Circle(r, x, y)
	2. �������� �̿��� ���� ���̸� ���϶� => �޼��� getArea(), PI = 3.14
	3. ���� �̵����Ѷ� => �޼��� move(dx, dy)
	4. �̵��� ���� �߽���ǥ�� ����Ͽ��� => getXY()*/

	double r, x, y;
	final double PI = 3.14; //���

	Circle(double r, double x, double y){
		this.r = r; //���� r�� ���� Circle�� �ִ� ���� �ٿ��� �����ߴ� r�� ����ִ´�.
		this.x = x;
		this.y = y;
	}
	
	double getArea(){
		return r * r * PI;
	}

	String getXY(){
		return ("���� �߽����� ��ǥ : (" + x + ", " + y + ")");
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
		System.out.println("���� ���̴� " + cir.getArea() + "�Դϴ�.");
		System.out.println("�̵� �� " + cir.getXY());
		cir.move(-10, 9);
		System.out.println("�̵� �� " + cir.getXY());
	}
}
//Circle Ŭ������ CircleTest Ŭ������ ������ �����Ǿ� �ִ�