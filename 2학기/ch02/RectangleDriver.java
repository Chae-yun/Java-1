class RectangleDriver 
{
	public static void main(String[] args) 
	{
		/*가로가 3이고 세로가 5인 사각형을 만들고 그 객체의 면적과 둘레를 계산하라
		계산 후 사각형 객체의 가로, 세로, 둘레, 면적을 출력하라. 단, 모든 메서드를 빠짐없이 사용하라.*/
		Rectangle rec = new Rectangle();
		rec.setWidth(3.0);
		rec.setHeight(5.0);
		/*rec.calculatePerimeter();
		rec.calaulateArea();*/
		System.out.print("가로 : " + rec.getWidth() + "  세로 : " + rec.getHeight()
						 + "  둘레 : " + rec.calculatePerimeter() + "  면적 : " + rec.calaulateArea());
	}
}
