import java.util.Scanner;
class DowhileMax 
{
	public static void main(String[] args) 
	{
		int max=0, num;
		Scanner scan=new Scanner(System.in);
		do{
			System.out.print("����� �Է��Ͻÿ� (���� => 0) : ");
			num=scan.nextInt();
			if(max<num){
				max=num;
			}
		}while(num!=0 && num>0); 
		System.out.println("�ִ��� "+max+"�Դϴ�.");
	}
}
