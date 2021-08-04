package Day2.control.statements;

import java.util.Scanner;

/*To check whether a person is vaccinated  for covid or not */

public class SwitchStatement
{
	public int intPerson_age;
	public void getPeronAge(int intPerson_age )
	{
		System.out.println("Enter age of person");
		Scanner sc = new Scanner(System.in);
		intPerson_age = sc.nextInt();
		if(intPerson_age <= 100 && intPerson_age > 60)
			System.out.println("The person is vaccinated an old age person and age is:"+intPerson_age);
		else if(intPerson_age >= 21 && intPerson_age <= 60)
			System.out.println("The person is vaccinated an adult and age is:"+intPerson_age );
		else
			System.out.println("The person is  not vaccinated a teenage and age is :"+intPerson_age );
		
	}
	
	//Switch Statement 
	public void  getPersonType(String strType)
	{
		switch(strType)
		{
		case "oldAge" :
			this.getPeronAge(intPerson_age);
			break;
			
		case "Adult":
			this.getPeronAge(intPerson_age);
			break;
		
		case "Teenage":	
			this.getPeronAge(intPerson_age);
			break;
		
		default:
			System.out.println("Invalid input: ");
		
		
		}
	}
	

}
