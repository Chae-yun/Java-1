class Person
{
		/* 전화번호부에 들어갈 사람을 정의하는 Person 클래스(이름, 전화번호로 person 객체 생성)를 정의하고,
			Person 클래스를 이용해 전화번호부를 지정하는 Phonebook 클래스를 설계하라.
			- Phonebook 클래스는 Person 객체를 참조하는 배열 book 을 가지며, 주소록을 추가하는 add 메서드와
			  주소록을 찾는 lookup 메서드를 갖는다.
			- add 메서드에서 book.length를 체크하여 주소록의 넘침여부를 판단하여 추가한다.
			- lookup 메서드는 입력 받은 이름을 기준으로 검색하되, 이름이 없는 경우 null 을 리턴한다.
		*/

		// 1. 전화번호부에 들어갈 사람을 정의하는 Person 클래스(이름, 전화번호로 person 객체 생성) 정의
		private String name;
		private String tel;		// - 가 붙기 때문에
		
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
	private Person[] book; // Person 객체를 참조 (=Person book[])
	private int count; // 배열의 넘침 여부를 판단하기 위해 요소 갯수(인덱스)를 세기 위해
	
	public PhoneBook(int max) {	// 배열의 최대갯수를 넘겨 받아야 한다.
		book = new Person[max];
		count = 0;						// 배열의 인덱스 처음 값 '0'
	} // end of 생성자

	// 4. add 메서드에서 book.length를 체크하여 주소록의 넘침여부를 판단하여 추가한다.
	public void add(String name, String tel) {	// 변수 scope, 매개변수는 add안에서만..
		if(count == book.length) {
			System.out.println("전화번호부가 꽉 찼습니다! 더 이상 추가할 수 없습니다.");
		}
		else {
			book[count] = new Person(name, tel);
			count++;
		}		
	} // end of add method

	public void output()
	{
		//book배열을 출력
		System.out.println("=====전화번호부 출력=====");
		for (int i=0; i<count; i++)
		{
			System.out.println("이름 : " + book[i].getName() + " 전화번호 : " + book[i].getTel());
		}
	} //end of output method

	//주소록을 찾는 lookup 메서드
	public String lookup(String name){
		for (int i=0; i<count; i++)
		{
			if (name == book[i].getName())
			{
				return book[i].getTel();
			}
		}//찾는 것이 없었다면 return이 없다.
		return null;
	} //end of lookup method
}// end of add PhoneBook

class PhoneBookTest
{
	public static void main(String[] args) {
		String name, tel;
		PhoneBook myPB = new PhoneBook(3);
		myPB.add("김나현","010-1111-1111");
		myPB.add("김명옥","010-2222-2222");
		myPB.add("김민선","010-3333-3333");
		myPB.add("김민주","010-4444-4444");
		myPB.output();
		name = "김민주";
		tel = myPB.lookup(name);//리턴값 : 전화번호
		if (tel == null)
		{
			System.out.println(name + " : 존재하지 않습니다!!");
		}
		else
		{
			System.out.println(name + " : " + tel);
		}
	}
} // end of PhoneBookTest class