package Day6.Inheritance.Multilevel;

public class TestEclipseProjectCreationMultilevel
{
	public static void main(String[] args)
	{
		//Parent Class
		//Launch Eclipse
		CreateJaveProjectMultilevel objCreateJaveProjectMultilevel =new CreateJaveProjectMultilevel();
		objCreateJaveProjectMultilevel.clickEclipseIcon();
		objCreateJaveProjectMultilevel.launchWorkspace();
		//Child class
		//To select project
		//And display Project Window
		objCreateJaveProjectMultilevel.eclipseIDEWindow();
		objCreateJaveProjectMultilevel.projectWindowDisplay();
	
		//To create java project
		//To create package
		//to create class
		objCreateJaveProjectMultilevel.createNewProject();
		objCreateJaveProjectMultilevel.createPackage();
		objCreateJaveProjectMultilevel.createClass();
	}

}
