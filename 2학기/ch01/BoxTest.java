class  BoxTest
{
	public static void main(String[] args) 
	{
		//1. �ڽ� ��ü ����
		Box myBox=new Box(8, 10, 5, "red"); //Ŭ�����̸� ��ü�̸� = new �������Լ� (����Ʈ�Ҷ� ���°�)     ��ü��������
		/*myBox.color="red";
		myBox.width=8;
		myBox.height=10;
		myBox.length=5; Box ���Ͽ��� ������ �Լ� �������*/
		//System.out.println("�� �ڽ��� ���� : "+myBox.color);
		//System.out.println("�� �ڽ����� "+myBox.getVolume(8,10,5)+"�� ���� �� �ֽ��ϴ�");
		System.out.println(myBox); //myBox �� �θ��� �ڵ����� toString �޼��带 ã�ư� ����??���??
	}
}
