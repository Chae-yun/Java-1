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

class CircleMainTest extends CirclaArea_Exam //main�� ���ִ� Ŭ������ ���� Ŭ���� ��� OK
{
	public static void main(String[] args) 
	{
		CirclaArea_Exam cp = new CirclaArea_Exam();
		System.out.println("���� ������ " + cp.area(10)); //private�ϱ� ����
		System.out.println("���� �ѷ��� " + cp.round(10));
	}
}
