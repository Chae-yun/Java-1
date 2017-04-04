/*  
Phonebook클래스는 Person객체를 참조하는 배열 book을 가지며, 주소록을 추가하는 add매서드와 주소록을 찾는 lookup메서드를 갖는다
add매서드에서 book.length를 체크하여 주소록의 넘침여부를 판단하여 추가한다.
lookup메서드는 입력받은 이름을 기준으로 검색하되 이름이 없는 경우 null을 리턴한다*/

//전화번호부에 들어갈 사람을 정의하는 Person클래스(이름, 전화번호로 person객체 생성)를 정의하고
import java.util.ArrayList;
class Person
{
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
}//end of person class

class PhoneBookList
{
	private ArrayList phoneBook;

	public PhoneBookList(){
		phoneBook = new ArrayList();
	}//end of 생성자

	//주소록을 추가하는 add매서드와 주소록을 찾는 lookup메서드를 갖는다
	public void add(String name, String tel){//변수 scope
		Person p = new Person(name, tel);
		phoneBook.add(p); //util에서 지원해주는 add
	}//end of add method

	public void output(){
		Person p;
		for (int i=0; i<phoneBook.size(); i++) //length와 size()의 차이점
		{
			p = (Person)phoneBook.get(i);//Object get(int index) : index 위치의 원소를 리턴한다.
			//get메소드의 리턴값은 object이기 때문에 name과 tel 말고도 다른것이 많아서 Person타입으로 형변환
			System.out.println(p.getName()+p.getTel());
		}
		System.out.println("\n");
		//System.out.println();
	}//end of output method

	//주소록을 찾는 lookup 메서드
	public String lookup(String name){
		Person p;
		for (int i=0; i<phoneBook.size(); i++)
		{
			p = (Person)phoneBook.get(i);//Object get(int index) : index 위치의 원소를 리턴한다.
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
		myPB.add("김지현","010-1111-1111");
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
}//end of PhoneBookTest class
