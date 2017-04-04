class  For1to10 //Assign_Op¶û °°´ç
{
	public static void main(String[] args) 
	{
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			sum+=1;
		}
		System.out.println(sum);
		//10!=1*2*3*4*...*10
		int gob=1;
		for (int i=1;i<=10;i++)
		{
			gob*=i;
		}
		System.out.println(gob);
	}
}
