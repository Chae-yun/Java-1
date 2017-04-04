import java.util.Scanner;
class Salary_switch 
{
	public static void main(String[] args) 
	{
		double raise=0.0,newSalary;
		System.out.print("현 연봉을 입력하시오 : ");
		Scanner scan=new Scanner(System.in);
		double currentSalary=scan.nextDouble();
		System.out.print("근무 평가등급을 입력하세요 : ");
		String rating=scan.next(); //Scanner scan=new Scanner(System.in); 또 쓸필요 ㄴㄴ
		switch(rating){
			case "우수":
				raise=currentSalary*6/100;
				System.out.println("연봉 인상액 : "+(int)raise+"원"); break;
			case "보통": 
				raise=currentSalary*4/100;
				System.out.println("연봉 인상액 : "+(int)raise+"원"); break;
			case "불량": 
				raise=currentSalary*2/100;
				System.out.println("연봉 인상액 : "+(int)raise+"원"); break;
			default:
				System.out.println("잘못입력하셨습니다.");
		}
		newSalary=currentSalary+raise;
		System.out.println("새 연봉 : "+(int)newSalary+"원");
	}
}
