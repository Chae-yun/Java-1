class PointEx
{
	public static void main(String[] args) 
	{
		Point p = new Point(5.7, 6.3);
		System.out.println("�̵� �� " + p);
		p.moveXY(3.0, 5.0);
		System.out.println("���� " + 3.0 + ", " + 5.0 + " �̵� �� " + p); //�ڵ������ߴ�!
	} 
}
