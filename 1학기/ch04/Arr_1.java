class Arr_1 
{
	public static void main(String[] args) 
	{
		/*int[] hakbun = new int[4]; //4개 지정
		hakbun[0]=1101;
		hakbun[1]=1102;
		hakbun[2]=1103;
		hakbun[3]=1104;*/
		int[] hakbun={1101,1102,1103,1104}; //위에보다 더 짧고 간단
		for (int i=0 ; i<hakbun.length ; i++) //print문을 4번쓰는 것보다 for문 쓰는 것이 간결
		{
			System.out.println(hakbun[i]);
		}
	}
}
