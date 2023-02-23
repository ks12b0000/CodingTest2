package InflearnCodingTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Num6_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][2];
		for (int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		Arrays.sort(arr, new Comparator<int[]>() { // 더 알아봐야함.
			@Override
			public int compare(int[] n1, int[] n2) {
				if(n1[0] == n2[0])
                    return n1[1]-n2[1];
                else
                    return n1[0]-n2[0];
			}
		});
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}
}
