/*(ItemDriver)
�ǽ�����1���� (tv, 100000,20),(notebook, 500000,30) ��ü�� �����ϰ� �� ���� ����϶�.
tv�� ������35��� �����ϰ�, notebook�� ������ 600000���� �����ϰ� ����϶�.
���� ���� �� ��ǰ�� ������ ����϶�. */
class ItemDriver 
{
	public static void main(String[] args) 
	{
		Item i1 = new Item("tv", 100000, 20);
		Item i2 = new Item("notebook", 500000, 30);

		System.out.println("��ǰ�̸�: "+i1.getName()+" ��ǰ����: "+i1.getPrice()+" ��ǰ����: "+i1.getQuantity());
		System.out.println("��ǰ�̸�: "+i2.getName()+" ��ǰ����: "+i2.getPrice()+" ��ǰ����: "+i2.getQuantity()+"\n");

		i1.setQuantity(35);
		i2.setPrice(600000);
		System.out.println("��ǰ�̸�: "+i1.getName()+" ��ǰ����: "+i1.getPrice()+" ��ǰ����: "+i1.getQuantity());
		System.out.println("��ǰ�̸�: "+i2.getName()+" ��ǰ����: "+i2.getPrice()+" ��ǰ����: "+i2.getQuantity()+"\n");

		System.out.println("tv�� ����: "+i1.sales());
		System.out.println("notebook�� ����: "+i2.sales());
	}
}