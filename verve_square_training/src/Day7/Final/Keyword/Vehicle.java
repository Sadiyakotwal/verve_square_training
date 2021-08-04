package Day7.Final.Keyword;

public class Vehicle 
{
	//Instance Variable
	final String strVehicleName="ABC";
	String strWheels;
	
	public void vehicle()
	{
		//strVehicleName = "Luxury BUs";
		System.out.println("Vehicle Is Final :"+strVehicleName);
	}
	
	final public void wheelsCar(String strWheels)
	{
		System.out.println("This is Final Method :");
		System.out.println("Car Wheels :"+strWheels);
		
	}
	
}
