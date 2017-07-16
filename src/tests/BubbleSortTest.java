package tests;

import algorithms.BubbleSortAlgorithm;

public class BubbleSortTest {
	private BubbleSortAlgorithm bsa = new BubbleSortAlgorithm();
	private final int[] numbers = { 1, 4, 2, 3, 4, 7 };

	public BubbleSortTest() {
		loopBubbleSorter("Loop Bubble Sorter");
		recursiveBubbleSorter("Recursive Bubble Sorter");
	}
	
	private void loopBubbleSorter(String title) {
		bsa.print(title, bsa.SortingProcessWithLoop(numbers));
	}
	
	private void recursiveBubbleSorter(String title){
		bsa.print(title, bsa.SortProcessWithRecursive(numbers, 0, 0, numbers.length));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BubbleSortTest();
	}
}
