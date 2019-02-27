/*
 *	@author andrewcampagna
 *
 *	FEB 27, 2019.
 *
 *	Daily Code Challenge: 1
 */

import java.util.*;

public class Answer_20190227 {

	public static void main(String[] args) {

		int[] arr = { 10, 15, 3, 7 };
		int a = 0, b = 0, k = 48, sum = 0;
		arr = sort(arr);

		Deque<Integer> data = new ArrayDeque<>();

		// Load up our Deque

		for (int n: arr) {
			data.add(n);
		}

		// Algorithm

		while (data.peek() != null) {
			
			sum = data.peekFirst() + data.peekLast();
			
			// Breaks loop, and stores answer
			if (sum == k) {
				a = data.pollFirst();
				b = data.pollLast();
				break;
			} 

			// Removes from last if sum is too big
			else if (sum > k) {
				data.pollLast();
			}

			// Removes from first if sum is too small
			else {
				data.pollFirst();
			}

		}

		System.out.printf("(%d, %d)\n", a, b);
	}

	// Bubble sort

	public static int[] sort(int[] arr) {

		for (int i = 0; i < (arr.length - 1); i++) {
			for (int j = 0; j < (arr.length - i - 1); j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j + 1] = temp;
				}
			}
		}

		return arr;
	}
}