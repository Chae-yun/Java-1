class Moverloading_1 //기말 100퍼 출제
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
				System.out.println("값의 개수가 적당하지 않습니다. 1개, 2개, 3개 중에서 입력해 주십시오.");
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
			System.out.println("매개변수가 너무 많습니다.");
		}*/
	}
}

class Calculate
{
	void cals(){
		System.out.println("매개변수가 없습니다.");
	}
	void cals(int a){
		System.out.println("정사각형의 넓이 : " + (a * a));
	}
	void cals(int a, int b){
		System.out.println("직사각형의 넓이 : " + (a * b));
	}
	void cals(int a, int b, int c){
		System.out.println("육면체의 넓이 : " + (a * b * c));
	}
}