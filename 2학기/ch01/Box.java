class Box //Ŭ���� �����
{
	//�����-����(�Ӽ�), �޼���
	int width;
	int length;
	int height;
	String color;

	Box(int w, int l, int h, String c){
		width = w; //this �ʿ����
		length = l;
		height = h;
		color = c;
	}

	/*int getVolume(int w, int h, int l){
		return w*h*l;
	}*/
	public String toString(){ //�ֻ��� Ŭ���� Object �� toString �޼��带 �������̵��Ѵ� ���������ڴ� public����!!
		return ("���� " + width*height*length);
	}
}
