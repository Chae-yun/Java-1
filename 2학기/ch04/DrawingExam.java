class Shape
{
	public void draw(){
		System.out.println("도형 그리기");
	}
	public void painting(){}
}

class Circle extends Shape
{
	private String type = "원";
	public void draw(){
		System.out.println(type + " 그리기");
	}
	public void painting(){
		System.out.println("색 칠하기");
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
		Shape s = c; //업캐스팅
		s.draw();
		s.painting();
	}
}
