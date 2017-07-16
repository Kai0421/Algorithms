package tests;

import sortAlgorithms.BubbleSort;

/**
 * 
 * @author Kai
 *
 */
public class BubbleSortTest {
	private BubbleSort bs = new BubbleSort();
	private final int[] numbers = { 1, 4, 2, 3, 4, 7, 1 };

	public BubbleSortTest() {
		loopBubbleSorter("Loop Bubble Sorter");
		recursiveBubbleSorter("Recursive Bubble Sorter");
	}
	
	private void loopBubbleSorter(String title) {
		bs.print(title, bs.loopsBubbleSorter(numbers));
	}
	
	private void recursiveBubbleSorter(String title){
		bs.print(title, bs.recursionBubbleSorter(numbers, 0, 0, numbers.length));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BubbleSortTest();
	}
}
