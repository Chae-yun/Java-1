class Absolute // 절대값
{
	//속성(특징)
	int x;
    //메서드(행위): 접근제어자 리턴타입 메서드이름(매개변수)
	public int getAbs(int x){
	    if(x>=0)
		{
			return x;
		}
		else //a<0
		{
			return x*-1; 
		}
	}
}
