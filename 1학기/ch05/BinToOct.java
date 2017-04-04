import java.util.Scanner;
class  BinToOct
{
	public static void main(String[] args) 
	//외부로부터 10진수를 입력받아 16비트 8진수로 변환하여 출력하는 프로그램을 작성하라.
	{
		System.out.print("10진수를 입력하시오 : ");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		String result="";
		for (int i=1;i<=16;i++)
		{
			result=a%8+result;
			a=a/8;
		}
		System.out.println("8진수로 나타내면"+result);
	}
}
