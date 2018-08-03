
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class RemoveDups {

	static int [] example = {1,12,2,2,2,3,4,5,3,7,8,9,3,5,11,1};
	static String [] strExample = {"Fred", "Bert", "Harry", "Charles", "Fred", "fred", "Charles"};
	
	public static int[] IntegerArrayToInt(Integer[] array)
    {
        int[] g = new int[array.length];
        for(int i = 0; i < array.length; i++){
            g[i] = array[i];
        }
        return g;
    }
	public static Integer[] IntArrayToInteger(int [] array) {
		Integer[] g = new Integer[array.length];
		for(int i = 0; i < array.length; i++){
            g[i] = array[i];
        }
        return g;
	}
	
	public static void showOriginal(int [] eg){
		System.out.println("Original array containes ");
		for (int i = 0; i < eg.length; i++) {
			System.out.printf(" %d, ", eg[i]);
		}
		System.out.println("");
	}
	
	public static void showOutcome(int [] eg){
		System.out.println("Outcome array containes ");
		for (int i = 0; i < eg.length; i++) {
			System.out.printf(" %d, ", eg[i]);
		}
		System.out.println("");
	}
	public static int [] removeDupsNoCollection(int [] duparray) {
		int len = duparray.length;
		int [] answer = new int[len];
		int k = 0;
		
		// loop around just once
		for (int i=0; i < len; i++) {
			int tmp = duparray[i];
			boolean found = false;
			int j=0;
			//now loop around output array to make unique
			while (j < len && !found) {
				if (answer[j] == tmp) {
					found = true;
				}
				j++;
			}
			if (!found) answer[k++] = tmp;
		}
		return answer;
	}
	
	public static int [] removeDupCollections(int [] duparray) {
		Integer [] classcopy = IntArrayToInteger(duparray);
			
		List<Integer> nlist = Arrays.asList(classcopy);
		Set<Integer> nset = new HashSet<Integer>(nlist);
		
		Integer [] result = new Integer[nset.size()];
		nset.toArray(result);
		
		int [] returnval = IntegerArrayToInt(result);		
		return returnval;
		
	}
	
	public static void main(String[] args) {
		
		showOriginal(example);
		int [] result = removeDupsNoCollection(example);
		showOutcome(result);

		int [] collresult = removeDupCollections(example);
		showOutcome(collresult);
	}

}
