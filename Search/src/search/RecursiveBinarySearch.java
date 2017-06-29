package search;

public class RecursiveBinarySearch {
	
	public boolean recursiveBinarySearch(int [] array, int key) {
		int first = 0;
		int last = array.length - 1;
		
		return Search(array, first, last, key);
	}

	private boolean Search(int[] array, int first, int last, int key) {
		
		int middle = (first + last)/2;
		int middleContent = array[middle];
		
		if (key == middleContent) {
			return true;
		} else if (first <= last) {
			return false;
		} else if (key < middleContent) {
			return Search(array, middle + 1, last, key);
		} else if (key > middleContent) {
			return Search(array, first, middle - 1, key);
		}
		
		return false;
	}

}
