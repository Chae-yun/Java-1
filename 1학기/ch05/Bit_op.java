class Bit_op //���밪
{
	public static void main(String[] args) 
	{
		int a=5, b=7;
		System.out.println("a&b : "+(a&b));
		System.out.println(Integer.toBinaryString(a&b)); //2������ ������
		System.out.println("a|b : "+(a|b));
		System.out.println(Integer.toBinaryString(a|b));
		System.out.println("a^b : "+(a^b));
		System.out.println(Integer.toBinaryString(a^b));
		System.out.println("~a : "+(~a));
		System.out.println(Integer.toBinaryString(~a));
	}
}
