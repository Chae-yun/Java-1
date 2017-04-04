import java.util.Scanner;
class Account
{
	int number;
	private int balance;
	static final double Interestrate = 0.02; //매번 찾아서 변경할 것이 아니므로 하나 바꾸면 전체가 바뀌는 멤버변수로 정의
	Account(int n, int b){
		number = n;
		balance = b;
	}
	int deposit(int in){
		balance += in;
		System.out.println(in + "원을 입금하겠습니다.");
		return balance;
	}
	int withdraw(int out){
		System.out.println(out + "원을 출금하겠습니다.");
		if(balance < out){
			System.out.println("잔액이 부족합니다. 출금할 수 없습니다.");
			return balance;
		}
		else{
			balance -= out;
			return balance;
		}
	}
	int fixedDeposit(double inmoney, int year){
		inmoney = inmoney + inmoney * year * Interestrate;
		System.out.println(year + "년이 지나면 " + inmoney + "원이 됩니다.");
		return balance;
	}
	public String toString(){
		System.out.println("---------------------------");
		return (number + "번 고객님의 잔액은 " + balance + "원 입니다.");
	}
}

class AccountTest
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.print("작업선택 1.입금 2.출금 3.예금 4.계좌생성 (종료 -> 0) : ");
			int answer = scan.nextInt();
			if(answer == 1 || answer == 2 || answer == 3){
				System.out.println("계좌가 생성되어 있지 않습니다. 계좌를 생성해주세요.");
			}
			else if(answer == 4){
				System.out.print("계좌번호와 넣으실 금액을 입력해주세요 : ");
				int number = scan.nextInt();
				int balance = scan.nextInt();
				Account a = new Account(number, balance);
				System.out.println("새로운 통장을 개설하였습니다.");
				System.out.println(a);
				while(true){
					System.out.print("작업선택 1.입금 2.출금 3.예금(종료 -> 0) : ");
					answer = scan.nextInt();
					if(answer == 1){
						System.out.print("입금하실 금액을 입력해주세요 : ");
						int in = scan.nextInt();
						a.deposit(in);
						System.out.println(a);
					}
					else if(answer == 2){
						System.out.print("출금하실 금액을 입력해주세요 : ");
						int out = scan.nextInt();
						a.withdraw(out);
						System.out.println(a);
					}
					else if(answer == 3){
						System.out.print("예금하실 금액과 기간을 입력해주세요 : ");
						int inmoney = scan.nextInt();
						int year = scan.nextInt();
						a.fixedDeposit(inmoney, year);
						System.out.println(a);
					}
					else if(answer == 0){
						break;
					}
				}
			}
			if(answer == 0){
				System.out.println("종료합니다.");
				break;
			}
		}
	}
}