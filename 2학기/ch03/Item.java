/*
(Item)
인터넷 쇼핑몰에서 고객이 구매하고자 하는 상품을 모델하는 Item 이라는 클래스를 설계하고 구현하라.
1. 상품의 이름(name), 가격(price), 수량(quantity)을 입력 받아 초기화도 하면서 대응하는 매개변수로 변경까지도 가능한 생성자 메서드를 갖는다.(set함수, get함수를 쓰라는 얘기)
2. 이름,가격,수량은 외부에서 직접 변경이 불가능하다. 1번에서 작성한 메서드를 통해서만 변경 가능
4.매출을 알 수 있어야한다.

(ItemDriver)
실습예제1에서 (tv, 100000,20),(notebook, 500000,30) 객체를 생성하고 각 값을 출력하라.
tv의 수량을35대로 변경하고, notebook의 가격을 600000으로 변경하고 출력하라.
변경 이후 각 제품의 매출을 출력하라.
*/

class Item 
{
	private String name;	//상품이름
	private int price;	//상품가격	
	private int quantity;	//상품수량
	private int sales;	//매출

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