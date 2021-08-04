package Day9.Exception.handlig;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WithExceptionHandling extends WithoutExceptionHandling
{
	public void verifyArrayWithExceptionHandling(int intINdexNo)
	{
		try 
		{
			System.out.println("Array index out of bound with exception handling:");
			System.out.println("-----------------------------------------------------");
			for(int i=0;i<intArray.length;i++)
			{
				System.out.println(intArray[i]);
			}
			System.out.println("Array element at particular index: "+intArray[intINdexNo]);
			
		}
		catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException)
		{
			System.out.println("The index entered is invalid: "+intINdexNo);
			System.out.println("Array size is only: "+intArray.length);
		}
		finally
		{
			System.out.println("\nFinally block is executed in all conditions.....");
		}
		
	}
	public void verifyStringIndexExceptionHandling()
	{
		System.out.println("\nString index out of bound with exception handling:");
		System.out.println("-----------------------------------------------------");
		try 
		{
			System.out.println("String element at at: "+str.charAt(20));

			
		} 
		catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException ) 
		{
			System.out.println("String :"+str);
			System.out.println("String index 20 not available...");
		}
	}
	
	
	public void verifyFileWithException()
	{
		System.out.println("\nFile not found exception with exception handling:");
		System.out.println("-----------------------------------------------------");
		try {
			
			Scanner file_not_present = new Scanner (new File("abc.txt"));

			}
		catch (FileNotFoundException fileNotFoundException) 
		{
			
			System.out.println("The file abc is not available: ");
			
		} 
	}
	
	
	public void verifyNullPointerWithException()
	{
		String str = null;
		System.out.println("\nNull pointer exception with exception handling:");
		System.out.println("-----------------------------------------------------");
		try
		{
			System.out.println("String is:"+str.length());	
		} 
		catch (NullPointerException nullPointerException)
		{
			
			System.out.println("Null pointer Exception Occured.....");
			System.out.println("String is: "+str);
		}
		
	}
	public void verifyNumberFormatWithExceptionHandling()
	{
		System.out.println("\nNumber Format exception with exception handling:");
		System.out.println("-----------------------------------------------------");
		try
		{
			
			System.out.println("String is:"+str);
			int intStringToNo = Integer.parseInt(str);	
			
		} 
		catch (NumberFormatException numberFormatException ) 
		{
			
			System.out.println("As it is string cannot be converted to int....");
		}
		
	}
	
}
