import java.util.Scanner;
class Array_max
{
	public static void main(String[] args) 
	{
		int max=0, i ,j;
		int[] score=new int[10];
		System.out.print("10���� ������ �Է��Ͻÿ� : ");
		Scanner scan=new Scanner(System.in);
		for (i=0 ; i<score.length ; i++)
		{
			score[i]=scan.nextInt();
			if(max<=score[i])
			{
				max=score[i];
			}
		}
		System.out.print("���� ū ������ "+max+"�Դϴ�.");
	}
}
