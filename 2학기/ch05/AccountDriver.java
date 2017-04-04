abstract class Account
{
	protected static int serialAccId = 0; //계좌를 만들때마다 이게 증가될 것임(생성자함수 불릴때마다 = static)
	protected int accId; //계좌별 accId
	protected double balance; //계좌별 balance
	Account(){
		accId = ++serialAccId; //++가 뒤로 가면 첫번째 사람의 계좌번호는 0됨
		setBalance(0);
	}
	protected void setBalance(double balance){
		this.balance = balance;
	}
	public int getAccId(){
		return accId;
	}
	public abstract double getBalance(); //예금계좌와 대출계좌의 잔액계산법이 다르므로 추상메소드
	public abstract String accInfo(); //각 계좌의 출력형태 지정
	public abstract String toString(); //출력
}

class SavingAccount extends Account
{
	private int period;
	private static double rate = 0.02;
	SavingAccount(double balance, int period){ //이거 부르면 자동으로 Account()호출
		super();
		super.setBalance(balance);
		this.period = period;
	}
	public double getBalance(){ //추상메소드 오버라이딩
		return balance + balance * rate * period;
	}
	public String accInfo(){ //추상메소드 오버라이딩
		String result = "**********예금계좌정보**********";
		result += "\n계좌번호 : " + super.getAccId();
		result += "\n기간 : " + period + "년";
		result += "\n이율 : " + rate;
		result += "\n원금 : " + balance;
		result += "\n잔액 : " + getBalance();
		return result;
	}
	public String toString(){ //추상메소드 오버라이딩
		return accInfo();
	}
}

class LoanAccount //대출한도 : 2000000 이율 : 5%
{
	private int period;
	private static double rate = 0.05;
}

class AccountDriver
{
	public static void main(String args[]){
		SavingAccount acc1 = new SavingAccount(2000000, 2);
		System.out.println(acc1);
	}
}
