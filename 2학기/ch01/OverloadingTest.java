class C
{
	void show(){ //매개변수 - 0
		System.out.println("반갑습니다");
	}
	void show(int n){ //매개변수 - 1(정수)
		System.out.println("반갑습니다 " + n + "반");
	}
	void show(int n, String str){ //매개변수 - 2(정수, 문자열)
		System.out.println(n + "반 반갑습니다 " + str);
	} //오버로딩 2번 함(메서드의 타입바꿔주고 동일 클래스에서 여러 메서드이므로)
}

class OverloadingTest 
{
	public static void main(String[] args) 
	{
		C c = new C();
		c.show();
		c.show(1);
		c.show(1, "그만자!");
	} //오버라이딩 오버로딩 헷갈리니까 외우기!!! 별별별
}
