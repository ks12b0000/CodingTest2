package BaekJoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Num10812 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			arr.add(i);
		}
		
		for (int q = 0; q < m; q++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			
			int begin = arr.get(i - 1);
			int mid = arr.get(k - 1);
			
			while(begin != mid) {
                arr.remove(i - 1);
                arr.add(j - 1, begin);
                begin = arr.get(i - 1);
            }
			
		}
		
		for (int x : arr) {
			System.out.print(x + " ");
		}
		
		sc.close();
	}
}
