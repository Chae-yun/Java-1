class Acast
{
	int a=1;
}

class Bcast extends Acast
{
	int b=2;
}

class Ccast extends Bcast
{
	int c=3;
}

class CastingTest_1 
{
	public static void main(String[] args) 
	{
		Acast refA = new Ccast(); //묵시적형변환
		System.out.println("refA.a의 값은 " + refA.a); //a를 참조변수로 가르키는 것은 가능하나 b, c로 접근하는 것은 불가능 => 1
	}
}
