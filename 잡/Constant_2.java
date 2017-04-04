import java.util.Scanner;
class Constant_2 
{
	public static void main(String args[]) 
	{
		double dulle,area;
		final double PIE=3.141592;
		Scanner scan=new Scanner(System.in);
		int radius = scan.nextInt();
		dulle=radius*2*PIE;
		area=radius*radius*PIE;
		System.out.println("원의 둘레는 "+dulle+"입니다.");
		System.out.println("원의 넓이는 "+area+"입니다.");
	}
}
