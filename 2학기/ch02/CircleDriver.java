class CircleDriver
{
	public static void main(String args[]){
		Circle cir = new Circle(4.5);
		System.out.println("���� ������ " + cir.computeArea() + "�̰� ���� �ѷ��� " + cir.computePerimeter() + "�Դϴ�.");
		cir.setRadius(5);
		System.out.println("�ٲ� ���� �������� " + cir.getRadius() + "�Դϴ�.");
	}
}