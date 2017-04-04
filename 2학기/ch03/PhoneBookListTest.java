/*  
PhonebookŬ������ Person��ü�� �����ϴ� �迭 book�� ������, �ּҷ��� �߰��ϴ� add�ż���� �ּҷ��� ã�� lookup�޼��带 ���´�
add�ż��忡�� book.length�� üũ�Ͽ� �ּҷ��� ��ħ���θ� �Ǵ��Ͽ� �߰��Ѵ�.
lookup�޼���� �Է¹��� �̸��� �������� �˻��ϵ� �̸��� ���� ��� null�� �����Ѵ�*/

//��ȭ��ȣ�ο� �� ����� �����ϴ� PersonŬ����(�̸�, ��ȭ��ȣ�� person��ü ����)�� �����ϰ�
import java.util.ArrayList;
class Person
{
	private String name;
	private String tel;		// - �� �ٱ� ������
		
	public Person(String name, String tel) {
		setName(name);
		setTel(tel);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTel(String tel) {
		this.tel=tel;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
}//end of person class

class PhoneBookList
{
	private ArrayList phoneBook;

	public PhoneBookList(){
		phoneBook = new ArrayList();
	}//end of ������

	//�ּҷ��� �߰��ϴ� add�ż���� �ּҷ��� ã�� lookup�޼��带 ���´�
	public void add(String name, String tel){//���� scope
		Person p = new Person(name, tel);
		phoneBook.add(p); //util���� �������ִ� add
	}//end of add method

	public void output(){
		Person p;
		for (int i=0; i<phoneBook.size(); i++) //length�� size()�� ������
		{
			p = (Person)phoneBook.get(i);//Object get(int index) : index ��ġ�� ���Ҹ� �����Ѵ�.
			//get�޼ҵ��� ���ϰ��� object�̱� ������ name�� tel ���� �ٸ����� ���Ƽ� PersonŸ������ ����ȯ
			System.out.println(p.getName()+p.getTel());
		}
		System.out.println("\n");
		//System.out.println();
	}//end of output method

	//�ּҷ��� ã�� lookup �޼���
	public String lookup(String name){
		Person p;
		for (int i=0; i<phoneBook.size(); i++)
		{
			p = (Person)phoneBook.get(i);//Object get(int index) : index ��ġ�� ���Ҹ� �����Ѵ�.
			if (p.getName() == name){
				return p.getTel();
			}	
		}
		return null;
	}
}//end of PhoneBook

class PhoneBookListTest
{
	public static void main(String[] args) {
		String name, tel;
		PhoneBookList myPB = new PhoneBookList();
		myPB.add("������","010-1111-1111");
		myPB.add("����","010-2222-2222");
		myPB.add("��μ�","010-3333-3333");
		myPB.add("�����","010-4444-4444");
		myPB.output();
		name = "�����";
		tel = myPB.lookup(name);//���ϰ� : ��ȭ��ȣ
		if (tel == null)
		{
			System.out.println(name + " : �������� �ʽ��ϴ�!!");
		}
		else
		{
			System.out.println(name + " : " + tel);
		}
	}
}//end of PhoneBookTest class
