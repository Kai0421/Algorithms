package sortAlgorithms;

/**
 * @description : Selection sorting look through the entire array for the smallest element,
 * 				  once you find it you swap it (the smallest element) with the first element of the array. 
 * 				  Then you look for the smallest element in the remaining array (an array without the first element)
 * 				  and swap it with the second element. Then you look for the smallest element in the remaining array
 * 				  (an array without first and second elements) and swap it with the third element, and so on. 
 * @author Kai
 *
 */
public class SelectionSort extends BaseSortingAlgorithm {
	
	/**
	 * @description : Selection Sort with Loop
	 * @param numberArray
	 */
	public int[] loopSelectionSorter(int[] numberArray){
		int counter = 0;		
		for (int i = 0; i < numberArray.length; i++)
		{
			int indexOfSmallestValue = findSmallestValue(counter, numberArray);
			int temp = numberArray[counter];
			numberArray[counter] = numberArray[indexOfSmallestValue];
			numberArray[indexOfSmallestValue] = temp;
			
			counter++;
		}
		
		return numberArray;
	}
	
	/**
	 * @description : Find the smallest value in the array, and return the index of the value
	 * @param startValue
	 * @param numberArray
	 * @return
	 */
	private int findSmallestValue(int startValue, int[] numberArray){
		int smallestValueIndex = startValue;
		for (int i = startValue; i < numberArray.length; i++)
			if(numberArray[smallestValueIndex] > numberArray[i])
				smallestValueIndex = i;
		
		return smallestValueIndex;
	}
	
	/**
	 * @description : Recursion Selection Sorting
	 * @param numberArray
	 * @param counter
	 * @return
	 */
	public int[] recursionSelectionSorter(int[] numberArray, int counter){
		
		if(counter <= numberArray.length - 1)
		{
			int indexOfSmallestValue = findSmallestValue(counter, numberArray);
			int temp = numberArray[counter];
			numberArray[counter] = numberArray[indexOfSmallestValue];
			numberArray[indexOfSmallestValue] = temp;
			
			counter++;
			recursionSelectionSorter(numberArray, counter);
		}
		
		return numberArray;
	}
}
