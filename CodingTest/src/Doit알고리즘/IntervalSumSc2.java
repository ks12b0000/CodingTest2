package Doit알고리즘;

import java.util.Scanner;

public class IntervalSumSc2 {

	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();			//4
		int B = scan.nextInt();			//3
			
		int[][] arr = new int[A+1][A+1];		//arr[5][5]
		
		for(int i = 1; i <= A; i++) {
			for(int j = 1; j <= A; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		int[][] arr1 = new int[A+1][A+1];
		
		for(int i = 1; i <= A; i++) {
			for(int j = 1; j <= A; j++) {
				arr1[i][j] = arr1[i][j-1] + arr1[i-1][j] - arr1[i-1][j-1] + arr[i][j];
				/*
				 * arr1[2][1] = arr1[2][0] + arr1[1][1] - arr1[1][0] + arr[2][1] = 3
				 * 					0			1				0			2 
				 * arr1[3][4] = arr1[3][3] + arr1[2][4] - arr1[2][3] + arr[3][4] = 42
				 * 					27			24  		15				6
				 */
			}
		}
		for(int i = 0; i < B; i++) {
			int x1 = scan.nextInt();
			int y1 = scan.nextInt();
			int x2 = scan.nextInt();
			int y2 = scan.nextInt();
			
			int result = arr1[x2][y2] - arr1[x1-1][y2] - arr1[x2][y1-1] + arr1[x1-1][y1-1]; 
			System.out.println(result);
			/*
			 * x1 = 2 y1 = 2 x2 = 3 y2 = 4  arr1[2][2] ~ arr1[3][4] 까지의 구간 합
			 * arr1[3][4] - arr1[1][4] - arr1[3][1] + arr1[1][1] = 27
			 * 	42				10			6				1	
			 */
		}
		
		
		
		scan.close();
		
	}

}
