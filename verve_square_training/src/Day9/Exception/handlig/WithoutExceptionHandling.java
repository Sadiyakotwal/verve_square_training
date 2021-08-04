package Day9.Exception.handlig;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WithoutExceptionHandling 
{
	 public int intArray[] = {20,30,40,50};
	 public String str = "Exception Handling";
	//Array out of bound exception
	public void verifyArrayWithoutException(int intINdexNo)
	{
		System.out.println("Array index out of bound without exception handling:");
		System.out.println("-----------------------------------------------------");
		System.out.println("Array is: ");
		for(int i=0;i<intArray.length;i++)
		{
			System.out.println(intArray[i]);
		}
		System.out.println("Array element at particular index: "+intArray[intINdexNo]);
		
	}
	
	//String index out of bound exception
	public void verifyStringIndexException()
	{
		System.out.println("String index out of bound without exception handling:");
		System.out.println("-----------------------------------------------------");
		System.out.println("String element at at: "+str.charAt(20));
	}
	
	//File not found Exception
	public void verifyFileWithoutException() throws FileNotFoundException
	{
		System.out.println("File not found exception without exception handling:");
		System.out.println("-----------------------------------------------------");

		Scanner file_not_present = new Scanner (new File("abc.txt"));
	}
	
	
	//Null pointer exception
	public void verifyNullPointerWithoutException()
	{
		System.out.println("Null pointer exception without exception handling:");
		System.out.println("-----------------------------------------------------");
		String str = null;
		System.out.println("String is:"+str.length());
	}
	
	//Number format exception
	public void verifyNumberFormatWithoutException()
	{
		System.out.println("Number Format exception without exception handling:");
		System.out.println("-----------------------------------------------------");
		System.out.println("String is:"+str);
		int intStringToNo = Integer.parseInt(str);
	}
		
}
