import java.util.Scanner;
class  BinToOctMethod
{
	public static void main(String[] args)
	//위 예제의 변환하는 부분을 메서드로 설계하여 작상하라.
	//끝나고 16진수도 해보자.
	/*{
		System.out.print("10진수를 입력하시오 : ");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		System.out.println("8진수로 나타내면"+ten(a));
	}
	static String ten(int a){
		String result="";
		for (int i=1;i<=16;i++)
		{
			result=a%8+result;
			a=a/8;
		}
		return result;
	}반환유형을 String으로 주었을 때*/
	{
		System.out.print("10진수를 입력하시오 : ");
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
		System.out.println("8진수로 나타내면"+result);
	}//반환유형을 void로 주었을 때
}