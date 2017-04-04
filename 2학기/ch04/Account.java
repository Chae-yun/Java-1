/*
1. ��������� �ܰ� ���´�. (balance)
2. ������ �Լ��� ���� �ܰ�� ���������.
3. �ܰ� ��ȯ�Ѵ�. (getBalance)
4. �־��� �ݾ��� �Ա��Ѵ�. (deposit)
5. �־��� �ݾ��� ����Ѵ�. (withdraw)
6. ��ü�� �� ���¸� ���ڿ��� ��ȯ�Ѵ�. (toStirng)
*/
class  Account
{
	private double balance; //�ܰ�� ������� �����ϸ� �ȵǹǷ�

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
			System.out.println("�ܾ��� �����մϴ�. ����� �� �����ϴ�.");
		}
		else{
			balance -= out;
		}
	}
	public String toString(){
		String str;
		str = "�ܾ��� " + getBalance() + "�� �Դϴ�.";
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