import java.util.Scanner;
class  BinToOct_16
{
	public static void main(String[] args) 
	//외부로부터 10진수를 입력받아 16비트 16진수로 변환하여 출력하는 프로그램을 작성하라.
	{
		System.out.print("10진수를 입력하시오 : ");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		String result="";
		int a1=10,b=11,c=12,d=13,e=14,f=15;
		for (int i=1;i<=16;i++)
		{
			result=a%16+result;
			a=a/16;
			}
		System.out.println("16진수로 나타내면"+result);
	}
}
			/**/