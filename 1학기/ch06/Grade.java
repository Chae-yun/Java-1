import java.util.Scanner;
class Grade 
{
	public static void main(String[] args) 
	{
		System.out.print("������ �Է��Ͻÿ� : ");
		Scanner scan=new Scanner(System.in);
		int score=scan.nextInt();
		if(score>=90){
			System.out.print("A");
		}
		else if(score>=80){ //a<90 &&�Ƚᵵ �ȴ�. �̹� ���� ���ļ� ���Ա� ������ a<90 ���� �����ϰ� �ִ�.
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
