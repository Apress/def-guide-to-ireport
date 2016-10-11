package examples;

public class Person {

	private String name = "";
	private int age = 0;
	
	public String getName()
	{
		return name;
	}	
	
	public int getAge()
	{
		return age;
	}
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
}