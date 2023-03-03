package corejava;

public class PersonInheritance
{

	public static void main(String[] args)
	{
		//object
		GraduateStudent g = new GraduateStudent("Sachin", 20, 45, "Java", "Anju Maam","Webdevelopment");
		//values
		g.setName("Sachin");
		g.setAge(20);
		g.setId(45);
		g.setMajor("Java");
		g.setAdvisor("Anju Maam");
		g.setThesistopic("Webdevelopment");
		//output
		System.out.println("Name:"+g.getName()+"\n"+"Age:"+g.getAge()+"\n"+"Id:"+g.getId()+"\n"+"Major:"+g.getMajor()+"\n"+"Advisor:"+g.getAdvisor()+"\n"+"Thesistopic:"+g.getThesistopic());
		
	}

}
