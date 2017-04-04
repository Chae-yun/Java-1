class Fruit 
{
	private int apple;
	private int straw;
	private int grapes;
	private int sum;
	public int getApple(){
		return apple;
	}
	public int getStraw(){
		return straw;
	}
	public int getGrapes(){
		return grapes;
	}
	public void setApple(int newA){
		apple = newA;
	}
	public void setStraw(int newS){
		straw = newS;
	}
	public void setGrapes(int newG){
		grapes = newG;
	}
	public Fruit(int apple, int straw, int grapes){
		this.apple = apple;
		this.straw = straw;
		this.grapes = grapes;
	}
	public int count(){
		sum = apple + straw + grapes;
		return sum;
	}
}
