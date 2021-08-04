package Day6.MethodOverloading;

public class TestClass {

	public static void main(String[] args) 
	{
		Bus objBus = new Bus();
		objBus.headingClass();
		objBus.bus("10", 4, "40Km/Hr");
		objBus.bus("12", "Available", "50Km/Hr", 4);
		
	}

}
