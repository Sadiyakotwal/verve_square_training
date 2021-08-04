package Day1.DataTypes.TypeCasting;

/*To demonstrate Type conversion using Laptop brands
 * String s ={"Asus","Dell","hp","Apple","Microsoft"};
 */

public class PersonalDataConv 
{
	
	public void stringToOther() 
	{
		String strInt= "200";
		String strInt1 ="Asus";
		String strLong ="39893987398";
		String strFloat = "25.6";
		String strDouble = "2345.7868576";
		String strChar ="Asus";

		System.out.println("String to other Types ");
		System.out.println("----------------------------");
		//String to integer
		int StringToInt = Integer.parseInt(strInt);
		System.out.println("String to Int :"+StringToInt);
		//String to Int using value of method
		Integer StringToInt1 = Integer.valueOf(strInt);
		System.out.println("String to Int Using value of : "+StringToInt1);
		//Throws number format exception if String of char is passed 
		//int StringToInt3 = Integer.parseInt(strInt1);
		//System.out.println("String to int if String contains alphabets :"+StringToInt3);
		//String to Long
		long Stringtolong = Long.parseLong(strLong);
		System.out.println("String to long :"+Stringtolong);
		//String to Float
		float StringToFloat = Float.parseFloat(strFloat);
		System.out.println("String to Float :"+StringToFloat);
		//String to Double
		double StringToDouble = Double.parseDouble(strDouble);
		System.out.println("String to Double :"+StringToDouble);
		//String to Char
		char StringToChar = strChar.charAt(3);
		System.out.println("String to Char :"+StringToChar);
		System.out.println("String to char Using CharAt:");
		for(int i=0; i<strChar.length();i++)
		{  
	        char strToChar = strChar.charAt(i);  
	        System.out.println("char at "+i+" index is: "+strToChar);  
		}
		System.out.println("String to char Array using toCharArray() method:");
		char[] ch = strChar.toCharArray();    
		for(int i=0;i<ch.length;i++)
		{    
			System.out.println("char at "+i+" index is: "+ch[i]);   
		}
		//String to object
		Object StringToObject = strChar;
		System.out.println("String to object:"+StringToObject);
		
	}

	public void stringToDtae()
	{
		
	}
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) throws Exception 
	{
		PersonalDataConv objPersonalDataConv =new PersonalDataConv();
		objPersonalDataConv.stringToOther();
		System.out.println("String to object:");
		Class c = Class.forName("java.lang.String");  
		System.out.println("class name: "+c.getName());  
		System.out.println("super class name: "+c.getSuperclass().getName());  
		
	}

}
