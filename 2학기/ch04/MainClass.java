class Student
{
	String name;
	String hakbun;
	String phone;
	String juso;
	String major;
	public Student(){ }
	public Student(String name, String hakbun){
		this.name = name;
		this.hakbun = hakbun;
	}
	public void study(){ System.out.println("�����ϴ�."); }
	public void eat(){ System.out.println("�Ļ��ϴ�."); }
	public void test(){ System.out.println("���躸��."); }
	public void extra_act(){ System.out.println("���Ƹ� Ȱ���ϴ�."); }
}

class Leader extends Student
{
	//�б�ȸ������ �����ϴ� ������� ����
	//��ü ������ �б�ȸ�� �Ű������� �����ϴ� ������ �ۼ�
	//�б�ȸ�� ���� �޼��� ����
	boolean TF;
	public Leader(String name, String hakbun, boolean TF){
		/*this.name = name;
		this.hakbun = hakbun; ���뼺 ���� => this()�� ���� �;����� ���� Ŭ������ �ƴϱ⶧���� ���Ұ�*/
		super(name, hakbun); //�θ��� ������ �Լ��� ȣ���� 9-12�� �� ����
		this.TF = TF;
	}
	public void isLeader(){ //�ٸ� Ŭ�������� �θ��Ƿ� public
		if(this.TF){ //��ü�� true��� �� (this.TF)     �ٵ� this���� ������?
			System.out.println(name + "�� �б�ȸ���̴�.");
		}
		else{
			System.out.println(name + "�� �б�ȸ���� �ƴϴ�.");
		}
	}
}

class MainClass 
{
	public static void main(String[] args) 
	{
		Leader hong = new Leader("ȫ�浿", "30130", true);
		hong.isLeader();
	}
}
