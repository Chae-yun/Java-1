class Car
{
	String name;
	String company;
	private int price; //private �� ���������ڷ� �����ϸ� �ٸ� ������ �ҷ��� �� ����
	Car(String n, String c, int p){
		setName(n); //ĸ��ȭ ��Ű�� ���ȼ� ����
		setCompany(c);
		setPrice(p);
	}
	void setName
}

class CarTest 
{
	public static void main(String[] args) 
	{
		Car mycar = new Car(i30, ����, 35000000);
		/*mycar.name = "i30";
		mycar.company = "����";
		mycar.price = 35000000; �̷��� ���� XX*/
		System.out.println(mycar.name + mycar.company + mycar.price);
	}
}
