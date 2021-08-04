package Day6.Inheritance.Multilevel;

public class CreateJaveProjectMultilevel extends ProjectWindowMultilevel
{

	//Step 5:To create new java project
	public void createNewProject()
	{
		System.out.println("\n\n\nCreate Java Project Class  Output With 3 Methods:");
		System.out.println("\n\t4th Window: Create New Project Window");
		System.out.println("-------------------------------------------------");
		System.out.println("In file Menu:-->"+strNewProject);
		System.out.println("Project Window Header: "+strProjectWindowHeader);
		System.out.println(strProjectName);
	}
	
	//Step 6:To create a package in project
	public void createPackage()
	{
		System.out.println("\n\t5th Window: Package Window");
		System.out.println("------------------------------");
		System.out.println("Project Window Header: "+strPackageWindowHeader);
		System.out.println("Package Name: "+strPackageName);
	}
	
	
	//Step 7:To create class in package
	public void createClass()
	{
		System.out.println("\n\t6th Window: Class Window");
		System.out.println("------------------------------");
		System.out.println("Class Window Header: "+strClassWindowHeader);
		System.out.println("Class Name: "+strClassNmae);
	}
	
	
	
	
	
}
