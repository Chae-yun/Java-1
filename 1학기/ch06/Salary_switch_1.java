import java.util.Scanner;
class Salary_switch_1 
{
	public static void main(String[] args) 
	{
		double raise=0.0,newSalary;
		System.out.print("�� ������ �Է��Ͻÿ� : ");
		Scanner scan=new Scanner(System.in);
		double currentSalary=scan.nextDouble();
		System.out.print("�ٹ� �򰡵���� �Է��ϼ��� : ");
		String rating=scan.next(); //Scanner scan=new Scanner(System.in); �� ���ʿ� ����
		System.out.println("�����λ�� : "+setRating(rating));
		newSalary=currentSalary+raise;
		System.out.println("�� ���� : "+(int)newSalary+"��");
	}
	public static String setRating(String rating,double currentSalary){
		double raise=0.0;
		switch(rating){
			case "���": raise=currentSalary*6/100;
			case "����": raise=currentSalary*4/100;
			case "�ҷ�": raise=currentSalary*2/100;
		}
		return raise;
	}
}
