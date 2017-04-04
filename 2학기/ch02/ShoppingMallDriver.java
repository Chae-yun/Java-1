import java.util.Scanner;
class ShoppingMall
{
	String shopName;
	Scanner scan = new Scanner(System.in);
	ShoppingMall(String sn){
		shopName = sn;
	}
	void showAndGet(){
		System.out.println(shopName + "�� ���Ű� ȯ���մϴ�!!\n");
		System.out.println("     ��-----      -----��         ---    ---             --------------");
		System.out.println("    -       -    -      -       ��   ����   ��          ��             ��");
		System.out.println("   ��        ����       ��      ��          ��          ��             ��");
		System.out.println("   ��  ��           ��  ��      ��          ��          ��             ��");
		System.out.println("    ---              ----        ��        ��           ��   3  ��     ��");
		System.out.println("       ��           ��            ��------��            ��      ��     ��");
		System.out.println("       ��      1    ��           ��        ��           ��      ��     ��");
		System.out.println("       ��           ��          ��          ��          ��      ��     ��");
		System.out.println("       ��           ��        ��       2      ��        ��      ��     ��");
		System.out.println("       ��           ��      ��                  ��      ��      ��     ��");
		System.out.println("       ��           ��    ��                      ��    ��      ��     ��");
		System.out.println("        -------------      ------------------------     ��      ��     ��");
		System.out.println("                                                          ------  ------\n");
		System.out.println("       ���ϸ� ���� Ƽ        Ư���� ���� �巹��         ���ǳ� 100% �����");
		System.out.println("           5500��                  12500��                    15000��\n\n");
		System.out.print("�� �߿��� �����Ͻ� ���� ��ȣ�� �Է����ֽʽÿ� : ");
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
		System.out.println("�����ݾ��� " + price + "�Դϴ�.");
		System.out.print("������ �����Ͻðڽ��ϱ�? (�����Ͻ÷��� 1��, ���� �����÷��� 0��) : ");
		int coupon = scan.nextInt();
		if(coupon == 1)
			price = couponPrice(price);
		System.out.print("1. ī�����  2. �������Ա�     �������ֽʽÿ� : ");
		int choice = scan.nextInt();
		if(choice == 1){
			System.out.print("ī���ȣ�� �Է����ּ���(���� ����) : ");
			String cardnum = scan.next();
			System.out.print("��й�ȣ�� �Է����ּ���(4�ڸ�) : ");
			int password = scan.nextInt();
			System.out.println(price + "�� ������ �Ϸ�Ǿ����ϴ�.");
		}
		else if(choice == 2){
			System.out.println("���� 24:00���� " + price + "���� 145-78544-245627(�������)���� �Ա����ֽñ� �ٶ��ϴ�.");
		}//�� �κ��� �����ϰ� ó���߽��ϴ٤Ф�
	}
	int couponPrice(int price){
		System.out.print("10%, 20%, 50% ���� ������ �ֽ��ϴ�. ����ּ��� (���ʺ��� 1��, 2��, 3��) : ");
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
		ShoppingMall shop = new ShoppingMall("ä����");
		shop.showAndGet();
	}
}