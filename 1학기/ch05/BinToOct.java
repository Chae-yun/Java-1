import java.util.Scanner;
class  BinToOct
{
	public static void main(String[] args) 
	//�ܺηκ��� 10������ �Է¹޾� 16��Ʈ 8������ ��ȯ�Ͽ� ����ϴ� ���α׷��� �ۼ��϶�.
	{
		System.out.print("10������ �Է��Ͻÿ� : ");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		String result="";
		for (int i=1;i<=16;i++)
		{
			result=a%8+result;
			a=a/8;
		}
		System.out.println("8������ ��Ÿ����"+result);
	}
}
