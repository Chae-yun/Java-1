import java.util.Scanner;
class Array_sort
{
	public static void main(String[] args) 
	{
		/*10���� ������ �Է¹޾� ������������ ������ �����ϴ� ���α׷�
		��ĳ�ʷ� score �迭�� ��������
		��ȿ�� ������ �Է�
		�迭 ����� ��������*/
		int temp;
		int[] score=new int[10];
		System.out.print("10���� ������ �Է��Ͻÿ� : ");
		Scanner scan=new Scanner(System.in);
		for (int i=0 ; i<score.length ; i++)
		{
			score[i]=scan.nextInt();
		}
		for (int j=0 ; j<score.length-1 ; j++)
		{
			for (int k=j+1 ; k<score.length ; k++)
			{
				if(score[j]>score[k]){
					temp=score[j];
					score[j]=score[k];
					score[k]=temp;
				}
			}
		}
		System.out.print("������������ ���� : ");
		for (int result=0 ; result<score.length ; result++)
		{
			System.out.print(score[result]+" ");
		}
	}
}
