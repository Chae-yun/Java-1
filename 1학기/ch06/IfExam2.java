class IfExam2 
{
	public static void main(String[] args) 
	{ //å37�� �״�� �ۼ��ϰ� �����ڸ� �ܺο��� �Է¹޾� ����ϴ� ���α׷�
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
			System.out.print("��Ģ�����ڰ� �ƴմϴ�.");
		}
	}
}
//ȯ�漳���ϱ�