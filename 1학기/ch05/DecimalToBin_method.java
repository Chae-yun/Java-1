class  DecimalToBin_method
{
	//접근제어(제한)자(공개되는 메서드)   지정예약어     리턴타입이 없음    메서드이름   매개변수(줘도 되고 안 줘도 됨?)
	public                                            static             void                    main           (String[] args)
	//static : 메모리 우선로딩, 메서드 종료시까지 메모리(ram)에 상주(일반적으로 삭제되지만 static은..)
	/*정리!! 프로그램이 실행될 때 가장 먼저 로딩(static)되는 메서드로서 이름은 main()이고,
	리턴타입은 void며, 매개변수는 string[] args 이다.
	그리고 모든 관련 클래스들이 종료될 때까지 main은 메모리에 살아있다.
	다른 메서드는 실행이 끝나면 주메모리에서 사라진다. 호출되면 다시 메모리에 올라온다.
	외부 클래스에 공개되어 있다.(main은 반드시 public. 그래야 참조함.(??))*/
	{
		//10진수 int 64를 32비트 2진수로 변환하는 프로그램을 작성하라
		//선언부
		int num=64;
		System.out.println(toBinary(num));
		System.out.println(toBinary(150)); //메서드니까 계속 호출
		System.out.println(toBinary(100));
		System.out.println(toBinary(200));
		/*String result=""; //공백XX, 스트링을 쓰는 이유는 계속 0과 1을 붙이기 때문?
		for (int i=1;i<=32;i++)
		{
			result=num%2+result;
			num=num/2; //num/=2 대입연산자, num 자신을 2로 나누어 변화시킨다.
			//System.out.println(result); 단계별로 보고 싶을 때
		}
		System.out.println("64는"+result);*/
	}
	static String toBinary(int num){ //main호출하는 거니까 static
		//int num 하고 다른것도 쓰고 싶다면 int num, int a, int b.. 로 '데이터타입 변수명'이라고 해줌
		String result=""; //toBinary에서 쓰이는 것이기 때문에 result선언은 여기로 내린다.
		for (int i=1;i<=32;i++)
		{
			result=num%2+result;
			num=num/2; //num/=2 대입연산자, num 자신을 2로 나누어 변화시킨다.
			//System.out.println(result); 단계별로 보고 싶을 때
		}
		return result;
	}
}
