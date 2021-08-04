package Day4.StringMethods.FacebookAss;


/* To Demonstrate  all string methods
 * 
 * String[] strBrandsHeadset1 = {"Sonny","Phillips","SkullCandy","Beats","Boat","JBL"};
	String[] strBrandsTv1 = {"Sony","phillips","Samsung","LG","Videocon","Panasonic"};
	
 * 
 * 
 * */
public class StringMethods 
{
	
	//String with different brand names
	String strBrandsHeadset = "Sony";
	String strBrandsHeadset1 ="Boat";
	String strBrandsTv = "Sony";
	String strBrandsTv1 ="sOnY";
	
	//String comparision methods
	public void stringComparision()
	{
		//Equals method
		System.out.println("Equals Method ");
		System.out.println("-------------------");
		if(strBrandsHeadset.equals(strBrandsTv))
				{
				System.out.println("The 2 strings are equal: \n"+"String 1 Headset :"+strBrandsHeadset+"\n"+"String 2 Tv :"+strBrandsTv +"\n");
				}
		
		

		//EqualsIgnore  method
		System.out.println("EqualsIgnoreCase Method ");
		System.out.println("-------------------");
		if(strBrandsHeadset.equalsIgnoreCase(strBrandsTv1))
				{
				System.out.println("The 2 strings are equal: \n"+"String 1 Headset :"+strBrandsHeadset+"\n"+"String 2 Tv :"+strBrandsTv1 +"\n");
				}
		
		//Compare method
		System.out.println("By compareTo method: ");
		System.out.println("--------------");
		System.out.println("String 1 Headset :"+strBrandsHeadset+"\nString 2 Headset 1 :"+strBrandsHeadset1+"\nThe Element returns Difference if 2 Strings are different :\n"+strBrandsHeadset.compareTo(strBrandsHeadset1)+"\n");
		

		//Compare method
		System.out.println("By compareIgnore Case method: ");
		System.out.println("--------------");
		System.out.println("String 1 Headset :"+strBrandsHeadset+"\nString Tv :"+strBrandsTv1+"\nThe Element returns 0 value if Strings are equal :\n"+strBrandsHeadset.compareToIgnoreCase(strBrandsTv1)+"\n");	
	}
	
	
	//Char methods
	String strBrandsHeadset2 = "SkullCandy";

	public void charAllMethods()
	{
		
		//CharAt method
		System.out.println("CharAt Method ");
		System.out.println("-------------------");
		System.out.println("The character at index 3 element: ");
		System.out.println("String 1 Headset :"+strBrandsHeadset2+"\n"+strBrandsHeadset2.charAt(3)+"\n");
		
		//To get first and last element of String
		System.out.println("First element and Last Element ");
		System.out.println("-------------------------------");
		System.out.println("First element of String 1: "+strBrandsHeadset2+"\n"+strBrandsHeadset2.charAt(0));
		System.out.println("Last element of String 1 :"+strBrandsHeadset2+"\n"+strBrandsHeadset2.charAt((strBrandsHeadset2.length())-1)+"\n");
		
		//CodePointAt method
		System.out.println("Get Unicode code Point of particular Letter ");
		System.out.println("--------------------------------------------");
		System.out.println("The unicode code point of a letter is: ");
		System.out.println("String 1: "+strBrandsHeadset2+"\tUnicode Code Point of letter K:"+strBrandsHeadset2.codePointAt(1)+"\n");

		//To char Array
		System.out.println("Convert to Char Array ");
		System.out.println("-----------------------");
		System.out.println("Conver the String 1 into character Array");
		System.out.println("String 1: "+strBrandsHeadset2);
		char[] charBrandsHeadset2 = strBrandsHeadset2.toCharArray();
		System.out.println("Character Array: ");
		for(char c:charBrandsHeadset2)
		{
			System.out.print(c+" ");
		}
		System.out.println("\n");
	}
	
	
	//Split Methods
	String strBrandsHeadset3 = " Sonny@ Phillips@SkullCandy@Beats@Boat@JBL  ";
	
	public void splitTrimMethod()
	{
		//Split method
		System.out.println("By Using Split Method ");
		System.out.println("-----------------------");
		String[] strArr = strBrandsHeadset3.split("@", 6);
		System.out.println("String 1: "+strBrandsHeadset3);
		System.out.println("After splitting: ");
		for(String s:strArr)
		{
			System.out.println(s);
		}
		
		//Trim method
		System.out.println("By Using Trim Method ");
		System.out.println("-----------------------");
			
		
	}

	public static void main(String[] args)
	{
		
		StringMethods objStringMethods = new StringMethods();
		//Comparision Methods
		objStringMethods.stringComparision();
		//Character methods
		objStringMethods.charAllMethods();
		//Split MEthod
		objStringMethods.splitTrimMethod();
	}

}
