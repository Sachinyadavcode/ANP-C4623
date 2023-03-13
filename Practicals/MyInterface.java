package corejava1;


interface MyInterface
{
	public void doSomething();
}
class MyClass implements MyInterface
{

	
	public void doSomething() 
	{
		System.out.println("doing something...");
	}	
}
class MyMain
{
	public static void main(String[] args)
	{
		MyClass m= new MyClass();//Creating object of class MyClass
		m.doSomething();//Calling method() of interface		
	}
}