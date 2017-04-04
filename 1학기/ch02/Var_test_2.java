class Var_test_2
{
	public static void main(String args[]){
		/*자신의 키와 몸무게를 정수형으로 선언, 
		출력하는 프로그램*/
		int tall=160,weight=43;//변수명-의미포함
		System.out.print("키:"+tall+ "몸무게:"+weight);
		System.out.print("bmi:"+(weight/(tall*tall)));
	}
}