class Date_type_3
{
	public static void main(String[] args) 
	{
		/*
		byte a = 10;
		int b = a;

		int a = 10;
		byte b = (byte)a;*/

		int a = 12;
		byte b = (byte)a;
		byte d = (byte) (a+b);//강제 형변환
		System.out.println("a+b : "+d);
	}
}
