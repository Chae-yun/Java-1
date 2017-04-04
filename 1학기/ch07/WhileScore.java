import java.util.Scanner;
class WhileScore 
{
	public static void main(String[] args) 
	{
		int sum=0, count=0;
		double avera=1;
		System.out.print("점수를 입력하시오(종료 => 0) : ");
		Scanner scan=new Scanner(System.in);
		int score=scan.nextInt();
		while(score!=0){
			sum+=score;
			count++;
			System.out.print("점수를 입력하시오(종료 => 0) : ");
			score=scan.nextInt();
		}
		avera=sum/count;
		System.out.print("점수의 합 : "+sum+"\n점수의 평균 : "+avera);
	}
}
