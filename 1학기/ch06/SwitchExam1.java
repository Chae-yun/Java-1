import java.util.Scanner;
class SwitchExam1 
{
	public static void main(String[] args) 
	{
		int a=20, b=10;
		System.out.println("������ �Է� : ");
		Scanner scan=new Scanner(System.in);
		String op=scan.next();
		switch (op)
		{
			case "+" : System.out.println(a+"+"+b+"="+(a+b));break;
			case "-" : System.out.println(a+"-"+b+"="+(a-b));break;
			case "*" : System.out.println(a+"*"+b+"="+(a*b));break;
			case "/" : System.out.println(a+"/"+b+"="+(a/b));break;
			default : System.out.println("��Ģ�����ڰ� �ƴմϴ�.");
		}
	}
}
