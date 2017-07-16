package sortAlgorithms;

/**
 * @description : Base class where all the sorting algorithm inherits to.
 * 
 * @author Kai
 *
 */

public class BaseSortingAlgorithm {
	
	/**
	 * @description : print out Array of numbers
	 * @param n
	 */
	public void print(String title, int[] n){
		System.out.println(title);
		for(int i : n)
			System.out.print(i);
		
		System.out.println();
	}
}
