package Day6.Inheritance.Single;

public class OrderProduct extends AmazonLoginPage
{
	//Step 4 :To order a mobile
	public void mobileOrder(String strMobile,int intMobileBill)
	{
		System.out.println("\n\tOrder Placed : Mobile");
		System.out.println("Mobile Name:"+strMobile);
		System.out.println("Mobile Payment:"+intMobileBill);
	}
	
	//Step 5: To order a laptop
	public void laptopOrder(String strLaptop,int intLaptopBill)
	{
		System.out.println("\n\tOrder Placed : Laptop");
		System.out.println("Laptop Name:"+strLaptop);
		System.out.println("Laptop Payment:"+intLaptopBill+"\n");

		
	}
	//Step 6:Pay Bill
	public void billPaid(int intMobileBill,int intLaptopBill)
	{
		System.out.println("\tBill Paid for Products:");
		intTotalBill = intMobileBill + intLaptopBill;
		System.out.println("Total Bil:"+intTotalBill);
	}
	//Step 7:Logout
	public void logoutPage(String strLogout)
	{
		System.out.println("\n\t"+strLogout);
		
	}
	
	
	

}
