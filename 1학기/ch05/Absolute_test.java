import java.util.Scanner;
class Absolute_test
{
	public static void main(String[] args) 
	{
		System.out.println("������ �Է��ϼ���");
		Scanner scan=new Scanner(System.in);
		int a = scan.nextInt();
		if(a>=0)
		{
			System.out.print("���밪�� "+a);
		}
		else //a<0
		{
			System.out.print("���밪�� "+(a*-1)); //�����϶��� ��ȣ�� �����ֱ�
		}
	}
}
