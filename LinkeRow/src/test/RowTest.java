package test;

import java.util.Random;

import stack.LinkedRow;

public class RowTest {

	public static void main(String[] args) {
		
		LinkedRow stack = new LinkedRow();
		
//		try {
//			stack.peek();
//		} catch (Exception e) {
//			System.out.println("A pilha está vazia!!!" + "\n" + e.toString());
//		}
		
//		Random rand = new Random();
//		
//		for (int i = 0; i < 5; i++) {
//			stack.push(rand.nextInt(10));
//		}
//		
//		try {
//			System.out.println("Peek: " + stack.peek());
//		} catch (Exception e) {
//			System.out.println("A pilha está vazia!!!" + "\n" + e.toString());
//		}

		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		stack.pop();
		System.out.println(stack.toString());
		
//		System.out.println("ToString: \n" + stack.toString());
//		
//		System.out.println("Pop: " + stack.pop() + "\n");
//		
//		System.out.println("ToString: \n" + stack.toString());
	}
}







