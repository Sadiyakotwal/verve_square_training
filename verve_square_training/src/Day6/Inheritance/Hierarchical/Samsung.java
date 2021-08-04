package Day6.Inheritance.Hierarchical;

public class Samsung 
{
	public String strFrontCamera;
	public String strRearCamera;
	public int intBaseModel;
	
	
	public void frontCamera(String strFrontCamera,int intBaseModel)
	{
		System.out.println("\tBase SamSung Mobile:");
		System.out.println("Model No.:"+intBaseModel);
		System.out.println("Front Camera:"+strFrontCamera);
		
	}
	public void rearCamera(String strRearCamera,int intBaseModel)
	{
		
		System.out.println("Rear Camera:"+strRearCamera+"\n");
		
	}
}
