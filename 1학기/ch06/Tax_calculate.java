import java.util.Scanner;
class Tax_calculate 
{
	public static void main(String[] args) 
	{
		System.out.print("���� �ٷμҵ��� �Է��Ͻÿ� : ");
		Scanner scan=new Scanner(System.in);
		int salary=scan.nextInt();
		int tax; //�ؿ��� ���������ȯ�� �ؾ� 12.E7 �̷� ���� �ȳ����� �����.
		if(salary<=20000000){
			tax=(int)(salary*5/100); //���������ȯ�� ����
		}else if(salary<=40000000){ //���� if���� ������ �Ѿ�����Ƿ� salary>20000000 & �Ƚᵵ �ȴ�.
			tax=(int)(salary*15/100);
		}else if(salary<=80000000){
			tax=(int)(salary*25/100);
		}else{
			tax=(int)(salary*40/100);
		}
		System.out.println("�ҵ漼�� "+tax+"�� �Դϴ�.");
	}
}
