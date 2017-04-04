class Person
{
	private String lastName;
	private String firstName;
	public Person(String last, String first){
		lastName = last;
		firstName = first;
	}
	String getLastName(){
		return lastName;
	}
	String getFirstName(){
		return firstName;
	}
	int getLength(){
		int length = lastName.length() + firstName.length();
		return length;
	}
	/*public String toString(){
		String result;
		result = "성은 " + lastName + ", 이름은 " + firstName + "입니다";
		return result;
	}옵션*/
}

/*class PersonTest 
{
	public static void main(String[] args) 
	{
		Person per = new Person("양", "채윤");
		System.out.print(per);
	}
}*/