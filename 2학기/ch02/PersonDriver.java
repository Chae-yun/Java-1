import java.util.Scanner;
class PersonDriver
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("����� ���� �Է��Ͻÿ� : ");
		String lastName = scan.next();
		System.out.print("����� �̸��� �Է��Ͻÿ� : ");
		String firstName = scan.next();
		Person per = new Person(lastName, firstName);
		System.out.print("���� " + per.getLastName() + ", �̸��� " + per.getFirstName() + "�̰�, �̸��� ���� ������ " + per.getLength() + "���� �Դϴ�");
	}
}