//this 실습 예제
class Box
{
	int width;
	int height;
	int depth;
	public Box(){
		this(1,1,1);
	}
	public Box(int w, int h){
		this(w,h,1);
	}
	public Box(int w, int h, int d){ //결국에는 이거 호출!!
		width = w;
		height = h;
		depth = d;
	}
}
