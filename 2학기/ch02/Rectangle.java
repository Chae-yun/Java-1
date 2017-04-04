/*가로(width)세로(height) 변의 속성을 갖는다
각 속성 값을 1로 갖는 매개변수가 없는 생성자 메서드 만든다
둘레를 계산하여 반환하는 메서드를 갖는다(calculatePerimeter)
면적을 계산하여 반환하는 메서드를 갖는다(calculateArea)
가로변과 세로변의 길이를 각각 반환하는 메서드를 갖는다.(getWidth, getHeight)
가로변과 세로변의 길이를 각각 주어진 값으로 변경하는 메서드를 갖는다.(setWidth, setHeight)
이때 각 변의 길이는 0보다 크고 20보다 작아야 하며 그렇지 않은 경우 적절한 오류메시지를 출력한다.*/
class Rectangle 
{
	//1. 가로(width)세로(height) 변의 속성을 갖는다
	private double width; //private 는 밑에 set함수가 있으므로 직접 변경 못하게
	private double height;
	//2. 각 속성 값을 1로 갖는 매개변수가 없는 생성자 메서드 만든다
	public Rectangle(){ //외부에서 호출 가능(public)
		width = 1.0;
		height = 1.0;
	}
	//3. 둘레를 계산하여 반환하는 메서드를 갖는다(calculatePerimeter)
	public double calculatePerimeter(){ //외부에서 호출 가능(public)
		return (width + height) * 2.0;
	}
	//4. 면적을 계산하여 반환하는 메서드를 갖는다(calculateArea)
	public double calaulateArea(){ //객체의 가로, 세로 변을 이용하기 때문에 매개변수는 없다
		return width * height;
	}
	//5. 가로변과 세로변의 길이를 각각 반환하는 메서드를 갖는다.(getWidth, getHeight)
	public double getWidth(){
		return width;
	}
	public double getHeight(){
		return height;
	}
	/*6. 가로변과 세로변의 길이를 각각 주어진 값으로 변경하는 메서드를 갖는다.(setWidth, setHeight)
	이때 각 변의 길이는 0보다 크고 20보다 작아야 하며 그렇지 않은 경우 적절한 오류메시지를 출력한다.*/
	public void setWidth(double newW){ //width 와 height 가 private 이므로 이 함수로만 바꾸기 가능
		if(newW > 0 && newW < 20){
			width = newW;
		}
		else{
			System.out.println("각 변의 값은 0보다 크고 20보다 작아야 합니다.\n따라서 초기 설정값인 1로 설정됩니다.\n");
		}
	}
	public void setHeight(double newH){
		if(newH > 0 && newH < 20){
			height = newH;
		}
		else{
			System.out.println("각 변의 값은 0보다 크고 20보다 작아야 합니다.\n따라서 초기 설정값인 1로 설정됩니다.\n");
		}
	}
}
