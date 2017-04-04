class Bit_op_1 //>> << >>>
{
	public static void main(String[] args) 
	{
		int a=65, b=3;
		System.out.println("1 (original 65) : "+Integer.toBinaryString(65));
		System.out.println("2 (>>3) : " + (65>>3));
		System.out.println("2 (>>3) : "+Integer.toBinaryString(65>>3));
		System.out.println("3 (<<3) : " + (65<<3));
		System.out.println("3 (<<3) : "+Integer.toBinaryString(65<<3));
		System.out.println("4 (>>>3) : " + (65>>>3));
		System.out.println("4 (>>>3) : "+Integer.toBinaryString(65>>>3));
	}
}
