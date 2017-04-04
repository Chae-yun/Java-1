class IfExam2 
{
	public static void main(String[] args) 
	{ //책37쪽 그대로 작성하고 연산자를 외부에서 입력받아 계산하는 프로그램
		int a=20,b=10;
		char op='*';
		if(op=='+'){
			System.out.print(a+"+"+b+"="+(a+b));
		}
		else if(op=='-'){
			System.out.print(a+"-"+b+"="+(a-b));
		}
		else if(op=='*'){
			System.out.print(a+"*"+b+"="+(a*b));
		}
		else if(op=='/'){
			System.out.print(a+"/"+b+"="+(a/b));
		}
		else{
			System.out.print("사칙연산자가 아닙니다.");
		}
	}
}
//환경설정하기