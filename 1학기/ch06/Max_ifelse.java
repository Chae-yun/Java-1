import java.util.Scanner;
class Max_ifelse 
{
	public static void main(String[] args) 
	{
		System.out.print("�� ���� �Է��Ͻÿ� : ");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		/*
		System.out.print("�� ���� �Է��Ͻÿ� : ");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(a<b){
			System.out.println("�ִ밪�� "+b+", �ּҰ��� "+a);
		}
		else{
			System.out.println("�ִ밪�� "+a+", �ּҰ��� "+b);
		}���� ���� ������ ����X*/
		int max=a;
		int min=a;
		if(max<b){
			max=b;
		}
		if(min>b){
			min=b;
		}
		if(max<c){
			max=c;
		}
		if(min>c){
			min=c;
		}
		System.out.println("�ִ밪�� "+max+", �ּҰ��� "+min);
	}
}
/*�� ���϶� �̷��� �ϸ� �ȴٰ� �ϳ�
	if(max<b){
	max=b;
	min=a;
}
else{
	max=a;
	min=b;
}�����ð��� �Ѱ� ������������*/
