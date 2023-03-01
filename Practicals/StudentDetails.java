package corejava;

public class StudentDetails 
{

	public static void main(String[] args)
	{
		// creating object of class StudentData
		StudentData a=new StudentData();
		// object is used to access the methods of a class
		a.setId(1);
		a.setName("Sachin");
		a.setAge(20);
		System.out.println("StudentId:"+a.getId()+"\n"+"StudentName:"+a.getName()+"\n"+"StudentAge:"+a.getAge());

	}

}