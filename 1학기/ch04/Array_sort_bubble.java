import java.util.Scanner;
class Array_sort_bubble 
{
	public static void main(String[] args) 
	{
		//�������ķ� �����ϰ� ���ĺκ��� �޼���� ����
		//ppt 3�� �̳��� �����, ���α׷� ����
		int sc;
		int[] score=new int[11];
		Scanner scan=new Scanner(System.in);
		System.out.print("������������ �����ϰ� ���� 10���� ������ �Է��Ͻÿ� : ");
		for (sc=0 ; sc<score.length ; sc++)
		{
			score[sc]=scan.nextInt();
		}
		Bubble(score);
	}
	public static void Bubble(int score[]){
		int a, i, j, temp, result;
		for (a=score.length ; a>=1 ; a--)
		{
			for (i=0 ; i<score.length ; i++)
			{
				if(score[i]>score[i+1]){
						temp=score[i];
						score[i]=score[i+1];
						score[i+1]=temp;
				}
			}
		}
		for (result=0 ; result<score.length ; result++)
		{
			System.out.print(score[result]+" ");
		}
	}
}