class TriangleTest 
{
	public static void main(String[] args) 
	{
		//4, 6 �� �ﰢ���� ���̸� ���Ͻÿ�
		double a = 4, b = 6;
		Triangle tri = new Triangle(a, b);
		System.out.println("�غ��� " + a + "�̰� ���ΰ� " + b + "�� �ﰢ���� ���̴� " + tri.getArea() + "�̴�.");
	}
}
