class PointEx
{
	public static void main(String[] args) 
	{
		Point p = new Point(5.7, 6.3);
		System.out.println("이동 전 " + p);
		p.moveXY(3.0, 5.0);
		System.out.println("각각 " + 3.0 + ", " + 5.0 + " 이동 후 " + p); //코드재사용했다!
	} 
}
