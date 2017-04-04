import java.util.Scanner;
class SavingAccountDriver
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("첫번째 계좌의 잔고를 입력해주세요 : ");
		int balance1 = scan.nextInt();
		SavingAccount customer1 = new SavingAccount(balance1);

		System.out.print("두번째 계좌의 잔고를 입력해주세요 : ");
		int balance2 = scan.nextInt();
		SavingAccount customer2 = new SavingAccount(balance2);

		SavingAccount.updateInterest(0.05); //직접접근해서 바꾸면 안됨

		customer1.calMonthInterest();
		customer2.calMonthInterest();
		System.out.println("\n연간이율이 5%인 첫번째 계좌의 잔고는 " + customer1.getBalance() + "입니다.");
		System.out.println("연간이율이 5%인 두번째 계좌의 잔고는 " + customer2.getBalance() + "입니다.\n");

		SavingAccount.updateInterest(0.06);
	
		customer1.calMonthInterest();
		customer2.calMonthInterest();
		System.out.println("연간이율이 6%인 첫번째 계좌의 잔고는 " + customer1.getBalance() + "입니다.");
		System.out.println("연간이율이 6%인 두번째 계좌의 잔고는 " + customer2.getBalance() + "입니다.");
	}
}
