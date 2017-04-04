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
	public void study(){ System.out.println("공부하다."); }
	public void eat(){ System.out.println("식사하다."); }
	public void test(){ System.out.println("시험보다."); }
	public void extra_act(){ System.out.println("동아리 활동하다."); }
}

class Leader extends Student
{
	//학급회장인지 판정하는 멤버변수 정의
	//객체 생성시 학급회장 매개변수를 전달하는 생성자 작성
	//학급회장 판정 메서드 정의
	boolean TF;
	public Leader(String name, String hakbun, boolean TF){
		/*this.name = name;
		this.hakbun = hakbun; 재사용성 무시 => this()를 쓰고 싶었지만 같은 클래스가 아니기때문에 사용불가*/
		super(name, hakbun); //부모의 생성자 함수를 호출함 9-12번 줄 ㄱㄱ
		this.TF = TF;
	}
	public void isLeader(){ //다른 클래스에서 부르므로 public
		if(this.TF){ //자체가 true라는 뜻 (this.TF)     근데 this쓰는 이유좀?
			System.out.println(name + "은 학급회장이다.");
		}
		else{
			System.out.println(name + "은 학급회장이 아니다.");
		}
	}
}

class MainClass 
{
	public static void main(String[] args) 
	{
		Leader hong = new Leader("홍길동", "30130", true);
		hong.isLeader();
	}
}
