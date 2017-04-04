class Circle 
{
	double radius;
	Circle(double radius){
		this.radius = radius;
	}
	double getRadius(){
		return radius;
	}
	double computeArea(){
		return radius * radius * 3.14;
	}
	double computePerimeter(){
		return 2 * radius * 3.14;
	}
	void setRadius(double newRadius){
		radius = newRadius;
	}
}
