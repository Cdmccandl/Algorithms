/*
 Conor McCandless 
 Spring 2020
 Algorithms Project 1: design an algorithm that determines all of the numbers that add up to 
 a target number n. The solution should not consider order (1+2+1 is the same as 2+1+1)
 
 referenced https://stackoverflow.com/questions/7331093/getting-all-possible-sums-that-add-up-to-a-given-number
 for determining a suitable recursive method to implement.
 */

import java.util.Scanner;
public class Project1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 0;
		System.out.print("Enter a number n: ");
		n = input.nextInt();
		int[] array = new int[n];
		
		recurse(1, n, array, 0);
		
		input.close();

	}
	
	public static void printArray(int[] array, int index) {
		
		for (int i = 0; i <index; i++) {
			System.out.print(array[i] + " ");
			
		}
		System.out.println();
	}
	
	public static void recurse(int i, int n, int[] array, int index) {
		int j;
		//base case: If n is 0 print array values up to index
		if (n == 0) {
			
			printArray(array, index);
		}
		
		//otherwise add elements to array
		for (j = i; j <= n; j++) {
			//place current element at current index in array
			array[index] = j;
		
		//recurse with reduced n and incremented index (index initially = 0)
		recurse(j, n - j, array, index + 1);
		
		}
	}

}
