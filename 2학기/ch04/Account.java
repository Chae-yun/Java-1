/*
1. 멤버변수로 잔고를 갖는다. (balance)
2. 생성자 함수는 은행 잔고로 만들어진다.
3. 잔고를 반환한다. (getBalance)
4. 주어진 금액을 입금한다. (deposit)
5. 주어진 금액을 출금한다. (withdraw)
6. 객체의 현 상태를 문자열로 반환한다. (toStirng)
*/
class  Account
{
	private double balance; //잔고는 마음대로 변경하면 안되므로

	public Account(){}
	public Account(double b){
		setBalance(b);
	}
	
	private void setBalance(double b){
		balance = b;
	}
	public double getBalance(){
		return balance;
	}
	public void deposit(double in){
		balance += in;
	}
	public void withdraw(double out){
		if(balance < out){
			System.out.println("잔액이 부족합니다. 출금할 수 없습니다.");
		}
		else{
			balance -= out;
		}
	}
	public String toString(){
		String str;
		str = "잔액은 " + getBalance() + "원 입니다.";
		return str;
	}

	public static void main(String args[])
	{
		Account acct = new Account(10000.0);
		acct.deposit(30000.0);
		acct.withdraw(20000.0);
		System.out.println(acct);
	}
}