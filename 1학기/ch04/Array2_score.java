import java.util.Scanner;
class ArrayExam13
{
	public static void main(String[] args) 
	{
		int sum1=0, sum2=0, max;
		int[][] score = new int[5][3];
		Scanner scan=new Scanner(System.in);
		for (int i = 0; i < 1 ; i++)//��
		{
			for (int j = 0; j < score[i].length; j++)//��
			{
				System.out.println((i+1)+"���� �ϼ���, â�Ǽ�, ���ص� ������ �Է��Ͻÿ� : ");
				score[i][j]=scan.nextInt();
				sum1+=score[i][j];
			}
		}
		for (int i = 1; i < score.length ; i++)//��
		{
			for (int j = 0; j < score[i].length; j++)//��
			{
				System.out.println((i+1)+"���� �ϼ���, â�Ǽ�, ���ص� ������ �Է��Ͻÿ� : ");
				score[i][j]=scan.nextInt();
				sum2+=score[i][j];
			}
			max=sum2;
			if(sum1>max){
				max=sum1;
			}
		}
		System.out.print("�ְ����� ������ ���� "+max+"�Դϴ�.");
	}
}
