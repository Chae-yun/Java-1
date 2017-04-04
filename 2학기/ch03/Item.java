/*
(Item)
���ͳ� ���θ����� ���� �����ϰ��� �ϴ� ��ǰ�� ���ϴ� Item �̶�� Ŭ������ �����ϰ� �����϶�.
1. ��ǰ�� �̸�(name), ����(price), ����(quantity)�� �Է� �޾� �ʱ�ȭ�� �ϸ鼭 �����ϴ� �Ű������� ��������� ������ ������ �޼��带 ���´�.(set�Լ�, get�Լ��� ����� ���)
2. �̸�,����,������ �ܺο��� ���� ������ �Ұ����ϴ�. 1������ �ۼ��� �޼��带 ���ؼ��� ���� ����
4.������ �� �� �־���Ѵ�.

(ItemDriver)
�ǽ�����1���� (tv, 100000,20),(notebook, 500000,30) ��ü�� �����ϰ� �� ���� ����϶�.
tv�� ������35��� �����ϰ�, notebook�� ������ 600000���� �����ϰ� ����϶�.
���� ���� �� ��ǰ�� ������ ����϶�.
*/

class Item 
{
	private String name;	//��ǰ�̸�
	private int price;	//��ǰ����	
	private int quantity;	//��ǰ����
	private int sales;	//����

	public Item (String name, int price, int quantity)
	{
		setName(name);
		setPrice(price);
		setQuantity(quantity);
	}

	//get
	public String getName()
	{
		return name;
	}

	public int getPrice()
	{
		return price;
	}

	public int getQuantity()
	{
		return quantity;
	}

	//set
	public void setName(String n)
	{
		name=n;
	}

	public void setPrice(int p)
	{
		price=p;
	}

	public void setQuantity(int q)
	{
		quantity=q;
	}

	public int sales()
	{
		sales = price * quantity;
		return sales;
	}
}