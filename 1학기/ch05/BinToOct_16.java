import java.util.Scanner;
class  BinToOct_16
{
	public static void main(String[] args) 
	//�ܺηκ��� 10������ �Է¹޾� 16��Ʈ 16������ ��ȯ�Ͽ� ����ϴ� ���α׷��� �ۼ��϶�.
	{
		System.out.print("10������ �Է��Ͻÿ� : ");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		String result="";
		int a1=10,b=11,c=12,d=13,e=14,f=15;
		for (int i=1;i<=16;i++)
		{
			result=a%16+result;
			a=a/16;
			}
		System.out.println("16������ ��Ÿ����"+result);
	}
}
			/**/