import java.util.Scanner;
class Array_sort
{
	public static void main(String[] args) 
	{
		/*10명의 점수를 입력받아 오름차순으로 점수를 정렬하는 프로그램
		스캐너로 score 배열에 점수저장
		유효한 점수만 입력
		배열 방법은 선택정렬*/
		int temp;
		int[] score=new int[10];
		System.out.print("10명의 점수를 입력하시오 : ");
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
		System.out.print("오름차순으로 정렬 : ");
		for (int result=0 ; result<score.length ; result++)
		{
			System.out.print(score[result]+" ");
		}
	}
}
