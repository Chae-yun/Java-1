import java.util.Scanner;
class Array_max
{
	public static void main(String[] args) 
	{
		int max=0, i ,j;
		int[] score=new int[10];
		System.out.print("10명의 점수를 입력하시오 : ");
		Scanner scan=new Scanner(System.in);
		for (i=0 ; i<score.length ; i++)
		{
			score[i]=scan.nextInt();
			if(max<=score[i])
			{
				max=score[i];
			}
		}
		System.out.print("가장 큰 점수는 "+max+"입니다.");
	}
}
