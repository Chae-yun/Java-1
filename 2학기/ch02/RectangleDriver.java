class RectangleDriver 
{
	public static void main(String[] args) 
	{
		/*���ΰ� 3�̰� ���ΰ� 5�� �簢���� ����� �� ��ü�� ������ �ѷ��� ����϶�
		��� �� �簢�� ��ü�� ����, ����, �ѷ�, ������ ����϶�. ��, ��� �޼��带 �������� ����϶�.*/
		Rectangle rec = new Rectangle();
		rec.setWidth(3.0);
		rec.setHeight(5.0);
		/*rec.calculatePerimeter();
		rec.calaulateArea();*/
		System.out.print("���� : " + rec.getWidth() + "  ���� : " + rec.getHeight()
						 + "  �ѷ� : " + rec.calculatePerimeter() + "  ���� : " + rec.calaulateArea());
	}
}
