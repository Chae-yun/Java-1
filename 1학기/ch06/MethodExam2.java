import java.util.Scanner;
class MethodExam2 
{
	public static void main(String[] args) 
	{
		System.out.print("�뷡�� ��ȣ�� �Է��Ͻÿ� : ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(findSong(n));
	}
	public static String findSong(int n){
		String songname="";
		if(n==10000){
			songname="���� - ������";
		}
		else if(n==10001){
			songname="ǰ������ - ����� �ٽ�Ÿ��";
		}
		else if(n==10002){
			songname="I NEED YOU - ��ź�ҳ��";
		}
		else if(n==10003){
			songname="Loser - ���";
		}
		else if(n==10004){
			songname="BAEBAE - ���";
		}
		else if(n==10005){
			songname="Call Me Baby - ����";
		}
		else if(n==10006){
			songname="���� �� - ������";
		}
		else if(n==10007){
			songname="������ - ����";
		}
		else{
			songname="�� ��ȣ�� ���� �뷡�濡 �����ϴ�.";
		}
		return songname;
	}
}
