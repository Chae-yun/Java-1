import java.util.Scanner;
class Multiple_if 
{
	public static void main(String[] args) 
	{
		System.out.print("������ �Է��ϼ��� : ");
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		if (number%3==0)
		{
			System.out.println("3�� ����Դϴ�.");
		}
		else if (number%5==0)
		{
			System.out.println("5�� ����Դϴ�.");
		}
		else if (number%8==0)
		{
			System.out.println("8�� ����Դϴ�.");
		}
		else
		{
			System.out.println("��� ����� �ƴմϴ�.");
		}
	}
}

