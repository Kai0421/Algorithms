package sortAlgorithms;

import java.util.ArrayList;

/**
 * @description : Bubble sort is sorting by comparing the value to the next value perform the sorting.
 * @author Kai
 *
 */
public class BubbleSort extends BaseSortingAlgorithm {
	
	/**
	 * @description : Initialization method gets call if the number is an arrayList
	 * @param numberList
	 * @return
	 */
	public int[] initialization(ArrayList<Integer> numberList){
		
		int[] numberArray = new int[numberList.size()];
		int counter = 0;
		for (int i : numberList)
		{
			numberArray[counter] = i;
			counter++;
		}

		return numberArray;
	}
	
	/**
	 * @description : Bubble sort using loops
	 * @param numberArray
	 * @return
	 */
	public int[] loopsBubbleSorter(int[] numberArray){
		for (int b : numberArray)
			for (int i = 0; i < numberArray.length -1 ; i++)
			{
				if(numberArray[i] > numberArray[i+1])
				{
					//Temp variable provide a swapping process
					int temp = numberArray[i];
					numberArray[i] = numberArray[i+1];
					numberArray[i+1] = temp;
				}
			}
		
		return numberArray;
	}
	
	/**
	 * @description :  Sort with recursion
	 * @param numberArray // number array
	 * @param counter // Start 0
	 * @param max // numberArray Length but start with 0
	 * @return
	 */
	public int[] recursionBubbleSorter(int[] numberArray, int counter, int max, int arrayLength){
		
		if(!(recursionBreaker(counter, arrayLength)))
		{
			if(numberArray[counter] > numberArray[counter+1])
			{
				int temp = numberArray[counter];
				numberArray[counter] = numberArray[counter+1];
				numberArray[counter+1] = temp;
				counter++;
				recursionBubbleSorter(numberArray, counter, max, arrayLength);
			}
			else
			{
				counter++; 
				recursionBubbleSorter(numberArray, counter, max, arrayLength);
			}
		}
		return numberArray;
	}
	
	/**
	 * @description : Check if the number index is reach the last index of the numberarray then bump up the max score.
	 * @param max //is cause the recursive to loop the same number of times as the index.
	 * @param numberArrayLen
	 * @return
	 */
	public boolean recursionBreaker(int counter, int numberArrayLen){
		return counter >= numberArrayLen-1 ? true : false;
	}
}
