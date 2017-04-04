class Square
{
	//멤버변수
	double width;
	double length;
	String color;

	//생성자함수(메서드) 만들기 (처음이다!!)
	/*Square(double width, double length, String color){ //리턴타입이 무조건 없고 이름은 클래스이름과 같아야한다
		this.width = width//자기자신 width에 외부 width를 넣자 this필요!!
		this.length = length;
		this.color = color;
	} 받는 매개변수를 위에랑 이름 똑같이 할경우*/

	Square(double w, double l, String c){ //리턴타입이 무조건 없고 이름은 클래스이름과 같아야한다
		width = w; //매개변수가 위에랑 다르니까 this 노필요
		length = l;
		color = c;
	}

	double getArea(double w, double l){
		return w * l;
	}
}
