/*������ ���⿹���� ���ϴ� SavingAccount��� Ŭ������ �����ϰ� �ۼ��϶�
1. ��� ������ �����ڵ鿡�� �Ȱ��� ����Ǵ� ���� ������(annualInterest)�� �ִ�.
2. �ܰ� �Է¹޾� ���¸� �����Ѵ�. (�������Լ� : SavingAccount)
3. ���� ���ڸ� ����Ͽ� �ܰ� ���ڸ�ŭ �÷��� �� �־�� �Ѵ�. (�޼��� : calMonthInterest)
4. ���� �ܰ� ��ȯ�Ѵ�. (�޼��� : getBalance)
5. ���� ������ �������� ������ �� �־�� �Ѵ�. (�޼��� : updateInterest)*/
class  SavingAccount
{
	private static double annualInterest;
	private double balance;
	public SavingAccount(double b){
		balance = b;
	}
	public void calMonthInterest(){ //month �Ű������� �޾ƿͼ� ����ص� ����
		balance += (balance * annualInterest) / 12.0;
	}
	public double getBalance(){
		return balance;
	}
	public static void updateInterest(double newAnnualIterest){ //��ü�� ������ ������� ��������
		annualInterest = newAnnualIterest;
	}
}
