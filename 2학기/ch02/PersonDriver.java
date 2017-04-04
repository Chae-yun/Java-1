import java.util.Scanner;
class PersonDriver
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("당신의 성을 입력하시오 : ");
		String lastName = scan.next();
		System.out.print("당신의 이름을 입력하시오 : ");
		String firstName = scan.next();
		Person per = new Person(lastName, firstName);
		System.out.print("성은 " + per.getLastName() + ", 이름은 " + per.getFirstName() + "이고, 이름의 글자 개수는 " + per.getLength() + "글자 입니다");
	}
}