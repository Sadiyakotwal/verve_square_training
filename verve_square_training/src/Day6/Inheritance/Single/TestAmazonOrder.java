package Day6.Inheritance.Single;

public class TestAmazonOrder {

	public static void main(String[] args) 
	{
	
		OrderProduct objOrderProduct = new OrderProduct();
		objOrderProduct.loginPage("sadiyakotwal10@gmail.com", "abc@123");
		objOrderProduct.mobileOrder("Samsung J7 Prime", 17000);
		objOrderProduct.laptopOrder("Asus", 70000);
		objOrderProduct.billPaid(17000, 70000);
		objOrderProduct.logoutPage("Logout");
		

	}

}
