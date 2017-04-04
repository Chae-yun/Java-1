/*����(width)����(height) ���� �Ӽ��� ���´�
�� �Ӽ� ���� 1�� ���� �Ű������� ���� ������ �޼��� �����
�ѷ��� ����Ͽ� ��ȯ�ϴ� �޼��带 ���´�(calculatePerimeter)
������ ����Ͽ� ��ȯ�ϴ� �޼��带 ���´�(calculateArea)
���κ��� ���κ��� ���̸� ���� ��ȯ�ϴ� �޼��带 ���´�.(getWidth, getHeight)
���κ��� ���κ��� ���̸� ���� �־��� ������ �����ϴ� �޼��带 ���´�.(setWidth, setHeight)
�̶� �� ���� ���̴� 0���� ũ�� 20���� �۾ƾ� �ϸ� �׷��� ���� ��� ������ �����޽����� ����Ѵ�.*/
class Rectangle 
{
	//1. ����(width)����(height) ���� �Ӽ��� ���´�
	private double width; //private �� �ؿ� set�Լ��� �����Ƿ� ���� ���� ���ϰ�
	private double height;
	//2. �� �Ӽ� ���� 1�� ���� �Ű������� ���� ������ �޼��� �����
	public Rectangle(){ //�ܺο��� ȣ�� ����(public)
		width = 1.0;
		height = 1.0;
	}
	//3. �ѷ��� ����Ͽ� ��ȯ�ϴ� �޼��带 ���´�(calculatePerimeter)
	public double calculatePerimeter(){ //�ܺο��� ȣ�� ����(public)
		return (width + height) * 2.0;
	}
	//4. ������ ����Ͽ� ��ȯ�ϴ� �޼��带 ���´�(calculateArea)
	public double calaulateArea(){ //��ü�� ����, ���� ���� �̿��ϱ� ������ �Ű������� ����
		return width * height;
	}
	//5. ���κ��� ���κ��� ���̸� ���� ��ȯ�ϴ� �޼��带 ���´�.(getWidth, getHeight)
	public double getWidth(){
		return width;
	}
	public double getHeight(){
		return height;
	}
	/*6. ���κ��� ���κ��� ���̸� ���� �־��� ������ �����ϴ� �޼��带 ���´�.(setWidth, setHeight)
	�̶� �� ���� ���̴� 0���� ũ�� 20���� �۾ƾ� �ϸ� �׷��� ���� ��� ������ �����޽����� ����Ѵ�.*/
	public void setWidth(double newW){ //width �� height �� private �̹Ƿ� �� �Լ��θ� �ٲٱ� ����
		if(newW > 0 && newW < 20){
			width = newW;
		}
		else{
			System.out.println("�� ���� ���� 0���� ũ�� 20���� �۾ƾ� �մϴ�.\n���� �ʱ� �������� 1�� �����˴ϴ�.\n");
		}
	}
	public void setHeight(double newH){
		if(newH > 0 && newH < 20){
			height = newH;
		}
		else{
			System.out.println("�� ���� ���� 0���� ũ�� 20���� �۾ƾ� �մϴ�.\n���� �ʱ� �������� 1�� �����˴ϴ�.\n");
		}
	}
}
