import java.util.Scanner;
class Array_sort_bubble 
{
	public static void main(String[] args) 
	{
		//버블정렬로 변경하고 정렬부분은 메서드로 정의
		//ppt 3장 이내로 만들기, 프로그램 구현
		int sc;
		int[] score=new int[11];
		Scanner scan=new Scanner(System.in);
		System.out.print("오름차순으로 변경하고 싶은 10명의 점수를 입력하시오 : ");
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