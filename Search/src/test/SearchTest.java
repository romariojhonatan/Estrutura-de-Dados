package test;

import java.util.Random;

import search.BinarySearch;
import search.RecursiveBinarySearch;
import sort.BubbleSort;

public class SearchTest {
	
	public static void main(String[] args) {
		
		int[] array = new int[10];
		
		Random rand = new Random();
		
		for (int i = 0; i < array.length; i++) {
		array[i] = rand.nextInt(100); 	
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println("\n");
		
		BubbleSort sort = new BubbleSort();
		array = sort.bubbleSorte(array);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println("\n");
		
		BinarySearch search = new BinarySearch();
		RecursiveBinarySearch recursive = new RecursiveBinarySearch();
		System.out.println(recursive.recursiveBinarySearch(array, 15));
		
	}

}
