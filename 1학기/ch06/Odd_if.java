import java.util.Scanner;
class Odd_if
{
	public static void main(String args[])
	{
		//키보드로부터 숫자를 입력 받아 홀수인지 여부를 가리는 프로그램을 작성
		System.out.print("숫자를 입력하시오 : ");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		if(a%2==1){
			System.out.println("홀수입니다.");
		}
	}
}