class Data_type_3 
{
	public static void main(String[] args) 
	{
		/*묵시적 형변환(자동 형변환)
		byte a=10;
		int b=a;
		에러 안남.*/
		int a=10;
		byte b=(byte)a;/*명시적 형변환(강제 형변환, 타입캐스팅)
		에러안남, (byte) 이거 없애면 에러남.
		그러나 바람직 하지 않음. 데이터 손실 위험 있음!!*/
	}
}
