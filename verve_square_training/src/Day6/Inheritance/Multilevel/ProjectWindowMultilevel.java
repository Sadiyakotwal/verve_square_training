package Day6.Inheritance.Multilevel;

public class ProjectWindowMultilevel extends LaunchMultilevel
{
	public String strNewProject = "Java Project";
	public String strProjectWindowHeader ="Create a  Java Project";
	public String strProjectName = "Project Name : Inheritance";
	public String strPackageWindowHeader = "Java Package";
	public String strPackageName = "Multilevel\\Inheritance";
	public String strClassWindowHeader = "Java\\Class";
	public String strClassNmae = "Test";


	
	//Step 3:To select project
	public void eclipseIDEWindow()
	{
		System.out.println("\nProject Window Class  Output With 2 Methods:\n");
		System.out.println("\t2nd Window:Project Selection Window");
		System.out.println("----------------------------------------------");
		System.out.println(strProjectSelectionWindow);
		System.out.println("Project Explorer: " );
		for(int i=0;i<strProjectExplorer.length;i++)
		{
		System.out.print("\n "+strProjectExplorer[i]);
		}
		System.out.println("\nProject Explorer: "+strCreateProject);
		
	}
	//Strp 4:Project window dispkay
	public void projectWindowDisplay()
	{
		System.out.println("\n\t3rd Window: Java Project Window");
		System.out.println("--------------------------------------------");
		System.out.println("Project Window Heading :"+strJavaProjectHeading);
		System.out.print("Menu Bar :");
		for(int i=0;i<strMenuBar.length;i++)
		{
		System.out.print(strMenuBar[i]+" ");
		}
		System.out.println("\nFile Menu:");
		for(int i=0;i<strFile.length;i++)
		{
		System.out.print("\n "+strFile[i]);
		}
		
	}


}
