class SwitchExam5 
{
	public static void main(String[] args) 
	{
		int a=Integer.parseInt(args[0]);
		/*switch(a){
			case 1: case 2:
				System.out.println(a+"반은 ~세젤예~인터랙티브미디어과♥"); break;
			case 3: case 4:
				System.out.println(a+"반은 뉴미디어디자인과"); break;
			case 5: case 6:
				System.out.println(a+"반은 뉴미디어솔루션과"); break;
		}*/
		if(a==1 || a==2){ // '|' 기호를 두 개 써야 효율적 a가 1이면 a가 2인지 비교안해도 되기 때문
			System.out.println(a+"반은 ~세젤예~인터랙티브미디어과♥");
		}else if(a==3 || a==4){
			System.out.println(a+"반은 뉴미디어디자인과");
		}else if(a==5 || a==6){
			System.out.println(a+"반은 뉴미디어솔루션과");
		}
	}
}
