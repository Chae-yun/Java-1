abstract class Account
{
	protected static int serialAccId = 0; //���¸� ���鶧���� �̰� ������ ����(�������Լ� �Ҹ������� = static)
	protected int accId; //���º� accId
	protected double balance; //���º� balance
	Account(){
		accId = ++serialAccId; //++�� �ڷ� ���� ù��° ����� ���¹�ȣ�� 0��
		setBalance(0);
	}
	protected void setBalance(double balance){
		this.balance = balance;
	}
	public int getAccId(){
		return accId;
	}
	public abstract double getBalance(); //���ݰ��¿� ��������� �ܾװ����� �ٸ��Ƿ� �߻�޼ҵ�
	public abstract String accInfo(); //�� ������ ������� ����
	public abstract String toString(); //���
}

class SavingAccount extends Account
{
	private int period;
	private static double rate = 0.02;
	SavingAccount(double balance, int period){ //�̰� �θ��� �ڵ����� Account()ȣ��
		super();
		super.setBalance(balance);
		this.period = period;
	}
	public double getBalance(){ //�߻�޼ҵ� �������̵�
		return balance + balance * rate * period;
	}
	public String accInfo(){ //�߻�޼ҵ� �������̵�
		String result = "**********���ݰ�������**********";
		result += "\n���¹�ȣ : " + super.getAccId();
		result += "\n�Ⱓ : " + period + "��";
		result += "\n���� : " + rate;
		result += "\n���� : " + balance;
		result += "\n�ܾ� : " + getBalance();
		return result;
	}
	public String toString(){ //�߻�޼ҵ� �������̵�
		return accInfo();
	}
}

class LoanAccount //�����ѵ� : 2000000 ���� : 5%
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
