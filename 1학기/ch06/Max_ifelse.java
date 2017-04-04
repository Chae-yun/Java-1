import java.util.Scanner;
class Max_ifelse 
{
	public static void main(String[] args) 
	{
		System.out.print("세 수를 입력하시오 : ");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		/*
		System.out.print("두 수를 입력하시오 : ");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(a<b){
			System.out.println("최대값은 "+b+", 최소값은 "+a);
		}
		else{
			System.out.println("최대값은 "+a+", 최소값은 "+b);
		}숫자 많이 들어오면 감당X*/
		int max=a;
		int min=a;
		if(max<b){
			max=b;
		}
		if(min>b){
			min=b;
		}
		if(max<c){
			max=c;
		}
		if(min>c){
			min=c;
		}
		System.out.println("최대값은 "+max+", 최소값은 "+min);
	}
}
/*두 수일때 이렇게 하면 된다고 하네
	if(max<b){
	max=b;
	min=a;
}
else{
	max=a;
	min=b;
}수업시간에 한거 완전별별별별*/
