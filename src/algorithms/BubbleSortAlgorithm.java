package algorithms;

import java.util.ArrayList;

public class BubbleSortAlgorithm {
	
	/**
	 * Initialization method gets call if the number is an arrayList
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
	 * Bubble sort using loops
	 * @param numberArray
	 * @return
	 */
	public int[] SortingProcessWithLoop(int[] numberArray){
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
	 * Sort with recursion
	 * @param numberArray // number array
	 * @param counter // Start 0
	 * @param max // numberArray Length but start with 0
	 * @return
	 */
	public int[] SortProcessWithRecursive(int[] numberArray, int counter, int max, int arrayLength){
		
		if(!(recursionBreaker(counter, arrayLength))){

			if(numberArray[counter] > numberArray[counter+1])
			{
				int temp = numberArray[counter];
				numberArray[counter] = numberArray[counter+1];
				numberArray[counter+1] = temp;
				counter++;
				SortProcessWithRecursive(numberArray, counter, max, arrayLength);
			}
			else
			{
				counter++; 
				SortProcessWithRecursive(numberArray, counter, max, arrayLength);
			}
		}
		return numberArray;
	}
	
	/**
	 * Check if the number index is reach the last index of the numberarray then bump up the max score.
	 * @param max //is cause the recursive to loop the same number of times as the index.
	 * @param numberArrayLen
	 * @return
	 */
	public boolean recursionBreaker(int counter, int numberArrayLen){
		return counter >= numberArrayLen-1 ? true : false;
	}
	
	/**
	 * print out Array of numbers
	 * @param n
	 */
	public void print(String title, int[] n){
		System.out.println(title);
		for(int i : n)
			System.out.print(i);
		
		System.out.println();
	}
}
