package Day6.Inheritance.Multilevel;


/*To demonstrate Multilevel Inheritance using Eclipse IDE*/

public class LaunchMultilevel 
{
	//Instance Variables
	public String strWorkspacewindow = "Select a directory as Workspace";
	public String strBrowse = "Workspace : G\\Company\\Training\\java";
	public String strLaunchButton ="Launch";
	public String strCancelButton = "Cancel";
	public String strProjectSelectionWindow = "Eclipse IDE";
	public String strProjectExplorer[] = {"Create a maven project","Create a Web project","Create a project"};
	public String strCreateProject = "Create a project";
	public String strJavaProjectHeading = "java\\VerveSquareTraining";
	public String strMenuBar[] = {"File","Edit","Source","Refactor"};
	public String strFile[] = {"New","Open File","Recent File","Save"};
	
	//Step 1:To click
	public void clickEclipseIcon()
	{
		System.out.println("Launch Class Output With 2 Methods:\n");
		System.out.println("\t1st Window:Launch Window");
		System.out.println("----------------------------");
		System.out.println("Eclipse IDE Launcher:\n");
	}
	//Step 2:To launch Eclipse IDE
	public void launchWorkspace()
	{
		System.out.println(strWorkspacewindow);
		System.out.println(strBrowse+"\tBrowse....");
		System.out.print("\n\t\t\t\t"+strLaunchButton);
		System.out.println("\t\t"+strCancelButton+"\n");
	}	

}
