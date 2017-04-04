class TriangleTest 
{
	public static void main(String[] args) 
	{
		//4, 6 인 삼각형의 넓이를 구하시오
		double a = 4, b = 6;
		Triangle tri = new Triangle(a, b);
		System.out.println("밑변이 " + a + "이고 가로가 " + b + "인 삼각형의 넓이는 " + tri.getArea() + "이다.");
	}
}
