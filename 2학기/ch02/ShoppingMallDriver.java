import java.util.Scanner;
class ShoppingMall
{
	String shopName;
	Scanner scan = new Scanner(System.in);
	ShoppingMall(String sn){
		shopName = sn;
	}
	void showAndGet(){
		System.out.println(shopName + "에 오신걸 환영합니다!!\n");
		System.out.println("     ┌-----      -----┐         ---    ---             --------------");
		System.out.println("    -       -    -      -       │   └┘   │          │             │");
		System.out.println("   │        └┘       │      │          │          │             │");
		System.out.println("   │  │           │  │      │          │          │             │");
		System.out.println("    ---              ----        │        │           │   3  │     │");
		System.out.println("       │           │            │------│            │      │     │");
		System.out.println("       │      1    │           │        │           │      │     │");
		System.out.println("       │           │          │          │          │      │     │");
		System.out.println("       │           │        │       2      │        │      │     │");
		System.out.println("       │           │      │                  │      │      │     │");
		System.out.println("       │           │    │                      │    │      │     │");
		System.out.println("        -------------      ------------------------     │      │     │");
		System.out.println("                                                          ------  ------\n");
		System.out.println("       데일리 무지 티        특별한 날엔 드레스         스판끼 100% 면바지");
		System.out.println("           5500원                  12500원                    15000원\n\n");
		System.out.print("이 중에서 구매하실 옷의 번호를 입력해주십시오 : ");
		int number = scan.nextInt();
		knowPrice(number);
	}
	void knowPrice(int number){
		int price = 0;
		switch(number){
			case 1:
				price = 5500; break;
			case 2:
				price = 12500; break;
			case 3:
				price = 15000; break;
		}
		buy(price);
	}
	void buy(int price){
		System.out.println("결제금액은 " + price + "입니다.");
		System.out.print("쿠폰을 적용하시겠습니까? (적용하시려면 1번, 하지 않으시려면 0번) : ");
		int coupon = scan.nextInt();
		if(coupon == 1)
			price = couponPrice(price);
		System.out.print("1. 카드결제  2. 무통장입금     선택해주십시오 : ");
		int choice = scan.nextInt();
		if(choice == 1){
			System.out.print("카드번호를 입력해주세요(띄어쓰기 제외) : ");
			String cardnum = scan.next();
			System.out.print("비밀번호를 입력해주세요(4자리) : ");
			int password = scan.nextInt();
			System.out.println(price + "원 결제가 완료되었습니다.");
		}
		else if(choice == 2){
			System.out.println("내일 24:00까지 " + price + "원을 145-78544-245627(기업은행)으로 입금해주시기 바랍니다.");
		}//이 부분은 간단하게 처리했습니다ㅠㅠ
	}
	int couponPrice(int price){
		System.out.print("10%, 20%, 50% 할인 쿠폰이 있습니다. 골라주세요 (왼쪽부터 1번, 2번, 3번) : ");
		int couponNum = scan.nextInt();
		switch(couponNum){
			case 1:
				price = (int)(price * 0.9); break;
			case 2:
				price = (int)(price * 0.8); break;
			case 3:
				price = (int)(price * 0.5); break;
		}
		return price;
	}
}

class ShoppingMallDriver
{
	public static void main(String args[]){
		ShoppingMall shop = new ShoppingMall("채윤샵");
		shop.showAndGet();
	}
}