import java.util.Scanner;
class SingerCon 
{
	public static void main(String[] args) 
	{
		System.out.println("-----------------------------");
		System.out.println("1. 빅뱅");
		System.out.println("2. 블락비");
		System.out.println("-----------------------------");
		System.out.print("예매하고 싶은 가수의 번호를 입력하시오 : ");
		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		System.out.println("");
		if (num1==1){
			System.out.println("-----------------------------");
			System.out.println("1. 빅뱅 R석 예매");
			System.out.println("2. 빅뱅 스탠딩 예매");
			System.out.println("-----------------------------");
			System.out.print("예매하고 싶은 좌석의 번호를 입력하세요 : ");
			int num2=scan.nextInt(); //밑에서 또 입력받을 때는 Scanner scan=new Scanner(System.in); 을 쓰지않고 int num2=scan.nextInt(); 이것만 써도 된다.
			System.out.println("");
			if(num2==1){
				System.out.println("빅뱅 R석 예매 완료!");
			}else if(num2==2){
				System.out.println("빅뱅 스탠딩 예매 완료!");
			}
		}else if (num1==2){
			System.out.println("-----------------------------");
			System.out.println("1. 블락비 R석 예매");
			System.out.println("2. 블락비 스탠딩 예매");
			System.out.println("-----------------------------");
			System.out.print("예매하고 싶은 좌석의 번호를 입력하세요 : ");
			int num2=scan.nextInt();
			System.out.println("");
			if(num2==1){
				System.out.println("블락비 R석 예매 완료!");
			}else if(num2==2){
				System.out.println("블락비 스탠딩 예매 완료!");
			}
		}
	}
}
