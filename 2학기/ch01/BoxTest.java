class  BoxTest
{
	public static void main(String[] args) 
	{
		//1. 박스 객체 생성
		Box myBox=new Box(8, 10, 5, "red"); //클래스이름 객체이름 = new 생성자함수 (프린트할때 쓰는것)     객체생성위함
		/*myBox.color="red";
		myBox.width=8;
		myBox.height=10;
		myBox.length=5; Box 파일에서 생성자 함수 만들었다*/
		//System.out.println("내 박스의 색깔 : "+myBox.color);
		//System.out.println("내 박스에는 "+myBox.getVolume(8,10,5)+"를 담을 수 있습니다");
		System.out.println(myBox); //myBox 를 부르면 자동으로 toString 메서드를 찾아가 실행??출력??
	}
}
