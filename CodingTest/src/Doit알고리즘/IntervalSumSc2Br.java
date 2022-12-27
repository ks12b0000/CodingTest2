package Doit알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IntervalSumSc2Br {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[A+1][A+1];
		
		for(int i = 1; i <= A; i++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int j = 1; j <= A; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int[][] arr1 = new int[A+1][A+1];
		for(int i = 1; i <= A; i++) {
			for(int j = 1; j <= A; j++) {
				arr1[i][j] = arr1[i-1][j] + arr1[i][j-1] - arr1[i-1][j-1] + arr[i][j];
			}
		}
		for(int i = 0; i < B; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			int result = arr1[x2][y2] - arr1[x1-1][y2] - arr1[x2][y1-1] + arr1[x1-1][y1-1];
			System.out.println(result);
		}
		
		
		br.close();

	}

}
