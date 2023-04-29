package BaekJoon;

import java.util.Scanner;

public class Num9063 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int yMax = Integer.MIN_VALUE;
		int yMin = Integer.MAX_VALUE;
		int xMax = Integer.MIN_VALUE;
		int xMin = Integer.MAX_VALUE;
		
		
		for (int i = 0; i < n; i++) {
			int y = sc.nextInt();
			int x = sc.nextInt();
			yMax = Math.max(yMax, y);
			yMin = Math.min(yMin, y);
			xMax = Math.max(xMax, x);
			xMin = Math.min(xMin, x);
		}
		
		System.out.println((yMax - yMin) * (xMax - xMin));
		
		sc.close();
	}
}	
