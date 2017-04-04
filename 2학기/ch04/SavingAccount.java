/*
1. 멤버변수로 이율을 갖는다.
2. 상위 생성자함수를 호출하여 잔고와 이율값을 set하는 생성자함수를 갖는다.
3. 이율을 반환한다. (getInterest)
4. 이율을 주어진 값으로 변환한다. (setInterest)
5. 객체의 현상태를 문자열로 반환한다. (toString)
*/
class SavingAccount extends Account
{
	private static double interest; //클래스가 만들어질때 바로 생성되면 좋겠어!
	
	public SavingAccount(){}
	public SavingAccount(double balance, double inter){
		super(balance);
		setInterest(inter);
	}
	
	private static void setInterest(double inter){ //static변수를 다루는 메서드도 static
		interest = inter; 
		//this.interest = interest => static변수에서 this를 쓰면 에러
	}
	public static double getInterest(){
		return interest;
	}
	public String toString(){
		String str;
		str = "이율은 " + this.getInterest() + ", " + super.toString();
		return str;
	}

	public static void main(String args[])
	{
		SavingAccount acct = new SavingAccount(10000.0, 0.5);
		acct.deposit(30000.0);
		acct.withdraw(20000.0);
		System.out.println(acct);
	}
}
