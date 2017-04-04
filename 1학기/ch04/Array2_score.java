import java.util.Scanner;
class ArrayExam13
{
	public static void main(String[] args) 
	{
		int sum1=0, sum2=0, max;
		int[][] score = new int[5][3];
		Scanner scan=new Scanner(System.in);
		for (int i = 0; i < 1 ; i++)//행
		{
			for (int j = 0; j < score[i].length; j++)//열
			{
				System.out.println((i+1)+"조의 완성도, 창의성, 이해도 점수를 입력하시오 : ");
				score[i][j]=scan.nextInt();
				sum1+=score[i][j];
			}
		}
		for (int i = 1; i < score.length ; i++)//행
		{
			for (int j = 0; j < score[i].length; j++)//열
			{
				System.out.println((i+1)+"조의 완성도, 창의성, 이해도 점수를 입력하시오 : ");
				score[i][j]=scan.nextInt();
				sum2+=score[i][j];
			}
			max=sum2;
			if(sum1>max){
				max=sum1;
			}
		}
		System.out.print("최고팀의 점수의 합은 "+max+"입니다.");
	}
}
