package Day1.DataTypes.TypeCasting;
/*To perform operations on different data types
 * Byte-1 byte memory-range:-127 to 127
 * Short-          -range:-32768 to 32767
 * int- upto 10 digit number-range:
 * long-upto 19 digit-range:
 * char- 2 bytes memory-range:0 to 65535
 * */

public class ass1DataTypes
{
	//Integer type
	int a = 10;
	//Short  type
	short s1 = -1;
	//Float type 
	float f1= 3.5f;
	float f2 = (float)8.9;
	//Double type
	double d1= 6788;
	double d2 = 'a';
	//Long type
	long l1 = 1234567899246L;
	long l2 = 16626;
	//Char type
	char c = 'A';
	//10 = \n
	char c1 = 10;
	//Boolean type
	boolean bvalue = true;
	boolean bvalue1 = 10>20;
	//Byte type
	byte b1 =126;
	//String class
	String str = "Java";
	
	
	//To perform addition 
	public void addMethod()
	{
		System.out.println("Addition of all Types ");
		System.out.println("-------------------------------");
		System.out.println("Addition of Integer and Short :\n"+(a+s1));
		System.out.println("Addition of Integer and Float :\n"+(a+f1));
		System.out.println("Addition of Integer and Float :\n"+(a+f2));
		System.out.println("Addition of Integer and double :\n"+(a+d1));
		System.out.println("Addition of Integer and Double :\n"+(a+d2));
		System.out.println("Addition of Integer and long :\n"+(a+l1));
		System.out.println("Addition of Integer and long :\n"+(a+l2));
		System.out.println("Addition of Integer and char :\n"+(a+c));
		System.out.println("Addition of Integer and Byte :\n"+(a+b1)+"\n");
	}
	
	//To perform addition 
	public void subtractionMethod()
	{
		System.out.println("Substraction of all Types ");
		System.out.println("-------------------------------");
		System.out.println("Subtraction of Integer and Short :\n"+(a-s1));
		System.out.println("Subtraction of Integer and Float :\n"+(a-f1));
		System.out.println("Subtraction of Integer and Float :\n"+(a-f1));
		System.out.println("Subtraction of Integer and Double :\n"+(a-d1));
		System.out.println("Subtraction of Integer and Double :\n"+(a-d1));
		System.out.println("Subtraction of Integer and Long :\n"+(a-l1));
		System.out.println("Subtraction of Integer and Long :\n"+(a-l2));
		System.out.println("Subtraction of Integer and Char :\n"+(a-c));
		System.out.println("Subtraction of Integer and Byte :\n"+(a-b1)+"\n");
			
	}
	
	//To perform Multiplication
	public void multiplicationMethod()
	{
		System.out.println("Multiplication of all Types ");
		System.out.println("-------------------------------");
		System.out.println("Multiplication of Integer and Short :\n"+(a*s1));
		System.out.println("Multiplication of Integer and Float :\n"+(a*f1));
		System.out.println("Multiplication of Integer and Float :\n"+(a*f1));
		System.out.println("Multiplication of Integer and Double :\n"+(a*d1));
		System.out.println("Multiplication of Integer and Double :\n"+(a*d1));
		System.out.println("Multiplication of Integer and Long :\n"+(a*l1));
		System.out.println("Multiplication of Integer and Long :\n"+(a*l2));
		System.out.println("Multiplication of Integer and Char :\n"+(a*c));
		System.out.println("Multiplication of Integer and Byte :\n"+(a*b1)+"\n");
			
	}
	
	//To perform Division
		public void divisionMethod()
		{
			System.out.println("Division of all Types ");
			System.out.println("-------------------------------");
			System.out.println("Division of Integer and Short :\n"+(a/s1));
			System.out.println("Division of Integer and Float :\n"+(a/f1));
			System.out.println("Division of Integer and Float :\n"+(a/f1));
			System.out.println("Division of Integer and Double :\n"+(a/d1));
			System.out.println("Division of Integer and Double :\n"+(a/d1));
			System.out.println("Division of Integer and Long :\n"+(a/l1));
			System.out.println("Division of Integer and Long :\n"+(a/l2));
			System.out.println("Division of Integer and Char :\n"+(a/c));
			System.out.println("Division of Integer and Byte :\n"+(a/b1)+"\n");
				
		}
		

	public static void main(String[] args) 
	{

		ass1DataTypes  ass1DataTypes = new ass1DataTypes();
		//Addition of all data types
		ass1DataTypes.addMethod();
		//Substracion of all data types
		ass1DataTypes.subtractionMethod();
		//Multiplication of all data types
		ass1DataTypes.multiplicationMethod();
		//Division of all data types
		ass1DataTypes.divisionMethod();

		
	}

}
