package Day7.Super.Keyword;

public class JavaTechnology extends JavaTPointHomePage
{
	
	//Child Class Constructor
	JavaTechnology()
	{
		super();
		System.out.println("This is Child class Constructor: JavaTechnology\n");
		
	}
	
	//To call Instance Variable
	
	public void instanceVariablePrint()
	{
		System.out.println("Instance Variable: Without Super keyword"+"\n"+strList.get(1));
		System.out.println("Instance Variable: By Super Keyword"+" \n"+super.strHomePageLogo);
	}

	
	//To call method
	public void parentClassMethodPrint()
	{
		System.out.println("Parent Class Method:");
		super.javaTechnology();
	}

}
