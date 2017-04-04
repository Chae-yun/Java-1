import java.util.Scanner;
class DowhileMax 
{
	public static void main(String[] args) 
	{
		int max=0, num;
		Scanner scan=new Scanner(System.in);
		do{
			System.out.print("양수를 입력하시오 (종료 => 0) : ");
			num=scan.nextInt();
			if(max<num){
				max=num;
			}
		}while(num!=0 && num>0); 
		System.out.println("최댓값은 "+max+"입니다.");
	}
}
