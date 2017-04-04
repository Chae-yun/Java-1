class CirclaArea_Exam
{
	/*private double area(int r){
		return 3.14 * r * r;
	}*/
	protected double area(int r){
		return 3.14 * r * r;
	}
	protected double round(int r){
		return 2 * 3.14 * r;
	}
}

class CircleMainTest extends CirclaArea_Exam //main이 들어가있는 클래스가 없는 클래스 상속 OK
{
	public static void main(String[] args) 
	{
		CirclaArea_Exam cp = new CirclaArea_Exam();
		System.out.println("원의 면적은 " + cp.area(10)); //private니까 에러
		System.out.println("원의 둘레은 " + cp.round(10));
	}
}
