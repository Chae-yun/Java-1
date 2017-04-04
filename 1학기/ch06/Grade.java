import java.util.Scanner;
class Grade 
{
	public static void main(String[] args) 
	{
		System.out.print("점수를 입력하시오 : ");
		Scanner scan=new Scanner(System.in);
		int score=scan.nextInt();
		if(score>=90){
			System.out.print("A");
		}
		else if(score>=80){ //a<90 &&안써도 된다. 이미 위를 거쳐서 나왔기 때문에 a<90 뜻을 포함하고 있다.
			System.out.print("B");
		}
		else if(score>=70){
			System.out.print("C");
		}
		else if(score>=60){
			System.out.print("D");
		}
		else{
			System.out.print("E");
		}
	}
}
