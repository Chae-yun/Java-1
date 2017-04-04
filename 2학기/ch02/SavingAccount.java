/*은행의 정기예금은 모델하는 SavingAccount라는 클래스를 설계하고 작성하라
1. 모든 계좌의 소유자들에게 똑같이 적용되는 연간 이자율(annualInterest)이 있다.
2. 잔고를 입력받아 계좌를 생성한다. (생성자함수 : SavingAccount)
3. 월별 이자를 계산하여 잔고를 이자만큼 늘려줄 수 있어야 한다. (메서드 : calMonthInterest)
4. 현재 잔고를 반환한다. (메서드 : getBalance)
5. 연간 이율을 언제든지 변경할 수 있어야 한다. (메서드 : updateInterest)*/
class  SavingAccount
{
	private static double annualInterest;
	private double balance;
	public SavingAccount(double b){
		balance = b;
	}
	public void calMonthInterest(){ //month 매개변수로 받아와서 계산해도 좋다
		balance += (balance * annualInterest) / 12.0;
	}
	public double getBalance(){
		return balance;
	}
	public static void updateInterest(double newAnnualIterest){ //객체의 유무에 상관없이 언제든지
		annualInterest = newAnnualIterest;
	}
}
