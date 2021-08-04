package Day8.Interface;

import java.util.ArrayList;
import java.util.Arrays;

public class Engineering  implements CSEngineering,ENTCEngineering
{

	@Override
	public void firstYear() 
	{
		System.out.println("\tCSE Engineering");
		ArrayList<String> strSubjects = new ArrayList<String>(Arrays.asList("Applied Mathematics -1"," Applied Physics - 1"," Introduction to Programming","Communication Skills"));
		System.out.println("Subjects of 1st Year are: ");
		System.out.println(strSubjects);	
	}

	@Override
	public void secondYear() 
	{
		ArrayList<String> strSubjects = new ArrayList<String>(Arrays.asList("Microprocessor Architecture","Object Oriented and multicore Programming","Engineering Maths III.","Soft Skills"));
		System.out.println("Subjects of 2nd Year are: ");
		System.out.println(strSubjects);
	
		
	}

	@Override
	public void thirdYear() 
	{
		System.out.println("\n\tENTC Engineering");
		ArrayList<String> strSubjects = new ArrayList<String>(Arrays.asList("Electronic Devices"," Linear Integrated Circuits and Applications","Digital Communication","Microcontroller"));
		System.out.println("Subjects of 3rd Year are: ");
		System.out.println(strSubjects);	
	}

	@Override
	public void fourthYear() 
	{
		ArrayList<String> strSubjects = new ArrayList<String>(Arrays.asList("Image Processing"," VLSI Design","Satellite Communication","Data Analytics"));
		System.out.println("Subjects of 4th Year are :");
		System.out.println(strSubjects);	
	}
		
		
}
