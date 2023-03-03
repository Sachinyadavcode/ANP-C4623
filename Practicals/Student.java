package corejava;

class Student extends Person
{
	//Creating Fields
	private int Id;
	private String Major;
	//Creating parameterized constructors
	public Student(String name, int age, int id, String major) 
	{
		super(name, age);
		Id = id;
		Major = major;
	}
	//Getters and Setters
	public int getId() 
	{
		return Id;
	}
	public void setId(int id)
	{
		Id = id;
	}
	public String getMajor() 
	{
		return Major;
	}
	public void setMajor(String major) 
	{
		Major = major;
	}	
	
}
