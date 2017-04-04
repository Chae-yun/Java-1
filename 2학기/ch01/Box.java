class Box //클래스 선언부
{
	//멤버부-변수(속성), 메서드
	int width;
	int length;
	int height;
	String color;

	Box(int w, int l, int h, String c){
		width = w; //this 필요없다
		length = l;
		height = h;
		color = c;
	}

	/*int getVolume(int w, int h, int l){
		return w*h*l;
	}*/
	public String toString(){ //최상위 클래스 Object 의 toString 메서드를 오버라이딩한다 접근제어자는 public으로!!
		return ("부피 " + width*height*length);
	}
}
