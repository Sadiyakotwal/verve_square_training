package Day9.Exception.handlig;

import java.io.FileNotFoundException;

public class TestExceptionHandling {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException 
	{
		WithExceptionHandling objWithExceptionHandling = new WithExceptionHandling();
		//With Exception handling
		objWithExceptionHandling.verifyArrayWithExceptionHandling(7);
		objWithExceptionHandling.verifyStringIndexExceptionHandling();
		//To check finally block
		//objWithExceptionHandling.verifyArrayWithExceptionHandling(2);
		objWithExceptionHandling.verifyFileWithException();
		objWithExceptionHandling.verifyNullPointerWithException();
		objWithExceptionHandling.verifyNumberFormatWithExceptionHandling();
	}

	
	
	
}
