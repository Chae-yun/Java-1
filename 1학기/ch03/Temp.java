class Temp 
{
	public static void main(String args[]) 
	{
		int c=15;
		double f=9.0/5.0*c+32.0; 
		/*9, 5, 32처럼 .0안붙이면 답이 다르게 나옴. 틀림. 9/5=1, 9.0/5.0=1.8이다.
		그리고 9/5가 실수이므로 int정의 XX.*/
		System.out.print("섭씨온도 15도는 " + f + "도 입니다.");
	}
}
