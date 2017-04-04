import java.util.Scanner;
class Tax_calculate 
{
	public static void main(String[] args) 
	{
		System.out.print("연간 근로소득을 입력하시오 : ");
		Scanner scan=new Scanner(System.in);
		int salary=scan.nextInt();
		int tax; //밑에서 명시적형변환을 해야 12.E7 이런 숫자 안나오고 깔끔함.
		if(salary<=20000000){
			tax=(int)(salary*5/100); //명시적형변환을 해줌
		}else if(salary<=40000000){ //위의 if에서 조건이 넘어왔으므로 salary>20000000 & 안써도 된다.
			tax=(int)(salary*15/100);
		}else if(salary<=80000000){
			tax=(int)(salary*25/100);
		}else{
			tax=(int)(salary*40/100);
		}
		System.out.println("소득세는 "+tax+"원 입니다.");
	}
}
