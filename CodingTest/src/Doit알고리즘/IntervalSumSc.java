package Doit알고리즘;

import java.util.Scanner;

public class IntervalSumSc {

	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();			//5
		int B = scan.nextInt();			//3
		
		int[] arr = new int[A+1];		//arr[6]   사람이 입력할땐 0번째 자리부터가 아니라 1번째 자리부터 입력하는걸로 인식하기 때문에 
										//		   배열에 1을 더해주어서 배열 6개를 만든 후 0~5번째 자리 값을 만들어줌.
										//		  근데 우리는 1~5번째 자리값에만 입력해야 되므로 0번째는 입력을 넣어주지 않고 0으로만듦 
		for(int i = 1; i <= A; i++) {						//		for(int i = 0; i < A; i++) {															
			arr[i] = arr[i-1] + scan.nextInt();				//			arr[i+1] = arr[i] + scan.nextInt();
			/*												//		}
			 * arr[0] = 0;
			 * arr[1] = arr[0] + 5   = 5
			 * arr[2] = arr[1] + 4   = 9
			 * arr[3] = arr[2] + 3   = 12
			 * arr[4] = arr[3] + 2   = 14
			 * arr[5] = arr[4] + 1   = 15
			 */
		}
		for(int i = 0; i < B; i++) {
			int C = scan.nextInt();
			int D = scan.nextInt();
			
			System.out.println(arr[D] - arr[C-1]);
			/*
			 *  C = 1  D = 3
			 *  arr[1] ~ arr[3] 구간의 합 = arr[3] - arr[0] = 12
			 * 								12      0
			 *  C = 2  D = 4
			 *  arr[2] ~ arr[4] 구간의 합 = arr[4] - arr[1] = 9
			 *  							14      5
			 *  C = 5  D = 5
			 *  arr[5] ~ arr[5] 구간의 합 = arr[5] - arr[4] = 1
			 *  							15 	    14
			 */
		}
		
		
		
		scan.close();
		
	}

}

