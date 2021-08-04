package Day7.Super.Keyword;

public class TestSuperKeyword {

	public static void main(String[] args)
	{
		System.out.println("Site: Java T Point");
		System.out.println("=========================");
		System.out.println("\nConstructors Invoked :");
		System.out.println("----------------------------");
		JavaTechnology objJavaTechnology = new JavaTechnology();
		objJavaTechnology.homepgaeList();
		System.out.println("\nInstance Variables:");
		System.out.println("----------------------------");
		objJavaTechnology.instanceVariablePrint();
		System.out.println("\nMethod Calling :");
		System.out.println("----------------------------");
		objJavaTechnology.parentClassMethodPrint();

	}

}
