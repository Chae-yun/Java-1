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
		Acast refA = new Ccast(); //����������ȯ
		System.out.println("refA.a�� ���� " + refA.a); //a�� ���������� ����Ű�� ���� �����ϳ� b, c�� �����ϴ� ���� �Ұ��� => 1
	}
}
