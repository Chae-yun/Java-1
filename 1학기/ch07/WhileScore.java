import java.util.Scanner;
class WhileScore 
{
	public static void main(String[] args) 
	{
		int sum=0, count=0;
		double avera=1;
		System.out.print("������ �Է��Ͻÿ�(���� => 0) : ");
		Scanner scan=new Scanner(System.in);
		int score=scan.nextInt();
		while(score!=0){
			sum+=score;
			count++;
			System.out.print("������ �Է��Ͻÿ�(���� => 0) : ");
			score=scan.nextInt();
		}
		avera=sum/count;
		System.out.print("������ �� : "+sum+"\n������ ��� : "+avera);
	}
}
