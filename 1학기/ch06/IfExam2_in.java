import java.util.Scanner;
class IfExam2_in
{
	public static void main(String[] args) 
	{ //책37쪽 그대로 작성하고 연산자를 외부에서 입력받아 계산하는 프로그램
		int a=20,b=10;
		System.out.print("연산자를 입력하시오 : ");
		Scanner scan=new Scanner(System.in);
		String ex = scan.next(); /*연산자는 char이라고 생각했지만 char은 입력받을 수 없다는 것을 인터넷에 쳐서 알았다. 
		그래서 String으로 받았다. int형으로 변환하는 것이 아니기 때문에 nextInt가 아닌 next로 쓴다.*/ 
		char op = ex.charAt(0);
		//String은 여러글자이므로 한글자인 연산자를 받기 위해 0번째글자(첫번째)를 받는 형변환??을 해준다. 인터넷에서 알았다.
		if(op=='+'){
			System.out.println(a+"+"+b+"="+(a+b));
		}
		else if(op=='-'){
			System.out.println(a+"-"+b+"="+(a-b));
		}
		else if(op=='*'){
			System.out.println(a+"*"+b+"="+(a*b));
		}
		else if(op=='/'){
			System.out.println(a+"/"+b+"="+(a/b));
		}
		else{
			System.out.println("사칙연산자가 아닙니다.");
		}
	}
}