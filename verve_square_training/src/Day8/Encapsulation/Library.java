package Day8.Encapsulation;

public class Library 
{
	   private String strName;
	   private String strIdNum;
	   private int intAge;
	   private String strBooKIssued;

	   public int getAge() {
	      return intAge;
	   }

	   public String getName() {
	      return strName;
	   }

	   public String getIdNum() {
	      return strIdNum;
	   }
	   public String getBookName() {
		      return strBooKIssued;
		   }

	   public void setAge(int newAge) {
		   intAge = newAge;
	   }

	   public void setName(String newName) {
		   strName = newName;
	   }

	   public void setIdNum(String newId) {
		   strIdNum = newId;
	   }
	   public void setBookName(String newBook) {
		   strBooKIssued  = newBook;
	   }

	public void getStudentNo1(String strNo)
	{
		System.out.println("\nStudent :"+strNo);
	}
		
	
}
