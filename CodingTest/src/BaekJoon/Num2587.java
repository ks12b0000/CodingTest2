package BaekJoon;

import java.util.Scanner;

public class Num2587 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int tmp = 0;
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j] < arr[j - 1]) {
					tmp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println(sum / 5);
		System.out.println(arr[arr.length / 2]);
			
		
		sc.close();
	}
}
