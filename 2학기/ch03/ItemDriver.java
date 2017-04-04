/*(ItemDriver)
실습예제1에서 (tv, 100000,20),(notebook, 500000,30) 객체를 생성하고 각 값을 출력하라.
tv의 수량을35대로 변경하고, notebook의 가격을 600000으로 변경하고 출력하라.
변경 이후 각 제품의 매출을 출력하라. */
class ItemDriver 
{
	public static void main(String[] args) 
	{
		Item i1 = new Item("tv", 100000, 20);
		Item i2 = new Item("notebook", 500000, 30);

		System.out.println("상품이름: "+i1.getName()+" 상품가격: "+i1.getPrice()+" 상품수량: "+i1.getQuantity());
		System.out.println("상품이름: "+i2.getName()+" 상품가격: "+i2.getPrice()+" 상품수량: "+i2.getQuantity()+"\n");

		i1.setQuantity(35);
		i2.setPrice(600000);
		System.out.println("상품이름: "+i1.getName()+" 상품가격: "+i1.getPrice()+" 상품수량: "+i1.getQuantity());
		System.out.println("상품이름: "+i2.getName()+" 상품가격: "+i2.getPrice()+" 상품수량: "+i2.getQuantity()+"\n");

		System.out.println("tv의 매출: "+i1.sales());
		System.out.println("notebook의 매출: "+i2.sales());
	}
}