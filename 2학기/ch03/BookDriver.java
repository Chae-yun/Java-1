class Book
{
	private String title;
	private String author;
	private int price;

	public Book(String title, String author, int price){
		setTitle(title);
		setAuthor(author);
		setPrice(price);
	}

	public String getTitle(){
		return title;
	}

	public String getAuthor(){
		return author;
	}

	public int getPrice(){
		return price;
	}

	public void setTitle(String t){
		title=t;
	}

	public void setAuthor(String a){
		author=a;
		//this.author=author;
	}

	public void setPrice(int p){
		price=p;
	}

	public String toString()
	{
		return("책 제목 : "+getTitle()+" , "+"저자 : "+getAuthor()+" , "+"가격 : "+getPrice());
		//return("책 제목 : "+title()+" , "+"저자 : "+author()+" , "+"가격 : "+price());

	}
}


class BookDriver
{
	public static void main(String[] args) 
	{
		
		Book b=new Book("독서법","채석용",8400);
		System.out.println(b);

		b.setPrice(10200);

		System.out.println(b);

		
	}
}
