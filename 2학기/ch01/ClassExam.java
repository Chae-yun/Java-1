class Student 
{
	String name;
	int grade;
	int ban;
	int number;
	String telephone;
}
class ClassExam
{
	public static void main(String args[]){
		Student kim = new Student(); //맨 뒤에 Student가 생성자 함수 이름이었따!!!
		kim.name = "김현우";
		kim.grade = 2;
		kim.number = 14;
		kim.telephone = "123-345-6789";
		System.out.println("학생정보 : " + kim.name + "   학년 : " + kim.grade + "   번호 : " + kim.number + "   전화번호 : " + kim.telephone);
	}
}