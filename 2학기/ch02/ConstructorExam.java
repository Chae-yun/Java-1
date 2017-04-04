class Student
{
	String name; //멤버변수~
	int grade;
	int clas;
	int number;
	String telephone;//~멤버변수
	public Student(){}; //매개변수 없다.
	public Student(String n){ //매개변수1, 문자열
		name = n;
	};
	public Student(String n, int num){ //매개변수2, 문자열, 정수형 =>생성자 오버로딩!!!!!!!!!!!별별별
		name = n;
		number = num;
	};
}

class ConstructorExam 
{
	public static void main(String[] args) 
	{
		Student kim = new Student();
		Student jang = new Student("장민재"); //위에 두번째 Student가 없으면 에러 매개변수가 맞지 않으므로 또 생성(생성자함수 오버로딩!!)
		Student bak = new Student("나미림", 1121); //위에 세번째 Student가 없으면 에러 매개변수가 맞지 않으므로 또 생성(생성자함수 오버로딩!!)   각각 자기한테 맞는 걸 찾아감
		System.out.println("학생의 이름은 " + kim.name + "입니다"); //아무 값을 주지 않아서 null
		System.out.println("학생의 이름은 " + jang.name + "입니다");
		System.out.println("학생의 이름은 " + bak.name + ", 학번은 " + bak.number + "입니다");
	}
}
