class Moverloading_1 //�⸻ 100�� ����
{
	public static void main(String[] args) 
	{
		Calculate c = new Calculate();
		int input[] = new int[args.length];
		for(int i = 0; i < args.length; i++){
			input[i] = Integer.parseInt(args[i]);
		}
		switch(args.length){
			case 0:
				c.cals(); break;
			case 1:
				c.cals(input[0]); break;
			case 2:
				c.cals(input[0], input[1]); break;
			case 3:
				c.cals(input[0], input[1], input[2]); break;
			default:
				System.out.println("���� ������ �������� �ʽ��ϴ�. 1��, 2��, 3�� �߿��� �Է��� �ֽʽÿ�.");
		}
		/*if(args.length == 0){
			c.cals();
		}
		else if(args.length == 1){
			c.cals(input[0]);
		}
		else if(args.length == 2){
			c.cals(input[0], input[1]);
		}
		else if(args.length == 3){
			c.cals(input[0], input[1], input[2]);
		}
		else if(args.length > 3){
			System.out.println("�Ű������� �ʹ� �����ϴ�.");
		}*/
	}
}

class Calculate
{
	void cals(){
		System.out.println("�Ű������� �����ϴ�.");
	}
	void cals(int a){
		System.out.println("���簢���� ���� : " + (a * a));
	}
	void cals(int a, int b){
		System.out.println("���簢���� ���� : " + (a * b));
	}
	void cals(int a, int b, int c){
		System.out.println("����ü�� ���� : " + (a * b * c));
	}
}