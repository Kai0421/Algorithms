package tests;

import sortAlgorithms.SelectionSort;

public class SelectionSortTest {
	
	private SelectionSort ss = new SelectionSort();
	private final int[] numbers = { 1, 4, 2, 3, 4, 7, 1 };
	
	public SelectionSortTest(){
		//loopSelectionSorter();
		recursiveSelectionSorter();
	}
	
	public void loopSelectionSorter(){
		ss.print("Looper Selection Sorter", ss.loopSelectionSorter(numbers));
	}
	
	public void recursiveSelectionSorter(){
		ss.print("Recursive Selection Sorter", ss.recursionSelectionSorter(numbers, 0));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SelectionSortTest();
	}
}
