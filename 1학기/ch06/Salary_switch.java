import java.util.Scanner;
class Salary_switch 
{
	public static void main(String[] args) 
	{
		double raise=0.0,newSalary;
		System.out.print("�� ������ �Է��Ͻÿ� : ");
		Scanner scan=new Scanner(System.in);
		double currentSalary=scan.nextDouble();
		System.out.print("�ٹ� �򰡵���� �Է��ϼ��� : ");
		String rating=scan.next(); //Scanner scan=new Scanner(System.in); �� ���ʿ� ����
		switch(rating){
			case "���":
				raise=currentSalary*6/100;
				System.out.println("���� �λ�� : "+(int)raise+"��"); break;
			case "����": 
				raise=currentSalary*4/100;
				System.out.println("���� �λ�� : "+(int)raise+"��"); break;
			case "�ҷ�": 
				raise=currentSalary*2/100;
				System.out.println("���� �λ�� : "+(int)raise+"��"); break;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		newSalary=currentSalary+raise;
		System.out.println("�� ���� : "+(int)newSalary+"��");
	}
}
