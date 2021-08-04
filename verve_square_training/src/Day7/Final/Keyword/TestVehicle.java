package Day7.Final.Keyword;

public class TestVehicle {

	public static void main(String[] args) 
	{
		
		Vehicle objVehicle = new Vehicle();
		System.out.println("For Variable");
		System.out.println("----------------");
		objVehicle.vehicle();
		System.out.println("\nFor Method");
		System.out.println("----------------");
		objVehicle.wheelsCar("4");
		System.out.println("\nFor Class Final");
		System.out.println("----------------");
		Car objCar = new Car();
		objCar.carClass();
		
		
		
		
		
		

	}

}
