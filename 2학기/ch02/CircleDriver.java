class CircleDriver
{
	public static void main(String args[]){
		Circle cir = new Circle(4.5);
		System.out.println("원의 면적은 " + cir.computeArea() + "이고 원의 둘레는 " + cir.computePerimeter() + "입니다.");
		cir.setRadius(5);
		System.out.println("바뀐 원의 반지름은 " + cir.getRadius() + "입니다.");
	}
}