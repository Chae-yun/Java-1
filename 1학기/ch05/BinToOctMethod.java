import java.util.Scanner;
class  BinToOctMethod
{
	public static void main(String[] args)
	//�� ������ ��ȯ�ϴ� �κ��� �޼���� �����Ͽ� �ۻ��϶�.
	//������ 16������ �غ���.
	/*{
		System.out.print("10������ �Է��Ͻÿ� : ");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		System.out.println("8������ ��Ÿ����"+ten(a));
	}
	static String ten(int a){
		String result="";
		for (int i=1;i<=16;i++)
		{
			result=a%8+result;
			a=a/8;
		}
		return result;
	}��ȯ������ String���� �־��� ��*/
	{
		System.out.print("10������ �Է��Ͻÿ� : ");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		ten(a);
	}
	static void ten(int a){
		String result="";
		for (int i=1;i<=16;i++)
		{
			result=a%8+result;
			a=a/8;
		}
		System.out.println("8������ ��Ÿ����"+result);
	}//��ȯ������ void�� �־��� ��
}