import java.util.Scanner;
class SingerCon 
{
	public static void main(String[] args) 
	{
		System.out.println("-----------------------------");
		System.out.println("1. ���");
		System.out.println("2. �����");
		System.out.println("-----------------------------");
		System.out.print("�����ϰ� ���� ������ ��ȣ�� �Է��Ͻÿ� : ");
		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		System.out.println("");
		if (num1==1){
			System.out.println("-----------------------------");
			System.out.println("1. ��� R�� ����");
			System.out.println("2. ��� ���ĵ� ����");
			System.out.println("-----------------------------");
			System.out.print("�����ϰ� ���� �¼��� ��ȣ�� �Է��ϼ��� : ");
			int num2=scan.nextInt(); //�ؿ��� �� �Է¹��� ���� Scanner scan=new Scanner(System.in); �� �����ʰ� int num2=scan.nextInt(); �̰͸� �ᵵ �ȴ�.
			System.out.println("");
			if(num2==1){
				System.out.println("��� R�� ���� �Ϸ�!");
			}else if(num2==2){
				System.out.println("��� ���ĵ� ���� �Ϸ�!");
			}
		}else if (num1==2){
			System.out.println("-----------------------------");
			System.out.println("1. ����� R�� ����");
			System.out.println("2. ����� ���ĵ� ����");
			System.out.println("-----------------------------");
			System.out.print("�����ϰ� ���� �¼��� ��ȣ�� �Է��ϼ��� : ");
			int num2=scan.nextInt();
			System.out.println("");
			if(num2==1){
				System.out.println("����� R�� ���� �Ϸ�!");
			}else if(num2==2){
				System.out.println("����� ���ĵ� ���� �Ϸ�!");
			}
		}
	}
}
