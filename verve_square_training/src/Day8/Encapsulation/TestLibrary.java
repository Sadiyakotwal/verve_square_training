package Day8.Encapsulation;

public class TestLibrary {

	public static void main(String[] args)
	{
		System.out.println("\tStudent Info");
		Library objLibrary = new Library();
		objLibrary.getStudentNo1("1");
		objLibrary.setName("Raj");
		objLibrary.setIdNum("101");
		objLibrary.setAge(23);
		objLibrary.setBookName("Harry potter");
		System.out.println("Name : " + objLibrary.getName() + "\tIDNum : " + objLibrary.getIdNum());
		System.out.print("Age : " + objLibrary.getAge() + "\tBookName : " + objLibrary.getBookName());
		objLibrary.getStudentNo1("2");
		objLibrary.setName("Riya");
		objLibrary.setIdNum("202");
		objLibrary.setAge(20);
		objLibrary.setBookName("Maths");
		System.out.println("Name : " + objLibrary.getName() + "\tIDNum : " + objLibrary.getIdNum());
		System.out.print("Age : " + objLibrary.getAge() + "\tBookName : " + objLibrary.getBookName());
	}

}
