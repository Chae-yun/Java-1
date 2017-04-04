class Person
{
		/* ��ȭ��ȣ�ο� �� ����� �����ϴ� Person Ŭ����(�̸�, ��ȭ��ȣ�� person ��ü ����)�� �����ϰ�,
			Person Ŭ������ �̿��� ��ȭ��ȣ�θ� �����ϴ� Phonebook Ŭ������ �����϶�.
			- Phonebook Ŭ������ Person ��ü�� �����ϴ� �迭 book �� ������, �ּҷ��� �߰��ϴ� add �޼����
			  �ּҷ��� ã�� lookup �޼��带 ���´�.
			- add �޼��忡�� book.length�� üũ�Ͽ� �ּҷ��� ��ħ���θ� �Ǵ��Ͽ� �߰��Ѵ�.
			- lookup �޼���� �Է� ���� �̸��� �������� �˻��ϵ�, �̸��� ���� ��� null �� �����Ѵ�.
		*/

		// 1. ��ȭ��ȣ�ο� �� ����� �����ϴ� Person Ŭ����(�̸�, ��ȭ��ȣ�� person ��ü ����) ����
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
} //end of Person class

class PhoneBook
{
	private Person[] book; // Person ��ü�� ���� (=Person book[])
	private int count; // �迭�� ��ħ ���θ� �Ǵ��ϱ� ���� ��� ����(�ε���)�� ���� ����
	
	public PhoneBook(int max) {	// �迭�� �ִ밹���� �Ѱ� �޾ƾ� �Ѵ�.
		book = new Person[max];
		count = 0;						// �迭�� �ε��� ó�� �� '0'
	} // end of ������

	// 4. add �޼��忡�� book.length�� üũ�Ͽ� �ּҷ��� ��ħ���θ� �Ǵ��Ͽ� �߰��Ѵ�.
	public void add(String name, String tel) {	// ���� scope, �Ű������� add�ȿ�����..
		if(count == book.length) {
			System.out.println("��ȭ��ȣ�ΰ� �� á���ϴ�! �� �̻� �߰��� �� �����ϴ�.");
		}
		else {
			book[count] = new Person(name, tel);
			count++;
		}		
	} // end of add method

	public void output()
	{
		//book�迭�� ���
		System.out.println("=====��ȭ��ȣ�� ���=====");
		for (int i=0; i<count; i++)
		{
			System.out.println("�̸� : " + book[i].getName() + " ��ȭ��ȣ : " + book[i].getTel());
		}
	} //end of output method

	//�ּҷ��� ã�� lookup �޼���
	public String lookup(String name){
		for (int i=0; i<count; i++)
		{
			if (name == book[i].getName())
			{
				return book[i].getTel();
			}
		}//ã�� ���� �����ٸ� return�� ����.
		return null;
	} //end of lookup method
}// end of add PhoneBook

class PhoneBookTest
{
	public static void main(String[] args) {
		String name, tel;
		PhoneBook myPB = new PhoneBook(3);
		myPB.add("�質��","010-1111-1111");
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
} // end of PhoneBookTest class