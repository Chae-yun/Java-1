import java.util.Scanner;
class SavingAccountDriver
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("ù��° ������ �ܰ� �Է����ּ��� : ");
		int balance1 = scan.nextInt();
		SavingAccount customer1 = new SavingAccount(balance1);

		System.out.print("�ι�° ������ �ܰ� �Է����ּ��� : ");
		int balance2 = scan.nextInt();
		SavingAccount customer2 = new SavingAccount(balance2);

		SavingAccount.updateInterest(0.05); //���������ؼ� �ٲٸ� �ȵ�

		customer1.calMonthInterest();
		customer2.calMonthInterest();
		System.out.println("\n���������� 5%�� ù��° ������ �ܰ�� " + customer1.getBalance() + "�Դϴ�.");
		System.out.println("���������� 5%�� �ι�° ������ �ܰ�� " + customer2.getBalance() + "�Դϴ�.\n");

		SavingAccount.updateInterest(0.06);
	
		customer1.calMonthInterest();
		customer2.calMonthInterest();
		System.out.println("���������� 6%�� ù��° ������ �ܰ�� " + customer1.getBalance() + "�Դϴ�.");
		System.out.println("���������� 6%�� �ι�° ������ �ܰ�� " + customer2.getBalance() + "�Դϴ�.");
	}
}
