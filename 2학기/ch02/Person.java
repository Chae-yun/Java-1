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
		result = "���� " + lastName + ", �̸��� " + firstName + "�Դϴ�";
		return result;
	}�ɼ�*/
}

/*class PersonTest 
{
	public static void main(String[] args) 
	{
		Person per = new Person("��", "ä��");
		System.out.print(per);
	}
}*/