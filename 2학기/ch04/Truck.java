class Car
{
	Car(){
		System.out.println("Car ������");
	} //Car�� ���ٸ� �����ڰ� ���⶧���� super();�� �����Ϸ��� �ڵ����� �����־��� �׷��� object���� ã�� �ö󰡱⶧���� ���� ����
}

class Truck extends Car
{
	Truck(){
		System.out.println("Truck ������");
	}
	public static void main(String[] args) 
	{
		Truck mytruck = new Truck();
		//���� Ŭ�������� ����(�Ű�����)���� ��ü�� �����Ǹ� �ڵ����� ���� Ŭ������ ���� ���� �������Լ�(����Ʈ)����
		//���� mytruck�� �����ϱ� ���� Truck()�� �����ϸ� ������ Car()���� �����ϰ� �ȴ�.
	}
}

//���賻�� ���� ��Ȯ�� ����!! �ܿ��!!!