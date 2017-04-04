/*
1. ��������� ������ ���´�.
2. ���� �������Լ��� ȣ���Ͽ� �ܰ�� �������� set�ϴ� �������Լ��� ���´�.
3. ������ ��ȯ�Ѵ�. (getInterest)
4. ������ �־��� ������ ��ȯ�Ѵ�. (setInterest)
5. ��ü�� �����¸� ���ڿ��� ��ȯ�Ѵ�. (toString)
*/
class SavingAccount extends Account
{
	private static double interest; //Ŭ������ ��������� �ٷ� �����Ǹ� ���ھ�!
	
	public SavingAccount(){}
	public SavingAccount(double balance, double inter){
		super(balance);
		setInterest(inter);
	}
	
	private static void setInterest(double inter){ //static������ �ٷ�� �޼��嵵 static
		interest = inter; 
		//this.interest = interest => static�������� this�� ���� ����
	}
	public static double getInterest(){
		return interest;
	}
	public String toString(){
		String str;
		str = "������ " + this.getInterest() + ", " + super.toString();
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
