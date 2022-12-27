package Doit알고리즘;

import java.util.Scanner;

public class AvgArr {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[scan.nextInt()];
		int max = 0;
		double sum = 0.0;
		
		for(int i = 0; i < A.length; i++) {
			int B = scan.nextInt();
			
			if(B > max) {
				max = B;
			}
			sum += B;
		}
		System.out.println(((sum/max)*100)/A.length);
		
		
		scan.close();

	}

}
