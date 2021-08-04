package Day8.Abstraction;

public class TestAbstraction {

	public static void main(String[] args) 
	{
		System.out.println("\tVerve Square Testing Service");
		System.out.println("\t=====================================");
		System.out.println("\t\tUS Client");
		System.out.println("\t-----------------------------");
		//Reference of base class and object of child class
		BaseTest objBaseTest = new VerveSquare();
		objBaseTest.clientLoaction("US");
		USclient objUSclient = new USclient();
		objUSclient.getRequest();
		//Reference of base class
		objBaseTest.usClientApplication();
		System.out.println("\n\t\tCanada Client");
		System.out.println("\t-----------------------------");
		objBaseTest.clientLoaction("Canada");
		CanadaClient objCanadaClient = new CanadaClient();
		objCanadaClient.getRequest1();
		//Reference of base class
		objBaseTest.canadaClientApplication();
		
		
	}

}
