class Square
{
	//�������
	double width;
	double length;
	String color;

	//�������Լ�(�޼���) ����� (ó���̴�!!)
	/*Square(double width, double length, String color){ //����Ÿ���� ������ ���� �̸��� Ŭ�����̸��� ���ƾ��Ѵ�
		this.width = width//�ڱ��ڽ� width�� �ܺ� width�� ���� this�ʿ�!!
		this.length = length;
		this.color = color;
	} �޴� �Ű������� ������ �̸� �Ȱ��� �Ұ��*/

	Square(double w, double l, String c){ //����Ÿ���� ������ ���� �̸��� Ŭ�����̸��� ���ƾ��Ѵ�
		width = w; //�Ű������� ������ �ٸ��ϱ� this ���ʿ�
		length = l;
		color = c;
	}

	double getArea(double w, double l){
		return w * l;
	}
}
