//절대값을 구하는 클래스 -> 다른 프로그램에서도 재활용가능 
class Absolute_class
{
	public static void main(String[] args) 
	{		
		Absolute myabs=new Absolute();//Absolute클래스로부터 myabs객체생성

		System.out.println(myabs.getAbs(-3));
	}
}
