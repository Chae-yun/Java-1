class Truck extends Car 
{
	int ton; //Car�� ������ �ִ� carname, color, velocity �� �⺻������ ������ �ִ�
}

class TruckMain
{
	public static void main(String[] args) 
	{
		Truck mytruck = new Truck();
		mytruck.carname = "����Ƽ��"; //��ӹ���
		mytruck.ton = 3; //�ڽ��� �Ӽ�
		System.out.println("���� Ʈ���� " + mytruck.color + "�̴�."); //��ӹ���
		System.out.println(mytruck.carname + "�� " + mytruck.ton + "���� ���� �� �ִ�.");
	}
}
