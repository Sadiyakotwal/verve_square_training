package Day1.DataTypes.TypeCasting;
/*To perform operation on type convertions
 * 
 */

public class ass2TypeConv
{
	          /*Integer to other data types*/
	//Int to long
	int x = 65;
	long y= x;
	long r1 = x-y;
	//Int to float
	float f1 = x;
	float r2 = f1+x;
	//Int to double
	double d1 = x;
	double r3 = d1*x;
	//Int to byte
	byte b = (byte)x;
	//Int to char
	char c1 = (char)x;
	//Int to short
	short s1 = (short)x;
	//Int to boolean
	//boolean b1 = (boolean)x;
	//Int to string
	//String s11 = (String)x;
	
	//Short to int
	static short s2 = -98;
	static short s3 = 67;
	static int x1 = s2;
	static int x2 = s3;
	//Short to float
	static float f2 = s2;
	static float f3 = (float)s3;
	//Short to double
	static double d2 = s2;
	static double d3 = (double)s3;
	//Short to char
	//char c2 = s2;
	static char c3 = (char)s3;
	//Short to bolean
	//boolean b1 = (boolean)s2;
	//Short to byte
	static byte b1 = (byte)s2;
	static byte b2 = (byte)s3;
	
	void float_otherType()
	{
		//Float to int
		float f4 = 69.99f;
		int i1= (int)f4;
		//Float to short
		short s4 = (short)f4;
		//Float to double
		double d4 = f4;
		//Float to long 
		long l1 = (long)f4;
		//Float to char
		char c4= (char)f4;
		//Float to byte
		byte b3 = (byte)f4;
		
		System.out.println("Float to int :");
		System.out.println("f4 = "+f4);
		System.out.println("i1 = "+i1);
		
		System.out.println("Float to short :");
		System.out.println("f4 = "+f4);
		System.out.println("s4 = "+s4);

		System.out.println("Float to long:");
		System.out.println("f4 = "+f4);
		System.out.println("l1 = "+l1);

		System.out.println("Float to double :");
		System.out.println("f4 = "+f4);
		System.out.println("d4 = "+d4);

		System.out.println("Float to char :");
		System.out.println("f4 = "+f4);
		System.out.println("c4 = "+c4);

		System.out.println("Float to byte :");
		System.out.println("f4 = "+f4);
		System.out.println("b3 = "+ b3);
		
	}
	
	
	void Using_parseInt_otherType()
	{
		
		//String to integer
		String s1 = "200";
		int string_to_int = Integer.parseInt(s1);
		System.out.println("String to integer is: "+string_to_int);
		
		//String to float
		float string_to_float = Float.parseFloat(s1);
		System.out.println("String to float: "+string_to_float);
		
		//String to double
		double string_to_double = Double.parseDouble(s1);
		System.out.println("String to douuble: "+string_to_double);	
		
		//String to long
		long string_to_long = Long.parseLong(s1);
		System.out.println("String to long: "+string_to_long);	
		
		
	}
	
	
	
	public static void main(String[] args)
	{
		
		ass2TypeConv  ass2TypeConv = new ass2TypeConv();
		
		System.out.println("Integer to long :");
		System.out.println("x = "+ass2TypeConv.x);
		System.out.println("y = "+ass2TypeConv.y);
		System.out.println("Substraction of int and long:"+ass2TypeConv.r1);

		
		System.out.println("Integer to float :");
		System.out.println("x = "+ass2TypeConv.x);
		System.out.println("f1 = "+ass2TypeConv.f1);
		System.out.println("Addition of int and float:"+ass2TypeConv.r2);

	
		System.out.println("Integer to double :");
		System.out.println("x = "+ass2TypeConv.x);
		System.out.println("d1 = "+ass2TypeConv.d1);
		System.out.println("Multiplication of int and double:"+ass2TypeConv.r3);

		
		System.out.println("Integer to byte :");
		System.out.println("x = "+ass2TypeConv.x);
		System.out.println("b = "+ass2TypeConv.b);
		
		System.out.println("Integer to char :");
		System.out.println("x = "+ass2TypeConv.x);
		System.out.println("c1 = "+ass2TypeConv.c1);
		
		System.out.println("Integer to short :");
		System.out.println("x = "+ass2TypeConv.x);
		System.out.println("s1 = "+ass2TypeConv.s1);
		
		System.out.println("Short to int :");
		System.out.println("s2= "+s2);
		System.out.println("x1 = "+x1);
		System.out.println("s3= "+s3);
		System.out.println("x2 = "+x2);
		
		System.out.println("Short to float :");
		System.out.println("s2= "+s2);
		System.out.println("f3 = "+f3);
		System.out.println("s3= "+s3);
		System.out.println("f3 = "+f3);
		
		System.out.println("Short to double :");
		System.out.println("s2= "+s2);
		System.out.println("d2 = "+d2);
		System.out.println("s3= "+s3);
		System.out.println("d3 = "+d3);
		
		System.out.println("Short to char :");
		System.out.println("s2= "+s2);
		System.out.println("c3 = "+c3);
		System.out.println("s3= "+s3);
		System.out.println("c3 = "+c3);
		
		System.out.println("Short to byte :");
		System.out.println("s2= "+ass2TypeConv.s2);
		System.out.println("b1 = "+ass2TypeConv.b1);
		System.out.println("s3= "+ass2TypeConv.s3);
		System.out.println("b2 = "+ass2TypeConv.b2);
		
		ass2TypeConv.float_otherType();
		
		ass2TypeConv.Using_parseInt_otherType();
		
			
	}

}
