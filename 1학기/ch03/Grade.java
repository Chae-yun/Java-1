class  Grade
{
	public static void main(String args[]) 
	{
		/*변수선언
		타입 변수명=초기화;*/
		String name;
		int work;
		int bonus;
		//int total;
		System.out.println("이름   과제  보너스    합계");
		name="선미"; work=82; bonus=7;
		System.out.println(name+"\t"+work+"\t"+"\t"+bonus+"\t"+"\t"+(work+bonus));
		name="성우"; work=71; bonus=4;
		System.out.println(name+"\t"+work+"\t"+"\t"+bonus+"\t"+"\t"+(work+bonus));
		name="가연"; work=92; bonus=8;
		System.out.print(name+"\t"+work+"\t"+"\t"+bonus+"\t"+"\t"+(work+bonus));
		}
}
