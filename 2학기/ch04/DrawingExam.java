class Shape
{
	public void draw(){
		System.out.println("���� �׸���");
	}
	public void painting(){}
}

class Circle extends Shape
{
	private String type = "��";
	public void draw(){
		System.out.println(type + " �׸���");
	}
	public void painting(){
		System.out.println("�� ĥ�ϱ�");
	}
}

class DrawingExam 
{
	public static void main(String[] args) 
	{
		/*Circle c = new Circle();
		c.draw();
		c.painting();*/
		Circle c = new Circle();
		Shape s = c; //��ĳ����
		s.draw();
		s.painting();
	}
}
