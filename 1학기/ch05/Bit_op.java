class Bit_op //절대값
{
	public static void main(String[] args) 
	{
		int a=5, b=7;
		System.out.println("a&b : "+(a&b));
		System.out.println(Integer.toBinaryString(a&b)); //2진수로 보여줘
		System.out.println("a|b : "+(a|b));
		System.out.println(Integer.toBinaryString(a|b));
		System.out.println("a^b : "+(a^b));
		System.out.println(Integer.toBinaryString(a^b));
		System.out.println("~a : "+(~a));
		System.out.println(Integer.toBinaryString(~a));
	}
}
