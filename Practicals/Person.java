package corejava;

public class Person
{
	//Fields
	private String name;
	private int age;
	//creating parameterized constructor
		public Person(String name, int age) 
		{
		super();
		this.name = name;
		this.age = age;
	    }
		
	//create getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}


