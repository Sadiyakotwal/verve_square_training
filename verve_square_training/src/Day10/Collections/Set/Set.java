package Day10.Collections.Set;
/*To check the books in library*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Set 
{
	
	//Set
	 HashSet<String> set1 = new HashSet<String>();
	 List<String> list = new ArrayList<String>();

	 public void testList()
	 {
		 list.add("Harry potter");    
		 list.add("A tale of 2 cities");    
		 list.add("Bible");   
		 list.add("The mirror and the light");  
		 list.add("Bible");  
         System.out.println("Duplicate entries are present in list:\n"+list);
	 }
	 public void testSet()
	 {
		 set1.add("Harry potter");    
         set1.add("A tale of 2 cities");    
         set1.add("Bible");   
         set1.add("The mirror and the light");  
         set1.add("Bible");  
         System.out.println("Duplicate entries are removed in set:\n"+set1);
	 }
	
}
