
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;




public class WithCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // A string array with duplicate values
	    String[] data = { "A", "C", "B", "D", "A", "B", "E", "D", "B", "C" };
	    System.out.println("Original array         : " + Arrays.toString(data));

	    List<String> list = (List<String>) Arrays.asList(data);
	    Set<String> set = new HashSet<String>(list);

	    System.out.print("Remove duplicate result: ");

	    String[] result = new String[set.size()];
	    set.toArray(result);
	    for (String s : result) {
	      System.out.print(s + ", ");
	    }
	    
	    
	    Integer[] numbers = { 7, 7, 8, 9, 10, 8, 8, 9, 6, 5, 4 };
	    System.out.println("");
	    System.out.println("Original array         : " + Arrays.toString(numbers));
	    
	    List<Integer> nlist = Arrays.asList(numbers);
	    Set<Integer> nset = new HashSet<Integer>(nlist);
	    System.out.print("Remove duplicate result: ");
	    for (Iterator iterator = nset.iterator(); iterator.hasNext();) {
	      Object o = iterator.next();
	      System.out.print(o + ", ");
	    }
	}

}
