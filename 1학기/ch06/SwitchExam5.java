class SwitchExam5 
{
	public static void main(String[] args) 
	{
		int a=Integer.parseInt(args[0]);
		/*switch(a){
			case 1: case 2:
				System.out.println(a+"���� ~������~���ͷ�Ƽ��̵�����"); break;
			case 3: case 4:
				System.out.println(a+"���� ���̵������ΰ�"); break;
			case 5: case 6:
				System.out.println(a+"���� ���̵��ַ�ǰ�"); break;
		}*/
		if(a==1 || a==2){ // '|' ��ȣ�� �� �� ��� ȿ���� a�� 1�̸� a�� 2���� �񱳾��ص� �Ǳ� ����
			System.out.println(a+"���� ~������~���ͷ�Ƽ��̵�����");
		}else if(a==3 || a==4){
			System.out.println(a+"���� ���̵������ΰ�");
		}else if(a==5 || a==6){
			System.out.println(a+"���� ���̵��ַ�ǰ�");
		}
	}
}
