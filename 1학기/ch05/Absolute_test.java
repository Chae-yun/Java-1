import java.util.Scanner;
class Absolute_test
{
	public static void main(String[] args) 
	{
		System.out.println("정수를 입력하세요");
		Scanner scan=new Scanner(System.in);
		int a = scan.nextInt();
		if(a>=0)
		{
			System.out.print("절대값은 "+a);
		}
		else //a<0
		{
			System.out.print("절대값은 "+(a*-1)); //수식일때는 괄호로 묶어주기
		}
	}
}
