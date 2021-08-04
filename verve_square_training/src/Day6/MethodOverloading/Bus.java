package Day6.MethodOverloading;

public class Bus extends Vehicle
{
	
	public void bus(String strWindows,int strWheels,String strSpeed)
	{
		System.out.println("\tSt Bus:");
		System.out.println("Windows: "+strWindows);
		System.out.println("Wheels: "+strWheels);
		System.out.println("AC: Not Available");
		System.out.println("Speed: "+strSpeed+"\n");
		
	}
	public void bus(String strWindows, String strAc,String strSpeed,int strWheels)
	{
		System.out.println("\tLuxury Bus:");
		System.out.println("Windows: "+strWindows);
		System.out.println("Wheels: "+strWheels);
		System.out.println("Ac: "+strAc);
		System.out.println("Speed: "+strSpeed);
	}
	

}
