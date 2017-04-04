class Student
{
	String name;
	int grade;
	public Student(){}
	public Student(String name){
		this.name = name; //�̰� ����� this.
	}
	public Student(String name, int grade){
		this(name); //�ι�° ������ �Լ� ȣ��
		this.grade = grade;
	}
	public void print(){
		System.out.println("�л��� �̸� : " + this.name + " �г� : " + grade); //��ü �ڽ��� ��Ÿ���� this�� ��������
	}
}

class StudentExam
{
	public static void main(String[] args) 
	{
		Student kim = new Student("������"); //�ι�° ������ �Լ��� ����
		kim.grade = 2;
		kim.print();
		Student jang = new Student("�����", 3); //�ι�°, ����° ������ �Լ� ����
		jang.print();
	}
}
