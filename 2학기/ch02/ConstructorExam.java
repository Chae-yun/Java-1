class Student
{
	String name; //�������~
	int grade;
	int clas;
	int number;
	String telephone;//~�������
	public Student(){}; //�Ű����� ����.
	public Student(String n){ //�Ű�����1, ���ڿ�
		name = n;
	};
	public Student(String n, int num){ //�Ű�����2, ���ڿ�, ������ =>������ �����ε�!!!!!!!!!!!������
		name = n;
		number = num;
	};
}

class ConstructorExam 
{
	public static void main(String[] args) 
	{
		Student kim = new Student();
		Student jang = new Student("�����"); //���� �ι�° Student�� ������ ���� �Ű������� ���� �����Ƿ� �� ����(�������Լ� �����ε�!!)
		Student bak = new Student("���̸�", 1121); //���� ����° Student�� ������ ���� �Ű������� ���� �����Ƿ� �� ����(�������Լ� �����ε�!!)   ���� �ڱ����� �´� �� ã�ư�
		System.out.println("�л��� �̸��� " + kim.name + "�Դϴ�"); //�ƹ� ���� ���� �ʾƼ� null
		System.out.println("�л��� �̸��� " + jang.name + "�Դϴ�");
		System.out.println("�л��� �̸��� " + bak.name + ", �й��� " + bak.number + "�Դϴ�");
	}
}
