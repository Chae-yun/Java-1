import java.util.Scanner; //��ĳ�� Ŭ������ Ȱ���Ұž�  >�ڹ�vm
class Constant_1
{
	public static void main(String args[])
	{
		/*���������� �Է� �޾� �������� (85��)�̻��̸�
		'���', �������� �̸��̸� 'Ż��'�� ����ϴ� ���α׷��� �ۼ��϶�.
		��, ��������, ���, Ż���� ����� �����Ѵ�.*/
		final int P_S=85;
		final String PASS = "���";
		final String FAILURE = "Ż��";

		System.out.print("������ �Է��ϼ��� : ");
		Scanner scan=new Scanner(System.in); //Ű���� �Է��� ���� ��ü ����. ���ڷ� �ۿ� �ȵ�
		int score = scan.nextInt(); //���� -> ���ڷ� �ٲ㼭 ������ �Է�
		if(score >=P_S){
			System.out.print(PASS);
		}else{//score < P_S
			System.out.print(FAILURE);
		}
	}
}