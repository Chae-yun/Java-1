class Student
{
	String name;
	int grade;
	public Student(){}
	public Student(String name){
		this.name = name; //이건 예약어 this.
	}
	public Student(String name, int grade){
		this(name); //두번째 생성자 함수 호출
		this.grade = grade;
	}
	public void print(){
		System.out.println("학생의 이름 : " + this.name + " 학년 : " + grade); //객체 자신을 나타내는 this는 생략가능
	}
}

class StudentExam
{
	public static void main(String[] args) 
	{
		Student kim = new Student("김현우"); //두번째 생성자 함수만 동작
		kim.grade = 2;
		kim.print();
		Student jang = new Student("장민재", 3); //두번째, 세번째 생성자 함수 동작
		jang.print();
	}
}
