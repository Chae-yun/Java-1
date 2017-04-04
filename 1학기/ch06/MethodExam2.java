import java.util.Scanner;
class MethodExam2 
{
	public static void main(String[] args) 
	{
		System.out.print("노래방 번호를 입력하시오 : ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(findSong(n));
	}
	public static String findSong(int n){
		String songname="";
		if(n==10000){
			songname="마음 - 아이유";
		}
		else if(n==10001){
			songname="품행제로 - 블락비 바스타즈";
		}
		else if(n==10002){
			songname="I NEED YOU - 방탄소년단";
		}
		else if(n==10003){
			songname="Loser - 빅뱅";
		}
		else if(n==10004){
			songname="BAEBAE - 빅뱅";
		}
		else if(n==10005){
			songname="Call Me Baby - 엑소";
		}
		else if(n==10006){
			songname="좋은 날 - 아이유";
		}
		else if(n==10007){
			songname="으르렁 - 엑소";
		}
		else{
			songname="그 번호는 저희 노래방에 없습니다.";
		}
		return songname;
	}
}
