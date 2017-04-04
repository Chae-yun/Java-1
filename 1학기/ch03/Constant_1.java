import java.util.Scanner; //스캐너 클래스를 활용할거야  >자바vm
class Constant_1
{
	public static void main(String args[])
	{
		/*시험점수를 입력 받아 기준점수 (85점)이상이면
		'통과', 기준점수 미만이면 '탈락'을 출력하는 프로그램을 작성하라.
		단, 기준점수, 통과, 탈락은 상수로 정의한다.*/
		final int P_S=85;
		final String PASS = "통과";
		final String FAILURE = "탈락";

		System.out.print("점수를 입력하세요 : ");
		Scanner scan=new Scanner(System.in); //키보드 입력을 위한 객체 생성. 문자로 밖에 안됨
		int score = scan.nextInt(); //문자 -> 숫자로 바꿔서 변수로 입력
		if(score >=P_S){
			System.out.print(PASS);
		}else{//score < P_S
			System.out.print(FAILURE);
		}
	}
}