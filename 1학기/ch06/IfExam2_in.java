import java.util.Scanner;
class IfExam2_in
{
	public static void main(String[] args) 
	{ //å37�� �״�� �ۼ��ϰ� �����ڸ� �ܺο��� �Է¹޾� ����ϴ� ���α׷�
		int a=20,b=10;
		System.out.print("�����ڸ� �Է��Ͻÿ� : ");
		Scanner scan=new Scanner(System.in);
		String ex = scan.next(); /*�����ڴ� char�̶�� ���������� char�� �Է¹��� �� ���ٴ� ���� ���ͳݿ� �ļ� �˾Ҵ�. 
		�׷��� String���� �޾Ҵ�. int������ ��ȯ�ϴ� ���� �ƴϱ� ������ nextInt�� �ƴ� next�� ����.*/ 
		char op = ex.charAt(0);
		//String�� ���������̹Ƿ� �ѱ����� �����ڸ� �ޱ� ���� 0��°����(ù��°)�� �޴� ����ȯ??�� ���ش�. ���ͳݿ��� �˾Ҵ�.
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
			System.out.println("��Ģ�����ڰ� �ƴմϴ�.");
		}
	}
}