import java.util.Scanner;
class Multiple_if 
{
	public static void main(String[] args) 
	{
		System.out.print("정수를 입력하세요 : ");
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		if (number%3==0)
		{
			System.out.println("3의 배수입니다.");
		}
		else if (number%5==0)
		{
			System.out.println("5의 배수입니다.");
		}
		else if (number%8==0)
		{
			System.out.println("8의 배수입니다.");
		}
		else
		{
			System.out.println("어느 배수도 아닙니다.");
		}
	}
}

