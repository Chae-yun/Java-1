import java.util.Scanner;
class Sum_Odd_Even 
{
	public static void main(String[] args) 
	{
		int odd_sum=0,even_sum=0;
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		for (int i=1;i<=a;i++)
		{
			if (i%2==0)
			{
				even_sum+=i;
			}
			else
			{
				odd_sum+=i;
			}
		}
		System.out.println("¦���� ���� "+even_sum+", Ȧ���� ���� "+odd_sum+"�Դϴ�.");
	}
}
